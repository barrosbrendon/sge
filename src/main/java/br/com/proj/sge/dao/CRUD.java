package br.com.proj.sge.dao;

import java.util.List;

public interface CRUD<T, ID> {
	T pesquisarPeloId(ID id);
	List<T> listar();
	void inserir(T t);
	void atualizar(T t);
	void remover(T t);
}