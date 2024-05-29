package com.mascotemania.entity;

import java.util.ArrayList;

public class Cliente {
    private String id;
    private String senha;
    private String primeiroNome;
    private String ultimoNome;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Pet> pets;
    private ArrayList<Agendamento> agendamentos;

    public Cliente(String id, String senha, String primeiroNome, String ultimoNome, ArrayList<Pedido> pedidos) {
        this.id = id;
        this.senha = senha;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.pedidos = pedidos;
        this.pets = new ArrayList<Pet>();
        this.agendamentos = new ArrayList<Agendamento>();
    }

    public String getId() {
        return this.id;
    }

    public String getSenha() {
        return this.senha;
    }

    public String getPrimeiroNome() {
        return this.primeiroNome;
    }

    public String getUltimoNome() {
        return this.ultimoNome;
    }

    public int getTamanhoPedidos() {
        return this.pedidos.size();
    }

    public ArrayList<Pedido> getPedidos() {
        return this.pedidos;
    }

    public void adicionarPedido(Pedido pedido) {
        this.pedidos.add(pedido); // Assume-se que pedidos é inicializado
    }

    public void removerPedido(Pedido pedido) {
        this.pedidos.remove(pedido);
    }

    public ArrayList<Pet> getPets() {
        return this.pets;
    }

    public void adicionarPet(Pet pet) {
        this.pets.add(pet);
    }

    public void removerPet(Pet pet) {
        this.pets.remove(pet);
    }

    public ArrayList<Agendamento> getAgendamentos() {
        return this.agendamentos;
    }

    public void adicionarAgendamento(Agendamento agendamento) {
        this.agendamentos.add(agendamento);
    }
}
