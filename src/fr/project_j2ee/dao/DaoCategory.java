package fr.project_j2ee.dao;

import fr.project_j2ee.entity.Category;

import java.util.List;

public interface DaoCategory {

    /**
     * Method used to retrieve all categories from the database.
     *
     * @return A {@link List} of {@link Category}
     */
    List<Category> getAllCategories();

    /**
     * Method used to add a {@link Category} to the database.
     *
     * @param category of type {@link Category} represents the Category we are adding to database.
     * @return The saved {@link Category} object.
     */
    Category addCategory(Category category);

    /**
     * This method retrieves a {@link Category} object using it's technical identifier.
     *
     * @param id of type {@link Long} represents the identifier of the Category
     * @return The {@link Category} if found.
     */
    Category findById(Long id);

    Category updateCategory(Category category);
}
