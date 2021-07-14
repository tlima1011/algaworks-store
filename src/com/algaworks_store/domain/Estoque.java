package com.algaworks_store.domain;

public class Estoque {
	
	private String produto; 
	private Double preco; 
	private Integer quantidade; 
	
	public Estoque() {
		
	}

	public Estoque(String produto, Double preco, Integer quantidade) {
		this.produto = produto;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public void qtdeTotal(Estoque [] estoque){
		System.out.printf("Quantidade produtos: %d\n", estoque.length);
		double sum = 0.0; 
		double precoTotal = 0.0; 
		for(int i = 0; i < estoque.length;i++) {
			System.out.println("================================");
			System.out.printf(" Produto %d\n", i + 1);
			System.out.println("================================");
			System.out.println("Nome: " +estoque[i].getProduto());
			System.out.println("Quantidade: " +estoque[i].getQuantidade());
			System.out.println("Preco R$" +String.format("%.2f", estoque[i].getPreco()));
			sum = estoque[i].getPreco() * estoque[i].getQuantidade();
			precoTotal += sum; 
			System.out.println("Sub Total R$" +String.format("%.2f", sum));			
		}
		System.out.println("================================");
		System.out.println("Preco Total R$" +String.format("%.2f", precoTotal));
		System.out.println("================================");
	}
	

}
