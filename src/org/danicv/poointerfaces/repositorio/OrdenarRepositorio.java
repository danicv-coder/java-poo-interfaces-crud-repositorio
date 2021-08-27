package org.danicv.poointerfaces.repositorio;

import java.util.List;

import org.danicv.poointerfaces.modelo.Cliente;

public interface OrdenarRepositorio {
	List<Cliente> listar(String campo, Direccion dir);

}
