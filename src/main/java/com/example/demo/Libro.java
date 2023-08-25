package com.example.demo;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Libro {

	private @Id @GeneratedValue Long id;
	private String nombre;
	private String fecha;
	private String editorial;

	private Libro() {}

	public Libro(String nombre, String fecha, String editorial) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.editorial = editorial;
	}

	

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Libro libro = (Libro) o;
		return Objects.equals(id, libro.id) &&
			Objects.equals(nombre, libro.nombre) &&
			Objects.equals(fecha, libro.fecha) &&
			Objects.equals(editorial, libro.editorial);
	}

	@Override
	public int hashCode() {

		return Objects.hash(id, nombre, fecha, editorial);
	}


	@Override
	public String toString() {
		return "Libro{" +
			"id=" + id +
			", nombre='" + nombre + '\'' +
			", fecha='" + fecha + '\'' +
			", editorial='" + editorial + '\'' +
			'}';
	}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }
	
}