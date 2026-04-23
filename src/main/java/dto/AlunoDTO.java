package dto;

import org.springframework.beans.BeanUtils;

import com.seuprojeto.apinotas.model.AlunoModel;

public class AlunoDTO {

	private Long id;

	private String nome;
	private Double nota;
	private int matricula;

	public AlunoDTO(AlunoModel aluno) {
		BeanUtils.copyProperties(aluno, this);
	}

	public AlunoDTO() {

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
