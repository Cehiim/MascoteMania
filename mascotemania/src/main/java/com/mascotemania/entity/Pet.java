package com.mascotemania.entity;

import java.util.ArrayList;

public class Pet {
    private String id;
    private String nome;
    private String tipo;
    private ArrayList<String> info_adicionais;

    public Pet(String id, String nome, String tipo) {
        this.id = id;
        this.nome = nome;
        this.tipo = tipo;
        this.info_adicionais = new ArrayList<String>();
    }

   public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<String> getInfo() {
      return info_adicionais;
    }

    public void addInfo(String info) {
      info_adicionais.add(info);
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getNome() + " " + this.getTipo() + "\n" + "Informações adicionais: \n" + this.getInfo();
    }
}
