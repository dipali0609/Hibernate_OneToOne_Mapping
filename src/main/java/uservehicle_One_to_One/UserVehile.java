package uservehicle_One_to_One;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class UserVehile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		configuration.addAnnotatedClass(User.class);
		configuration.addAnnotatedClass(Vehicle.class);
		
		//step 2
		SessionFactory sessionFactory=configuration.buildSessionFactory();
		
		//Step 3
		Session session=sessionFactory.openSession();
		//step
		Transaction transaction =session.beginTransaction();
		
		Vehicle vehicle=new Vehicle();
		vehicle.setVname("car");
		
		User user=new User();
		user.setUsername("Dipali");
		user.setVehicle(vehicle);
		
		
		session.save(user);
		session.save(vehicle);
		transaction.commit();
		session.close();
		
	}

}
