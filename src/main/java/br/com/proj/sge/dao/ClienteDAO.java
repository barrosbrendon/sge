package br.com.proj.sge.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.proj.sge.model.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;

@Repository
public class ClienteDAO implements CRUD<Cliente, Long> {
	
	@PersistenceContext
	EntityManager entityManager;

	@Override
	public Cliente pesquisarPeloId(Long id) {
		return entityManager.find(Cliente.class, id);
	}

	@Override
	public List<Cliente> listar() {
		Query query = entityManager.createQuery("SELECT c FROM clientes c");
		return (List<Cliente>) query.getResultList();
	}

	@Override
	public void inserir(Cliente cliente) {
		entityManager.persist(cliente);
	}

	@Override
	public void atualizar(Cliente cliente) {
		entityManager.merge(cliente);
		
	}

	@Override
	public void remover(Cliente cliente) {
		entityManager.remove(cliente);
		
	}
	
}
