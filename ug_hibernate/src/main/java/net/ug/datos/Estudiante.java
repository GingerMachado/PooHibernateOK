package net.ug.datos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Estudiante")
public class Estudiante {
	
	@Id
	@Column(name = "cod_estudiante")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "cedula")
	private String dni;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "apellidos")
	private String lastName;
	
	@Column(name = "direccion")
	private String address;

	public Estudiante() {
		
	}

	public Estudiante(long id, String dni, String name, String lastName, String address) {
		super();
		this.id = id;
		this.dni = dni;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
	}

	public static void imprimir(String name) {
		System.out.println(name);
	}
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", dni=" + dni + ", name=" + name + ", lastName=" + lastName + ", address="
				+ address + "]";
	}
	
	

}
