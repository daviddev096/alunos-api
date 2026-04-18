package com.seuprojeto.apinotas.controller;


import com.seuprojeto.apinotas.model.Aluno;
import com.seuprojeto.apinotas.repository.AlunoRepository;
import com.seuprojeto.apinotas.service.AlunoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/alunos")
@RestController
public class AlunoController {

    private final AlunoService  alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<Aluno> listar() {
        return alunoService.listar();
    }
    @GetMapping("/{id}")
    public Aluno bucarPorId(@PathVariable Long id) {
        return alunoService.bucarPorId(id).orElse(null);
    }
    @PostMapping
    public Aluno salvar(@RequestBody Aluno aluno) {
        return alunoService.salvar(aluno);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }


}
