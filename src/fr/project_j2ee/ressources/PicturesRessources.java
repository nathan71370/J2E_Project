package fr.project_j2ee.ressources;

import fr.project_j2ee.dao.DaoFactory;
import fr.project_j2ee.entity.Pictures;

import javax.ws.rs.*;

@Path("/pictures")
public class PicturesRessources {

    @POST
    public Pictures addPictures(Pictures pictures) {
        DaoFactory.getDaoPictures().addPictures(pictures);
        return pictures;
    }

    @GET
    @Path("/{picturesId}")
    public Pictures getPictures(@PathParam("picturesId") Long picturesId) {
        return DaoFactory.getDaoPictures().findById(picturesId);
    }

    @PUT
    public Pictures updateCategory(Pictures pictures) {
        DaoFactory.getDaoPictures().updatePictures(pictures);
        return pictures;
    }
}