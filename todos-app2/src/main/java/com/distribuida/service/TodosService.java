package com.distribuida.service;

import java.util.List;

import com.distribuida.dto.Todos;

public interface TodosService {
	public Todos obtenerTodosPorId(Integer id);
	public List<Todos> obtenerTodos();
	
}
