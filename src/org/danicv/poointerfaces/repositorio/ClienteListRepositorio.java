package org.danicv.poointerfaces.repositorio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.danicv.poointerfaces.modelo.Cliente;

public class ClienteListRepositorio implements CrudRepositorio, OrdenarRepositorio, PaginarRepositorio {

	private List<Cliente> dataSource;

	public ClienteListRepositorio() {
		this.dataSource = dataSource = new ArrayList<>();
	}

	@Override
	public List<Cliente> listar() {

		return dataSource;
	}

	@Override
	public Cliente porId(Integer id) {
		Cliente resultado = null;
		for (Cliente cli : dataSource) {
			if (cli.getId().equals(id)) {
				resultado = resultado;

			}
		}
		return resultado;
	}

	@Override
	public void crearCliente(Cliente cliente) {
		this.dataSource.add(cliente);

	}

	@Override
	public void editar(Cliente cliente) {
		Cliente cli = this.porId(cliente.getId());
		cli.setNombre(cliente.getNombre());
		cli.setApellido(cliente.getApellido());

	}

	@Override
	public void eliminar(Integer id) {
		dataSource.remove(this.porId(id));

	}

	@Override
	public List<Cliente> listar(String campo, Direccion dir) {
		dataSource.sort((a, b) -> {
			int resultado = 0;
			if (dir == Direccion.ASCE) {
				switch (campo) {
				case "id" -> resultado = a.getId().compareTo(b.getId());

				case "nombre" -> resultado = a.getNombre().compareTo(b.getNombre());

				case "apellido" -> resultado = a.getApellido().compareTo(b.getApellido());
				}
			} else if (dir == Direccion.DESC) {
				switch (campo) {
				case "id" -> resultado = b.getId().compareTo(a.getId());

				case "nombre" -> resultado = b.getNombre().compareTo(a.getNombre());

				case "apellido" -> resultado = b.getApellido().compareTo(a.getApellido());
				}
			}
			return resultado;
		}

		);
	return dataSource;}

	@Override
	public List<Cliente> listar(int desde, int hasta) {
		return dataSource.subList(desde, hasta);
	}

}
