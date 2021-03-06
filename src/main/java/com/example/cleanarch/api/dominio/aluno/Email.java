package com.example.cleanarch.api.dominio.aluno;

import lombok.Getter;

@Getter
public class Email {

    private String endereco;

    public Email(String endereco) {
        if (endereco == null ||
                !endereco.matches("^[a-zA-Z0-9 ._]+@[a-zA-Z0-9 .−]+\\.[a-zA-Z]{2,}$")
        ) {
            throw new IllegalArgumentException("Email invalido");
        }
        this.endereco = endereco;
    }
}
