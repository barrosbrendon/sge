package br.com.proj.sge.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="produtos")
public class Produto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="produto_id")
	private Long id;
	private String nome;
	private boolean ativo;
	@ManyToOne
	@JoinTable(name="categoria_id")
	private Categoria categoria;
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
}
