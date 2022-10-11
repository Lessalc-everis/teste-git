package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class BonusServiceTest {

	@Test
	void calcularBonusQuandoValorEhInferiorAMil() {
		Funcionario func = new Funcionario("Luciano", LocalDate.now(), new BigDecimal("4500.00"));
		BonusService bonus = new BonusService();
		
		Assertions.assertEquals(new BigDecimal("450.00"), bonus.calcularBonus(func));		
	}
	
	@Test
	void bonusDeveriaSerZeroParaFuncionariosComSalarioMuitoAlto() {
		Funcionario func = new Funcionario("Luciano", LocalDate.now(), new BigDecimal("45000.00"));
		BonusService bonus = new BonusService();
		
		Assertions.assertThrows(IllegalArgumentException.class, () ->  bonus.calcularBonus(func));
	}
	
	@Test
	void bonusDeveriaSerMil() {
		Funcionario func = new Funcionario("Luciano", LocalDate.now(), new BigDecimal("10000.00"));
		BonusService bonus = new BonusService();
		
		Assertions.assertEquals(new BigDecimal("1000.00"), bonus.calcularBonus(func));	
	}
	
	
	
	
	

}
