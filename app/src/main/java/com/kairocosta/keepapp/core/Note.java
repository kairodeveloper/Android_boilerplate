package com.kairocosta.keepapp.core;

/**
 * Created by lapesi on 08/03/17.
 */

public class Note {

    private String titulo;
    private String conteudo;

    public Note(String titulo, String conteudo) {
        this.conteudo = conteudo;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

}
