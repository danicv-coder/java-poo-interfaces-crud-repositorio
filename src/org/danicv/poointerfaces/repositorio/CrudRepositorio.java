package org.danicv.poointerfaces.repositorio;

import java.util.List;

import org.danicv.poointerfaces.modelo.Cliente;

public interface CrudRepositorio {
	List<Cliente> listar();

	Cliente porId(Integer id);

	void crearCliente(Cliente cliente);

	void editar(Cliente cliente);

	void eliminar(Integer id);
}
