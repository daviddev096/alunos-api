package com.seuprojeto.apinotas.model;

import org.springframework.beans.BeanUtils;

import dto.AlunoDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class AlunoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private Double nota;
	private int matricula;

	public AlunoModel(AlunoDTO aluno) {
		BeanUtils.copyProperties(aluno, this);
	}
	
	public AlunoModel() {

	}

	public AlunoModel(Long id, String nome, Double nota, int matricula) {
		this.id = id;
		this.nome = nome;
		this.nota = nota;
		this.matricula = matricula;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
}
