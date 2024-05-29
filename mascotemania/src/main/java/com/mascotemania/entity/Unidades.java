package com.mascotemania.entity;

import java.util.HashMap;

public class Unidades {
    private HashMap<String, Integer> unidades;

    public Unidades() {
        unidades = new HashMap<>();
    }

    public void listarUnidadesEndereco() {
        System.out.println("Unidades:");
        for (String unidade : unidades.keySet()) {
            String endereco; 
            int id;
            if (unidade.equalsIgnoreCase("Unidade X")) {
                endereco = "Rua ABC, 123";
                id = 1;
            } else if (unidade.equalsIgnoreCase("Unidade Y")) {
                endereco = "Rua DEF, 456";
                id = 2;
            } else {
                id = -1;
                endereco = "Unidade indisponível";
            }
            System.out.println(id + " - " + unidade + " - Endereço: " + endereco);
        }
    }

    public HashMap<String, Integer> getUnidades() {
        return  this.unidades;
    }

    public void listarUnidades() {
        System.out.println("Unidades:");
        for (String unidade : unidades.keySet()) {
            System.out.println(unidade + ": " + unidades.get(unidade));
        }
    }
}
