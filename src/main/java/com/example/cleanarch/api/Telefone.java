package com.example.cleanarch.api;

public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        //validacao
        this.ddd = ddd;
        this.numero = numero;
    }
}
