package org.serratec.biblioteca.Biblioteca.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "livro")
public class Livro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 30)
	@Size(max = 30)
	@NotBlank(message = "O título é obrigatório")
	private String titulo;

	@Embedded
	private InformacaoPublicacao informacaoPublicacao;

	public InformacaoPublicacao getInformacaoPublicacao() {
		return informacaoPublicacao;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setInformacaoPublicacao(InformacaoPublicacao informacaoPublicacao) {
		this.informacaoPublicacao = informacaoPublicacao;
	}

}
