package net.ug.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.ug.datos.Asignatura;


public class DaoAsignatura {
	
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
	
	public void crear(Asignatura asignatura) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(asignatura);
		s.getTransaction();
		s.close();
	}
	
	
	public  Asignatura read(long id) {
		Session s = sessionFactory.openSession();
		Asignatura asignatura = s.get(Asignatura.class, id);
		s.close();
		return asignatura;
				
	}
	
	public void update(Asignatura asignatura) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(asignatura);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Asignatura asignatura = new Asignatura();
		asignatura.setId(id);
		s.delete(asignatura);
		s.getTransaction().commit();
		s.close();
	}

}
