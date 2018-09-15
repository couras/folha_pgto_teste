package com.code200Dev.teste_folha_pagamento;

public class Funcionario {
	private String nome;
	private int numeroDependentes = 0;
	
	public Funcionario(String nome, int numeroDependentes) {
		this.nome = nome;
		this.numeroDependentes = numeroDependentes;
	}
	
	
	public int getNumeroDependentes() {
		return numeroDependentes;
	}
	
}
