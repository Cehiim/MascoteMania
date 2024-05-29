package com.mascotemania.entity;

import java.util.HashMap;

public class Servicos {
    private HashMap<String, Integer> servicos;

    public Servicos() {
        servicos = new HashMap<>();
    }

    public void listarServicosValores() {
        System.out.println("Serviços:");
        for (String servico : servicos.keySet()) {
            String valor; 
            int id;
            if (servico.equalsIgnoreCase("Remoção de subpelos")) {
                valor = "20";
                id = 1;
            } else if (servico.equalsIgnoreCase("Tosa tesoura")) {
                valor = "30";
                id = 2;
            } else if (servico.equalsIgnoreCase("Tosa higiênica")) {
                valor = "40";
                id = 3;
            } else if (servico.equalsIgnoreCase("Tosa máquina")) {
                valor = "50";
                id = 4;
            } else if (servico.equalsIgnoreCase("Tosa stripping")) {
                valor = "60";
                id = 5;
            } else {
                id = -1;
                valor = "Servico indisponível para compra";
            }
            System.out.println(id + " - " + servico + " - preço: " + valor);
        }
    }

    public HashMap<String, Integer> getServicos() {
        return  this.servicos;
    }

    public void listarServicos() {
        System.out.println("Servicos:");
        for (String servico : servicos.keySet()) {
            System.out.println(servico + ": " + servicos.get(servico));
        }
    }
}
