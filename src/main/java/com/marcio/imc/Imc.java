package com.marcio.imc;

import java.util.Objects;

public class Imc {
    
    private float altura;
    private float peso;
    private String sexo;

    public Imc(float peso, float altura, String sexo) {
        this.peso = peso;
        this.altura = altura;
        this.sexo = sexo;
    }

    public String calcularImc() {
        float valor = this.peso / (this.altura * this.altura);
        if(Objects.equals(this.sexo, "M")){
            if(valor<20.7)  {
                return "abaixo do peso";
            }
            else if(valor<26.4)  {
                return "no peso normal";
            }
            else if(valor<27.8)  {
                return "marginalmente acima do peso";
            }
            else if(valor<31.1)  {
                return "acima do peso ideal";
            }
            else return "obeso";
        }else if(Objects.equals(this.sexo, "F")){
            if(valor<19.1){
                return "abaixo do peso";
            }
            else if(valor<25.8){
                return "no peso normal";
            }
            else if(valor<27.3){
                return "marginalmente acima do peso";
            }
            else if(valor<32.3){
                return "acima do peso ideal";
            }
            else return "obesa";
        }
        return null;

    }
    public String getSexo() {
            return sexo;
    }
    public float getAltura() {
        return altura;
    }
    public float getPeso() {
        return peso;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setPeso(float peso) {
        this.peso = peso;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
