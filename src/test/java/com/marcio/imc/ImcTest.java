package com.marcio.imc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImcTest {

    @Test
    public void testeMulherAbaixoPeso() {
        Imc imc = new Imc(19.0f, 1.0f, "F");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    public void testeMulherNoPesoNormal() {
        Imc imc = new Imc(25.7f, 1.0f, "F");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    public void testeMulherMarginalmenteAcimaDoPeso() {
        Imc imc = new Imc(27.2f, 1.0f, "F");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    public void testeMulherAcimaDoPesoIdeal() {
        Imc imc = new Imc(32.2f, 1.0f, "F");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    public void testeMulherObesa() {
        Imc imc = new Imc(32.4f, 1.0f, "F");
        assertEquals("obesa", imc.calcularImc());
    }

    @Test
    public void testeHomemAbaixoPeso() {
        Imc imc = new Imc(20.6f, 1.0f, "M");
        assertEquals("abaixo do peso", imc.calcularImc());
    }

    @Test
    public void testeHomemNoPesoNormal() {
        Imc imc = new Imc(26.3f, 1.0f, "M");
        assertEquals("no peso normal", imc.calcularImc());
    }

    @Test
    public void testeHomemMarginalmenteAcimaDoPeso() {
        Imc imc = new Imc(27.7f, 1.0f, "M");
        assertEquals("marginalmente acima do peso", imc.calcularImc());
    }

    @Test
    public void testeHomemAcimaDoPesoIdeal() {
        Imc imc = new Imc(31.0f, 1.0f, "M");
        assertEquals("acima do peso ideal", imc.calcularImc());
    }

    @Test
    public void testeHomemObesa() {
        Imc imc = new Imc(31.1f, 1.0f, "M");
        assertEquals("obeso", imc.calcularImc());
    }
}