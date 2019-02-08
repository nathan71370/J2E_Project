package fr.project_j2ee.dao;

import fr.project_j2ee.entity.Pictures;

import java.util.List;

public interface DaoPictures {

    /**
     * Method used for adding pictures to database.
     *
     * @param pictures Of type {@link Pictures}
     * @return The saved {@link Pictures}
     */
    Pictures addPictures(Pictures pictures);

    /**
     * This method helps remove pictures.
     *
     * @param picturesId represents the technical identifier of the pictures.
     */
    void removePictures(Long picturesId);

    /**
     * This method retrieves all pictures from database
     *
     * @return A {@link List} of {@link Pictures}
     */
    List<Pictures> getAllPictures();

    /**
     * This method gets a {@link Pictures} using it's technical identifier
     *
     * @param id of type {@link Long} represents the technical identifier
     * @return The {@link Pictures} object if found.
     */
    Pictures findById(Long id);
}
