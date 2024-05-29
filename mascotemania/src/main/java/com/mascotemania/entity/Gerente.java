package com.mascotemania.entity;

public class Gerente {
    private String id;
    private String senha;
    private String primeiroNome;
    private String ultimoNome;

    public Gerente(String id, String senha, String primeiroNome, String ultimoNome) {
        this.id = id;
        this.senha = senha;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
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

    // public String geraRelatorio(Tosador tosador) {
    //     return tosador.toString();
    // }
}
