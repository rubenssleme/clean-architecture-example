package com.example.cleanarch.api.dominio.indicacao;

import com.example.cleanarch.api.dominio.aluno.Aluno;
import lombok.Getter;

import java.time.LocalDateTime;
@Getter
public class Indicacao {
    private Aluno indicado;
    private Aluno indicante;
    private LocalDateTime dateIndicacao;

    public Indicacao(Aluno indicado, Aluno indicante) {
        this.indicado = indicado;
        this.indicante = indicante;
        this.dateIndicacao = LocalDateTime.now();
    }
}
