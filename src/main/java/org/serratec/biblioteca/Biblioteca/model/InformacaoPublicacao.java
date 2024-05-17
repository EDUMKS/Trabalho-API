package org.serratec.biblioteca.Biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class InformacaoPublicacao {

	@Column
	@NotBlank(message = "Preencha a data de publicação")
	@Size(max = 30)
	private String dataPublicacao;

	@Column
	@NotBlank(message = "Preencha o nome do autor")
	@Size(max = 60)
	private String autor;

	@Column
	@NotBlank(message = "Preencha o nome da editora")
	@Size(max = 60)
	private String editora;


	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public String getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(String dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

}