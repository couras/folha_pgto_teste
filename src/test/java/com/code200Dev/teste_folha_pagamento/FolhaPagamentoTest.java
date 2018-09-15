package com.code200Dev.teste_folha_pagamento;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FolhaPagamentoTest {
	
	private RhEmpresa rh;
	private Funcionario funcionario1;
	private Funcionario funcionario2;
	private Funcionario funcionario3;
	private FolhaPagamento folha;
	
	@Before
	public void init() {
		rh = new RhEmpresa();
		funcionario1 = new Funcionario("Jonhy", 3);
		funcionario2 = new Funcionario("Catra", 32);
		funcionario2 = new Funcionario("Mary Currie", 2);
	}
	
	@Test
	public void calculaSalario() {
		rh.adicioNaFolha(new FolhaPagamento(funcionario1, 160, 150.0));
		//rh.adicioNaFolha(new FolhaPagamento(funcionario2, 44, 28.0));
		//rh.adicioNaFolha(new FolhaPagamento(funcionario3, 36, 48.0));
		rh.calculaFolhaPgto();
		
		assertEquals(24150.00, rh.getSalarioBruto(), 0.0001);
        assertEquals(20286.00, rh.getSalarioLiquido(), 0.0001);
        assertEquals(2173.50, rh.getDescontoINSS(), 0.0001);
        assertEquals(1690.50, rh.getDescontoIR(), 0.0001);
	}
}
