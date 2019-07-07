package dao;

import java.util.List;

import org.hibernate.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.SessionFactory;

import model.Location;

@Repository
public class LocationDaoImpl {

	@Autowired
	private org.hibernate.SessionFactory sessionFactory;

	public List<Location> getAllLocations() {
		System.out.println("    Entering LocationDao.getAllLocations");

		javax.persistence.Query query = sessionFactory.getCurrentSession().createSQLQuery("select * from locations");
		List<Location> locations = query.getResultList();

		System.out.println("    Exiting LocationDao.getAllLocations");
		return locations;
	}

}
