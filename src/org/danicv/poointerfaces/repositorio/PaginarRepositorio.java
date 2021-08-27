package org.danicv.poointerfaces.repositorio;

import java.util.List;

import org.danicv.poointerfaces.modelo.Cliente;

public interface PaginarRepositorio {
	List<Cliente> listar(int desde, int hasta);
}
