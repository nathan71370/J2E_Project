package fr.project_j2ee.ressources;

import fr.project_j2ee.dao.DaoFactory;
import fr.project_j2ee.entity.Users;

import javax.ws.rs.*;

@Path("/users")
public class UsersRessources {

    @POST
    public Users addUsers(Users users) {
        DaoFactory.getDaoUsers().addUsers(users);
        return users;
    }

    @GET
    @Path("/{usersId}")
    public Users getUsers(@PathParam("usersId") Long usersId) {
        return DaoFactory.getDaoUsers().findById(usersId);
    }

    @PUT
    public Users updateCategory(Users users) {
        DaoFactory.getDaoUsers().updateUsers(users);
        return users;
    }
}