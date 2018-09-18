package org.expense.managment.jpa.beans;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GroupMaster {

	private static final String PERSISTENCE_UNIT_NAME = "groups";
    private static EntityManagerFactory factory;
    private EntityManager entityManager;

  

public GroupMaster()
   {
	   init();
   }
    
    private void init() {
    	
    	factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        entityManager = factory.createEntityManager();
	  setEntityManager(entityManager);
}

	public Groups createGroup(Groups emp)
    {
		    EntityManager manager = getEntityManager();
			manager.getTransaction().begin();
			manager.persist(emp);
			System.out.println(emp);
			manager.getTransaction().commit();
			return emp;
			//manager.close();
    }
	
	public void createmember(Members member)
	{
		
		  EntityManager manager = getEntityManager();
			manager.getTransaction().begin();
			manager.persist(member);
			manager.getTransaction().commit();
	}
    
	public static void main(String[] args) {
		
		GroupMaster mas = new GroupMaster();
		 Groups emp = new Groups();
		 emp.setGroupname("second");
		mas.createGroup(emp);
		/*mas.getEntityManager() .persist(emp);
		mas.getEntityManager() .getTransaction().commit();
		mas.getEntityManager().close();*/
		/*factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager em = factory.createEntityManager();
		
        
       
        
        
        em.getTransaction().begin();
        Groups emp = new Groups();
        emp.setGroupname("second");
        em.persist(emp);
        em.getTransaction().commit();
        
        
        
        Query q = em.createQuery("select t  from Groups t ");
        List<Groups> todoList = q.getResultList();
        for (Groups todo : todoList) {
            System.out.println(todo.getGroupid() + "    "  + todo.getGroupname());
            
        }
        em.close();*/
	}
	
	public  List<Groups>  loadgroup(){
		
		Query q = getEntityManager().createQuery("select t  from Groups t ");
        List<Groups> todoList = q.getResultList();
        for (Groups todo : todoList) {
            System.out.println(todo.getGroupid() + "    "  + todo.getGroupname());
            
        }
        
        return todoList;
	}
	
	 public EntityManager getEntityManager() {
			return entityManager;
		}

		public void setEntityManager(EntityManager entityManager) {
			this.entityManager = entityManager;
		}
}
