package br.com.alunoonline.api.service;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoService {

    @Autowired
    AlunoRepository alunoRepository; //fazendo a injeção de dependencia do repositor em service

    public void create(Aluno aluno) {
        alunoRepository.save(aluno); //puxando as informações do model aluno e atribuindo ao banco de dados atravez do repository

    }

}
