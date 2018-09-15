package com.code200Dev.teste_folha_pagamento;

public class FolhaPagamento {
	
	private Funcionario funcionario;
	private int qtdeHorasTrabalhadas;
	private double valorHora;
	
	public FolhaPagamento(Funcionario funcionario, int qtdeHorasTrabalhadas, double valorHora) {
		this.funcionario = funcionario;
		this.qtdeHorasTrabalhadas = qtdeHorasTrabalhadas;
		this.valorHora = valorHora;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	

	public int getQtdeHorasTrabalhadas() {
		return qtdeHorasTrabalhadas;
	}

	

	public double getValorHora() {
		return valorHora;
	}

	
	
	
}
