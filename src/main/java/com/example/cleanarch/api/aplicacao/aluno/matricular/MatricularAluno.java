package com.example.cleanarch.api.aplicacao.aluno.matricular;

import com.example.cleanarch.api.dominio.aluno.Aluno;
import com.example.cleanarch.api.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {
    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }
    public void matricular(MatricularAlunoDto dadosAluno){
        Aluno novoAluno = dadosAluno.criarAluno();
        repositorio.matricular(novoAluno);
    }
}
