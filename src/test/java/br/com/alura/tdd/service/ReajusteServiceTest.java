package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	private Funcionario func;
	private ReajusteService reajuste;
	
	@BeforeEach
	public void inicializar() {
		func = new Funcionario("Luciano", LocalDate.now(), new BigDecimal("4500.00"));
		reajuste = new ReajusteService();
	}
	
	@AfterEach
	public void finalizar() {
		System.out.println("Fim!");
	}

	@Test
	void calcularBonusQuandoDesempenhoForADesejar() {
		reajuste.calcularBonusReajuste(func, Desempenho.A_DESEJAR);
		assertEquals(new BigDecimal("4635.00"), func.getSalario());
	}
	
	@Test
	void calcularBonusQuandoDesempenhoForBom() {	
		reajuste.calcularBonusReajuste(func, Desempenho.BOM);		
		assertEquals(new BigDecimal("5175.00"), func.getSalario());
	}

	@Test
	void calcularBonusQuandoDesempenhoForOtimo() {	
		reajuste.calcularBonusReajuste(func, Desempenho.OTIMO);
		assertEquals(new BigDecimal("5400.00"), func.getSalario());
	}
	
}
