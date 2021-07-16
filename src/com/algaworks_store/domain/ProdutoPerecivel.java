package com.algaworks_store.domain;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ProdutoPerecivel extends Produto{
	
	protected LocalDate dataFabricacao; 
	
	public void setdataFabricacao(LocalDate dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	@Override
	public void identificar() { 
		super.identificar();
		DateTimeFormatter formatadao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dataValidade = dataFabricacao.plusMonths(3);
		Period periodo = Period.between(dataFabricacao, dataValidade);
		int meses = periodo.getMonths();
		System.out.println("Minha data de fabricação é: " +dataFabricacao.format(formatadao));
		System.out.println("Data de vencimento: " +dataValidade.format(formatadao));
		System.out.println("Número de Meses: " +meses);
	}
	
}
