package com.example.provappunit.model;

public class IMC {
	private float altura;
	private float peso;
	private float imc;
	private String resultado;
	
	public IMC(float altura, float peso) {
		this.imc = peso / (altura * altura);
	}
	
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getImc() {
		return imc;
	}
	public void setImc(float imc) {
		this.imc = imc;
	}
	public String getResultado() {
		
		if(imc < 18.5) {
            this.resultado = "IMC = " + imc + ", Você está abaixo do peso: Risco elevado.";
        }else if(imc >= 18.5 && imc < 25) {
            this.resultado = "IMC = " + imc + ", Você está com o peso ideal: Não corre risco!";
        }else if(imc >= 25 && imc < 30) {
            this.resultado = "IMC = " + imc + ", Você está com excesso de peso: Risco elevado";
        }else if(imc >= 30 && imc < 35) {
            this.resultado = "IMC = " + imc + ", Você está com Obesidade Grau 1: Risco muito elevado.";
        }else if(imc >= 35 && imc < 40) {
            this.resultado = "IMC = " + imc + ", Você está com Obesidade Grau 2: Risco muitíssimo elevado";
        }else if(imc >= 40) {
            this.resultado = "IMC = " + imc +", Você está com Obesidade Grau 3: Risco de obesidade mórbida!";
        }
        
		
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	
	}
}
