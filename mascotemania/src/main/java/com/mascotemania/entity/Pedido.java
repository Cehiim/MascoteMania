package com.mascotemania.entity;

public class Pedido {
    private int id;
    private String produto;
    private int quantidade;
    private double preco;
    private String status;

    public Pedido(int id, String produto, int quantidade, double preco, String status) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public String getProduto() {
        return this.produto;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
