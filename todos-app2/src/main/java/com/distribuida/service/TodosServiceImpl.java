package com.distribuida.service;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.distribuida.dto.Todos;

@ApplicationScoped
@Transactional
public class TodosServiceImpl implements TodosService {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Todos obtenerTodosPorId(Integer id) {
		return em.find(Todos.class, id);
	}

	@Override
	public List<Todos> obtenerTodos() {
		return em.createQuery("SELECT t FROM Todos t", Todos.class).getResultList();
	}

}
