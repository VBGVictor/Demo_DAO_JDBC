package modell.dao;

import java.util.List;

import Model.entities.Vendedor;

public interface VendedorDao {
	
	void insert(Vendedor obj);//responsável por inserir no banco de dados o obj como parametro de entrada
	void update(Vendedor obj);
	void deleteByid(Integer id);
	Vendedor findByid(Integer id);
	List<Vendedor> findAll();

}
