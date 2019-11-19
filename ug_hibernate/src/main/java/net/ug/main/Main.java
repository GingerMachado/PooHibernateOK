package net.ug.main;

import net.ug.crud.DaoAsignatura;
import net.ug.crud.DaoDecano;
import net.ug.crud.DaoEstudiante;
import net.ug.datos.Asignatura;
import net.ug.datos.Decano;
import net.ug.datos.Estudiante;

public class Main {
	public static void main(String[] args ) {
		crear();
		read();
		update();
		delete();
		
		/*crearEstud();
		readEstud();
		updateEstud();
		deleteEstud();
		
		
		crearAsig();
		readAsig();
		updateAsig();
		deleteAsig();*/
		
		
	}
	
	public static void crear() {
		DaoDecano daoDecano = new DaoDecano();
		Decano decanos = new Decano(1,"0953940395","Ginger","Machado","0976546876");
		daoDecano.setup();
		daoDecano.crear(decanos);
		
	}
	
	public static void read() {
		DaoDecano daoDecano = new DaoDecano();
		daoDecano.setup();
		Decano decano = daoDecano.read(1);
		Decano.imprimir(decano.toString());
			
	}
	
	
	public static void update() {

		DaoDecano daoDecano = new DaoDecano();
		daoDecano.setup();
		Decano  decano = daoDecano.read(1);
		decano.setCellphone("2606049");
		daoDecano.update(decano);	}
	
	public static void delete() {
		DaoDecano daoDecano = new DaoDecano();
		daoDecano.setup();
		daoDecano.delete(1);
		
	}
	
	
	public static void crearEstud() {
		DaoEstudiante daoEstudiante = new DaoEstudiante();
		Estudiante estudiante = new Estudiante(1,"0953940395","Melanie","Ruiz","0976546876");
		daoEstudiante.setup();
		daoEstudiante.crear(estudiante);
		
	}
	
	public static void readEstud() {
		DaoEstudiante daoEstudiante = new DaoEstudiante();
		daoEstudiante.setup();
		Estudiante estudiante = daoEstudiante.read(1);
		Estudiante.imprimir(estudiante.toString());
			
	}
	
	
	public static void updateEstud() {

		DaoEstudiante daoEstudiante = new DaoEstudiante();
		daoEstudiante.setup();
		Estudiante  estudiante = daoEstudiante.read(1);
		estudiante.setAddress("Guasmo Sur");
		daoEstudiante.update(estudiante);	}
	
	public static void deleteEstud() {
		DaoEstudiante daoEstudiante = new DaoEstudiante();
		daoEstudiante.setup();
		daoEstudiante.delete(1);
		
	}


	
	
	
	public static void crearAsig() {
		DaoAsignatura daoAsignatura = new DaoAsignatura();
		Asignatura asignatura = new Asignatura(1,"Matematicas","2");
		daoAsignatura.setup();
		daoAsignatura.crear(asignatura);
		
	}
	
	public static void readAsig() {
		DaoAsignatura daoAsignatura = new DaoAsignatura();
		daoAsignatura.setup();
		Asignatura asignatura = daoAsignatura.read(1);
		Asignatura.imprimir(asignatura.toString());
			
	}
	
	
	public static void updateAsig() {

		DaoAsignatura daoAsignatura = new DaoAsignatura();
		daoAsignatura.setup();
		Asignatura  asignatura = daoAsignatura.read(1);
		asignatura.setCreditos("6");
		daoAsignatura.update(asignatura);	}
	
	public static void deleteAsig() {
		DaoAsignatura daoAsignatura = new DaoAsignatura();
		daoAsignatura.setup();
		daoAsignatura.delete(1);
		
	}
}
