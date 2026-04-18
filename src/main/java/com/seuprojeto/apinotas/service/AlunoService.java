package com.seuprojeto.apinotas.service;


import com.seuprojeto.apinotas.model.Aluno;
import com.seuprojeto.apinotas.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }
    public List<Aluno> listar() {
        return repository.findAll();
    }
    public Optional<Aluno> bucarPorId(Long id){
        return repository.findById(id);
    }
    public Aluno salvar(Aluno aluno){
        return repository.save(aluno);
    }
    public  void deletar(Long id){
        repository.deleteById(id);
    }


}
