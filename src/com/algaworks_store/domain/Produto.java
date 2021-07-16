package com.algaworks_store.domain;

public class Produto {
	
	protected String descricao; 
		
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void identificar() { 
		System.out.println("Minha descrição é: " +descricao);
	}
}
