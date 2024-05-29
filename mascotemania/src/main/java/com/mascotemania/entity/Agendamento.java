package com.mascotemania.entity;

import java.util.ArrayList;

public class Agendamento {
    private String id;
    private Pet pet;
    private String unidade;
    private ArrayList<String> servicos;
    private String data;
    private String horario;
    private float preco;


    public Agendamento(String id, Pet pet, String unidade, String data, String horario, float preco) {
        this.id = id;
        this.pet = pet;
        this.unidade = unidade;
        this.servicos = new ArrayList<String>();
        this.data = data;
        this.horario = horario;
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

    public String getUnidade() {
        return unidade;
    }
    
    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public ArrayList<String> getServicos() {
        return servicos;
    }
    
    public void addServicos(String servico) {
        servicos.add(servico);
    }

    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }

   public String getHorario() {
        return horario;
    }
    
    public void setHorario(String horario) {
        this.horario = horario;
    }

    public float getPreco() {
        return preco;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
