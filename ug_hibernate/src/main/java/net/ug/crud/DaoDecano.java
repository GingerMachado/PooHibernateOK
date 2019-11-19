package net.ug.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import net.ug.datos.Decano;


public class DaoDecano {
	public SessionFactory sessionFactory; //protected solo  es visible para superclases
	// ssesion factory  para poder usar los metodos dando acceso a hibernate
	
	public void setup() {// lee configuracion de hibernate y levanta servicio
	
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

	public void crear(Decano decano) {
		Session s = sessionFactory.openSession();
		s.beginTransaction();
		s.save(decano);
		s.getTransaction();
		s.close();
	}
	
	
	public  Decano read(long id) {
		Session s = sessionFactory.openSession();
		Decano decano = s.get(Decano.class, id);
		s.close();
		return decano;
				
	}
	
	public void update(Decano decano) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		s.update(decano);
		s.getTransaction().commit();
		s.close();
	}
	
	
	public void delete(int id) {
		Session s =  sessionFactory.openSession();
		s.beginTransaction();
		Decano decano = new Decano();
		decano.setId(id);
		s.delete(decano);
		s.getTransaction().commit();
		s.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
