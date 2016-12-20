package corsojavagenesis.common.progetti.Francesco.src;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Sessione {
	private SessionFactory sessionFactory;
	protected void setUp() throws Exception {
	// Otteniamo una SessionFactory per la nostra applicazione
	sessionFactory = new Configuration()
	.configure() // configura la SessionFactory utilizzando l' hibernate.cfg.xml
	.buildSessionFactory();
	}
	protected void shutDown() throws Exception {
	if ( sessionFactory != null ) {
	sessionFactory.close();
	}
	}
	public List ExQuery(String hql){
		try{
		this.setUp();
		Session session = sessionFactory.openSession();
		Query query = session.createQuery(hql);
		List result = query.list();
		this.shutDown();
		return result;
		}
		catch(Throwable ex){
			System.out.println("Errore");
		}
		
	}

}
