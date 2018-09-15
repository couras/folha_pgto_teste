package com.code200Dev.teste_folha_pagamento;

import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class RhEmpresa {
	
	private List<FolhaPagamento> folhas;
	
	public RhEmpresa() {
		folhas = new ArrayList<FolhaPagamento>();
	}
	
	private double descontoIR;
	private double salarioBruto;
	private double descontoINSS;
	private double salarioLiquido;
	
	public void calculaFolhaPgto() {
		for(FolhaPagamento folha : folhas) {
			this.calculaSalarioBruto(folha.getQtdeHorasTrabalhadas(), folha.getValorHora(), folha.getFuncionario().getNumeroDependentes());
			this.calculaDescontoINSS(this.salarioBruto);
			this.calculaDescontoIR(this.salarioBruto);
			this.calculaSalarioLiquido(this.salarioBruto, this.descontoINSS, this.descontoIR);
		}
	}
	
	private void calculaSalarioBruto(int horasTrabalhadas, double salarioHora, int numDependentes) {
		this.salarioBruto = (horasTrabalhadas * salarioHora) + (50 * numDependentes);
	}
	
	private void calculaDescontoINSS(double salarioBruto) {
		this.descontoINSS = salarioBruto <= 1000.0 ? (salarioBruto * (8.5/100)) : (salarioBruto * (9.0/100));
	}
	
	private void calculaDescontoIR(double salarioBruto) {
		this.descontoIR = salarioBruto <= 500.0 ? 0 : ((salarioBruto > 500.0 && salarioBruto <= 1000.0) ? (salarioBruto * (5.0 / 100)) : (salarioBruto * (7.0 / 100)));
	}
	
	private void calculaSalarioLiquido(double salarioBruto, double descontoINSS, double descontoIR) {
		this.salarioLiquido = salarioBruto - (descontoINSS + descontoIR);
	}
	
	public void adicioNaFolha(FolhaPagamento folha) {
		this.folhas.add(folha);
	}

	public double getDescontoIR() {
		return descontoIR;
	}

	public double getSalarioBruto() {
		return salarioBruto;
	}

	

	public double getDescontoINSS() {
		return descontoINSS;
	}

	

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	
}
