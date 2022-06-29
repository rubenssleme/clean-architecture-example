package com.example.cleanarch.api.aplicacao.aluno.matricular;

import com.example.cleanarch.api.dominio.aluno.Aluno;
import com.example.cleanarch.api.dominio.aluno.CPF;
import com.example.cleanarch.api.dominio.aluno.Email;

public class MatricularAlunoDto {

    private String cpfAluno;
    private String nomeAluno;
    private String emailAluno;

    public MatricularAlunoDto(String cpfAluno, String nomeAluno, String emailAluno) {
        this.cpfAluno = cpfAluno;
        this.nomeAluno = nomeAluno;
        this.emailAluno = emailAluno;
    }
    public Aluno criarAluno(){
        return  new Aluno(
                new CPF(cpfAluno),
                nomeAluno,
                new Email(emailAluno));
    }
}
