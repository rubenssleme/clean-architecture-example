package com.example.cleanarch.api.dominio.aluno;

import lombok.Getter;

@Getter
public class Telefone {

    private String ddd;
    private String numero;

    public Telefone(String ddd, String numero) {
        if (ddd == null || numero == null) {
            throw new IllegalArgumentException("DDD e Numero são obrigatorios! ");
        }
        if (!ddd.matches("\\d{2}")) {
            throw new IllegalArgumentException("DDD Invalido! ");
        }
        if (!numero.matches("\\d{8} | \\d{9}")) {
            throw new IllegalArgumentException("Numero Ivalido! ");
        }
        this.ddd = ddd;
        this.numero = numero;
    }
}
