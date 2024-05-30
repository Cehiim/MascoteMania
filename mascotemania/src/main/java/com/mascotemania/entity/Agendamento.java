package com.mascotemania.entity;

public class Agendamento {
    private String id;
    private Pet pet;
    private String servico;
    private String data;
    private float preco;


    public Agendamento(String id, Pet pet, String servico, String data, float preco) {
        this.id = id;
        this.pet = pet;
        this.servico = servico;
        this.data = data;
        this.preco = preco;
    }

    public String getId() {
        return id;
    }

    public Pet getPet() {
        return pet;
    }
    
    public void setPet(Pet pet) {
        this.pet = pet;
    }
    
    public String getServicos() {
        return servico;
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
