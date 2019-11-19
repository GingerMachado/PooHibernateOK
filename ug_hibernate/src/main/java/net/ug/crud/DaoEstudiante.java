package net.ug.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import net.ug.datos.Estudiante;

public class DaoEstudiante {
	public SessionFactory sessionFactory; 
	public void setup() {
		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure()
				.build();
		try {
			sessionFactory = new MetadataSources(registry)
					.buildMetadata().buildSessionFactory();			
		} catch (Exception e) {
			StandardServiceRegistryBuilder.destroy(registry);
		}
	}
	
	public void crear(Estudiante estudiante) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(estudiante);
		s.getTransaction();
		s.close();
	}
	
	
	public  Estudiante read(long id) {
		Session s = sessionFactory.openSession();
		Estudiante estudiante = s.get(Estudiante.class, id);
		s.close();
		return estudiante;
				
	}
	
	public void update(Estudiante estudiante) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(estudiante);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Estudiante estudiante = new Estudiante();
		estudiante.setId(id);
		s.delete(estudiante);
		s.getTransaction().commit();
		s.close();
	}
}
