package ejb2;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Session Bean implementation class HiManager
 */
@Stateless
@LocalBean
public class HiManager {

	@PersistenceContext
	private EntityManager em;

	public void add(int id, String name) {

		System.out.println("Added, " + id + name);

	}

	/**
	 * Default constructor.
	 */
	public HiManager() {
		// TODO Auto-generated constructor stub
	}

}
