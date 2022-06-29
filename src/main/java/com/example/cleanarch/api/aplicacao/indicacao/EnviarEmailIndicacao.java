package com.example.cleanarch.api.aplicacao.indicacao;

import com.example.cleanarch.api.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);
}
