package com.seuprojeto.apinotas.service;


import com.seuprojeto.apinotas.model.AlunoModel;
import com.seuprojeto.apinotas.repository.AlunoRepository;

import dto.AlunoDTO;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository repository;

    public AlunoDTO salvar(AlunoDTO dto) {
        AlunoModel model = new AlunoModel();
        BeanUtils.copyProperties(dto, model); 
        AlunoModel salvo = repository.save(model);
        return new AlunoDTO(salvo);
    }
    
    public AlunoService(AlunoRepository repository) {
        this.repository = repository;
    }
    public List<AlunoDTO> listar() {
    	List<AlunoModel> lista = repository.findAll();
        return lista.stream()
                    .map(AlunoDTO::new) 
                    .toList();
    }
    public Optional<AlunoDTO> buscarPorId(Long id){
        return repository.findById(id)
        		.map(AlunoDTO::new);
    }
    public AlunoDTO salvar(AlunoModel alunoModel){
        return new AlunoDTO(alunoModel);
    }
    public  void deletar(Long id){
        repository.deleteById(id);
    }


}
