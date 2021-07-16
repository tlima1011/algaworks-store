package com.algaworks_store.application;

import java.util.Locale;
import java.util.Scanner;

import com.algaworks_store.domain.Estoque;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Quantos Produtos você quer cadastrar?: ");
		int qtde = sc.nextInt();
		
		Estoque [] produtos = new Estoque[qtde]; 
		Estoque e = new Estoque(); 
		
		for(int i = 0; i < produtos.length;i++) {
			produtos[i] = new Estoque();
			sc.nextLine();
			System.out.printf("Informe dados do %dº produto\n", i + 1);
			System.out.print("Nome: ");
			String nome = sc.nextLine(); 
			System.out.print("Valor do Produto R$");
			Double preco = sc.nextDouble(); 
			System.out.print("Quantidade: ");
			Integer quantidade = sc.nextInt(); 
			produtos[i].setProduto(nome);
			produtos[i].setPreco(preco);
			produtos[i].setQuantidade(quantidade);
		}
		e.qtdeTotal(produtos);			
				
		sc.close();
	}

}
