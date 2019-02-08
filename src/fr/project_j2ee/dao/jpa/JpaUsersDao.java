package fr.project_j2ee.dao.jpa;

import fr.project_j2ee.dao.DaoUsers;
import fr.project_j2ee.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class JpaUsersDao implements DaoUsers {

    private EntityManager entityManager;

    public JpaUsersDao(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public Users addUsers(Users users) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(users);
        this.entityManager.getTransaction().commit();

        return users;
    }

    @Override
    public void removeUsers(Long usersId) {
        Users users = this.entityManager.find(Users.class, usersId);
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(this.entityManager.merge(users));
        this.entityManager.getTransaction().commit();
    }
    
    @Override
    public Boolean getUsers(String usersname, String password) {
    }

    @Override
    public List<Users> getAllUsers() {
        return this.entityManager.createNamedQuery("GetAllUsers").getResultList();
    }

    @Override
    public Users findById(Long id) {
        return this.entityManager.find(Users.class, id);
    }

	@Override
	public Users updateUsers(Users users) {
		// TODO Auto-generated method stub
		return null;
	}
}
