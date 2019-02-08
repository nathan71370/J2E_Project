package fr.project_j2ee.dao.jpa;

import fr.project_j2ee.dao.DaoPictures;
import fr.project_j2ee.entity.Pictures;
import fr.project_j2ee.entity.Users;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class JpaPicturesDao implements DaoPictures {

    private EntityManager entityManager;

    public JpaPicturesDao(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public List<Pictures> getAllPictures() {
        return this.entityManager.createNamedQuery("GetAllCategories").getResultList();
    }

    @Override
    public Pictures addPictures(Pictures pictures) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(pictures);
        this.entityManager.getTransaction().commit();
        return pictures;
    }

    @Override
    public Pictures findById(Long id) {
        return this.entityManager.find(Pictures.class, id);
    }

    @Override
    public Pictures updatePictures(Pictures pictures) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(pictures);
        this.entityManager.getTransaction().commit();
        return pictures;
    }

	@Override
	public void removePictures(Long picturesId) {
		Pictures pictures = this.entityManager.find(Pictures.class, picturesId);
        this.entityManager.getTransaction().begin();
        this.entityManager.remove(this.entityManager.merge(pictures));
        this.entityManager.getTransaction().commit();
	}
}
