package com.mascotemania.entity;

import java.util.ArrayList;

public class Tosador {
    private String id;
    private String senha;
    private String primeiroNome;
    private String ultimoNome;
    private float notamedia;
    private ArrayList<String> comentarios;
    private String relatorio;

    public Tosador(String id, String senha, String primeiroNome, String ultimoNome) {
        this.id = id;
        this.senha = senha;
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
        this.comentarios = new ArrayList<String>();
        this.relatorio = "";
        this.notamedia = -1;
    }

    public String getRelatorio() {
        return this.relatorio;
    }

    public void setRelatorio(String relatorio) {
        this.relatorio = relatorio;
    }

    public String getId() {
        return this.id;
    }

    public void adicionaComentario(String comentario) {
        comentarios.add(comentario);
    }

    public float getNotaMedia() {
        return this.notamedia;
    }

    public void setNotaMedia(float notamedia) {
        this.notamedia = notamedia;
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

    public ArrayList<String> getComentarios() {
        return this.comentarios;
    }

    @Override
    public String toString() {
        return this.getPrimeiroNome() + " " + this.getUltimoNome() + "\n" + "Nota média: " + this.getNotaMedia() + "\n" + "Comentários: \n" + this.getComentarios();
    }
}