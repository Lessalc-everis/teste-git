package br.com.alura.tdd.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.alura.tdd.service.ReajusteService;

public class Funcionario {

	private String nome;
	private LocalDate dataAdmissao;
	private BigDecimal salario;

	public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
		this.nome = nome;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataAdmissao() {
		return dataAdmissao;
	}

	public BigDecimal getSalario() {
		return salario.setScale(2, RoundingMode.HALF_UP);
	}
	
	public void reajustaSalario(BigDecimal reajuste) {
		this.salario = this.salario.add(reajuste);
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}
	

}
