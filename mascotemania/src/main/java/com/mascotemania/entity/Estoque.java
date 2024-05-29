package com.mascotemania.entity;

import java.util.HashMap;

public class Estoque {
    private HashMap<String, Integer> estoque;

    public Estoque() {
        estoque = new HashMap<>();
    }

    public void adicionarProduto(String produto, int quantidade) {
        if (estoque.containsKey(produto)) {
            estoque.put(produto, estoque.get(produto) + quantidade);
        } else {
            estoque.put(produto, quantidade);
        }
    }

    public void removerProduto(String produto, int quantidade) {
        if (estoque.containsKey(produto)) {
            int quantidadeAtual = estoque.get(produto);
            if (quantidadeAtual > quantidade) {
                estoque.put(produto, quantidadeAtual - quantidade);
            } else {
                estoque.remove(produto);
            }
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    public void listarEstoqueValores() {
        System.out.println("Estoque:");
        for (String produto : estoque.keySet()) {
            String valor; 
            int id;
            if (produto.equalsIgnoreCase("Ração")) {
                valor = "25";
                id = 1;
            } else if (produto.equalsIgnoreCase("Remédio")) {
                valor = "15";
                id = 2;
            } else if (produto.equalsIgnoreCase("Brinquedo")) {
                valor = "50";
                id = 3;
            } else if (produto.equalsIgnoreCase("Cama")) {
                valor = "100";
                id = 4;
            } else if (produto.equalsIgnoreCase("Coleira")) {
                valor = "30";
                id = 5;
            } else {
                id = -1;
                valor = "Produto indisponível para compra";
            }
            System.out.println(id + " - " + produto + " - preço: " + valor + " - quantidade no estoque: " + estoque.get(produto));
        }
    }

    public HashMap<String, Integer> getEstoque() {
        return  this.estoque;
    }

    public void listarEstoque() {
        System.out.println("Estoque:");
        for (String produto : estoque.keySet()) {
            System.out.println(produto + ": " + estoque.get(produto));
        }
    }
}
