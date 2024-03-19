package br.com.alunoonline.api.controller;

import br.com.alunoonline.api.model.Aluno;
import br.com.alunoonline.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController //fazendo com que o controller utilize a arquitetura rest
@RequestMapping("/aluno") //fazendo com que tudo que acontecer no frontEnd com /aluno caia nessa class

public class AlunoController {
    @Autowired
    AlunoService alunoService; //fazendo a injeção de dependencia do service em controller


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void create(@RequestBody Aluno aluno) { //convertento o jason que vem do Postman ou insonmia para um arquivo java Aluno
        alunoService.create(aluno);

    }

}
