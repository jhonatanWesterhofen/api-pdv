package dev.or.service;

import org.jboss.logging.Logger;

import dev.or.domain.entity.dto.UserDTO;
import dev.or.infra.database.panache.model.PanacheUser;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Jhonatan
 */
@ApplicationScoped
public class UserService {

    @Inject
    Logger logger;

    EntityManager em = PanacheUser.getEntityManager();

    @Transactional
    public Response createNewUser(UserDTO userDTO) {

        PanacheUser panache = new PanacheUser();

        panache.setDocument(userDTO.getDocument());
        panache.setName(userDTO.getName());
        panache.setPassword(userDTO.getPassword());
        panache.setLogin(userDTO.getLogin());

        try {

            em.persist(panache);

        } catch (Exception e) {
            logger.error(e);
        }

        return Response.ok().status(Response.Status.NO_CONTENT).build();
    }
}