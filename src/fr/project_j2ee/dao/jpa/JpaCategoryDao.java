package fr.project_j2ee.dao.jpa;

import fr.project_j2ee.dao.DaoCategory;
import fr.project_j2ee.entity.Category;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

public class JpaCategoryDao implements DaoCategory {

    private EntityManager entityManager;

    public JpaCategoryDao(EntityManagerFactory entityManagerFactory) {
        this.entityManager = entityManagerFactory.createEntityManager();
    }

    @Override
    public List<Category> getAllCategories() {
        return this.entityManager.createNamedQuery("GetAllCategories").getResultList();
    }

    @Override
    public Category addCategory(Category category) {
        this.entityManager.getTransaction().begin();
        this.entityManager.persist(category);
        this.entityManager.getTransaction().commit();
        return category;
    }

    @Override
    public Category findById(Long id) {
        return this.entityManager.find(Category.class, id);
    }

    @Override
    public Category updateCategory(Category category) {
        this.entityManager.getTransaction().begin();
        this.entityManager.merge(category);
        this.entityManager.getTransaction().commit();
        return category;
    }

}
