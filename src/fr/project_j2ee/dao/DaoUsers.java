package fr.project_j2ee.dao;

import fr.project_j2ee.entity.Users;
import java.util.List;

public interface DaoUsers {
	
	/**
     * Method used for adding users to database.
     *
     * @param user Of type {@link Users}
     * @return The saved {@link Users}
     */
    Users addUsers(Users users);

    /**
     * Method used for update users to database.
     *
     * @param user Of type {@link Users}
     * @return The saved {@link Users}
     */
    Users updateUsers(Users users);

    /**
     * This method helps remove Users.
     *
     * @param UsersId represents the technical identifier of the user.
     */
    void removeUsers(Long UsersId);

    /**
     * This method retrieves all users from database
     *
     * @return A {@link List} of {@link Users}
     */
    List<Users> getAllUsers();

    /**
     * This method retrieves true is user exist in database
     *
     * @return A {@link true} or {@link false} of {@link Users}
     */
    Users getUsers(String username);
    
    /**
     * This method gets a {@link Users} using it's technical identifier
     *
     * @param id of type {@link Long} represents the technical identifier
     * @return The {@linkUsers} object if found.
     */
    Users findById(Long id);
}
