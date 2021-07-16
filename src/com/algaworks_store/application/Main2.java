package com.algaworks_store.application;

import java.time.LocalDate;

import com.algaworks_store.domain.ProdutoPerecivel;

public class Main2 {

	public static void main(String[] args) {
		
		ProdutoPerecivel pp = new ProdutoPerecivel(); 
		
		LocalDate now = LocalDate.now(); 
			
		pp.setdataFabricacao(now);		
		
		pp.setDescricao("Carne perecivel menino");
		pp.identificar();
		
	}
}
