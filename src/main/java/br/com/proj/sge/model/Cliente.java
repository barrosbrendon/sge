package br.com.proj.sge.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clientes")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cliente_id")
	private Long id;
	@Column(nullable = false, length = 50)
	private String nome;
	@Column(length = 11)
	private String cpf;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name="data_nascimento", columnDefinition = "DATE")
	private LocalDate dataDeNascimento;
	@Column(length = 10)
	private String telefone;
	@Column(length = 11)
	private String celular;
	@Column(length = 50)
	private String email;
	@Enumerated(EnumType.STRING)
	private Sexo sexo;
	
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Long getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getCelular() {
		return celular;
	}
	public String getEmail() {
		return email;
	}
	public boolean isAtivo() {
		return ativo;
	}
	@Column(nullable = false)
	private boolean ativo;
	
	public void setId(Long id) {
		this.id = id;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
}
