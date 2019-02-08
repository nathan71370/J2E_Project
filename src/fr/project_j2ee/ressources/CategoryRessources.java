package fr.project_j2ee.ressources;

import fr.project_j2ee.dao.DaoFactory;
import fr.project_j2ee.entity.Category;

import javax.ws.rs.*;

@Path("/categories")
public class CategoryRessources {

    @POST
    public Category addCategory(Category category) {
        DaoFactory.getDaoCategory().addCategory(category);
        return category;
    }

    @GET
    @Path("/{categoryId}")
    public Category getCategory(@PathParam("categoryId") Long categoryId) {
        return DaoFactory.getDaoCategory().findById(categoryId);
    }

    @PUT
    public Category updateCategory(Category category) {
        DaoFactory.getDaoCategory().updateCategory(category);
        return category;
    }
}