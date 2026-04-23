package com.seuprojeto.apinotas.controller;


import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seuprojeto.apinotas.service.AlunoService;

import dto.AlunoDTO;

@RequestMapping("/alunos")
@RestController
public class AlunoController {

    private final AlunoService  alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping
    public List<AlunoDTO> listar() {
        return alunoService.listar();
    }
    @GetMapping("/{id}")
    public AlunoDTO buscarPorId(@PathVariable Long id) {
        return alunoService.buscarPorId(id).orElse(null);
    }
    @PostMapping
    public AlunoDTO salvar(@RequestBody AlunoDTO dto) {
    	return alunoService.salvar(dto);
    }
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        alunoService.deletar(id);
    }


}
