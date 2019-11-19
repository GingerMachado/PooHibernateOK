package net.ug.datos;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
@Table (name = "Asignatura")
public class Asignatura {
	
	@Id
	@Column(name = "cod_asignatura")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "nombre")
	private String name;
	
	@Column(name = "creditos")
	private String creditos;

	public Asignatura() {
			}

	
	public static void imprimir(String name) {
		System.out.println(name);
	}
	public Asignatura(long id, String name, String creditos) {
		
		this.id = id;
		this.name = name;
		this.creditos = creditos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreditos() {
		return creditos;
	}

	public void setCreditos(String creditos) {
		this.creditos = creditos;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", name=" + name + ", creditos=" + creditos + "]";
	}
	
	
	
}
