package org.danicv.poointerfaces.repositorio;

import java.util.Iterator;
import java.util.List;

import org.danicv.poointerfaces.modelo.Cliente;

public class EjemploRepositorio {

	public static void main(String[] args) {
		CrudRepositorio repo = new ClienteListRepositorio();
		repo.crearCliente(new Cliente("Daniel", "Calderon"));
		repo.crearCliente(new Cliente("Alexander", "finol"));
		repo.crearCliente(new Cliente("Eurelio", "Parra"));

		List<Cliente> clientes = repo.listar();
		for (Cliente cliente : clientes) {
			System.out.println(cliente);
		}
		System.out.println("======= paginable =======");
		List<Cliente> paginable = ((PaginarRepositorio) repo).listar(0, 3);
		for (Cliente pagina : paginable) {
			System.out.println(pagina);
		}
		System.out.println("======= paginable =======");
		List<Cliente> ordenar = ((OrdenarRepositorio) repo).listar("nombre", Direccion.ASCE);
		for (Cliente ordena : ordenar) {
			System.out.println(ordena);
		}
//		System.out.println("======= Editar =======");
//		
//		Cliente daniel = new Cliente("daniel", "Franco");
//		daniel.setId(1);
//		repo.editar(daniel);
//		Cliente dani = repo.porId(1);
//		System.out.println(daniel);
		
		System.out.println("======= Eliminar =======");
		repo.eliminar(0);
		repo.listar().forEach(System.out::println);
		
	}

}
