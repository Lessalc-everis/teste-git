package br.com.alura.tdd.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	
	public void calcularBonusReajuste(Funcionario funcionario, Desempenho desempenho) {
		BigDecimal valor = BigDecimal.ZERO;
		valor = funcionario.getSalario().multiply(desempenho.percentualReajuste());
	
		funcionario.reajustaSalario(valor);
	}
}
