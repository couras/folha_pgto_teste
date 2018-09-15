package com.code200Dev.teste_folha_pagamento;

public class CriadorFolhaPgto {
	private Funcionario func;
	private RhEmpresa rh;
	
	public CriadorFolhaPgto() {
		
	}
	
	public CriadorFolhaPgto createFuncionario(String nome, int qtdeDependentes) {
		this.func = new Funcionario(nome, qtdeDependentes);
		return this;
	}
	
	public CriadorFolhaPgto createFolhaPgto(int qtdeHorasTrabalhadas, double valorHora) {
		rh = new RhEmpresa();
		rh.adicioNaFolha(new FolhaPagamento(this.func, qtdeHorasTrabalhadas, valorHora));
		return this;
	}
	
	public RhEmpresa constroi() {
		return rh;
	}
}
