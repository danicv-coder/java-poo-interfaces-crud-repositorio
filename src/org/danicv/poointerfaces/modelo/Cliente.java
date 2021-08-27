package org.danicv.poointerfaces.modelo;

public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private static int ultimoId;

	public Cliente() {
		this.id = ++ultimoId;
	};

	public Cliente(int id, String nombre, String apellido) {
		this();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	@Override
	public String toString() {
		return "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido;
	}

}
