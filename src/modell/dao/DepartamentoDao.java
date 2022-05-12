package modell.dao;

import java.util.List;

import Model.entities.Departamento;

public interface DepartamentoDao {

	void insert(Departamento obj);//responsável por inserir no banco de dados o obj como parametro de entrada
	void update(Departamento obj);
	void deleteByid(Integer id);
	Departamento findByid(Integer id);
	List<Departamento> findAll();
	
	
}
