package com.example.cleanarch.api.dominio.aluno;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Aluno {

    private CPF cpf;
    private String nome;
    private Email email;
    private String senha;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefones.add(new Telefone(ddd, numero));
    }

    public String getCpf() {
        return cpf.getNumero();
    }

    public String getEmail() {
        return email.getEndereco();
    }
}
