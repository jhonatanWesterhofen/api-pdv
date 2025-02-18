package dev.or.presentation;

import dev.or.domain.entity.dto.UserDTO;
import dev.or.service.UserService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Jhonatan
 */
@Path("/api-pdv/v1/user")
public class UserController {

    @Inject
    UserService userService;

    @POST
    public Response createUser(UserDTO userDTO) {
        return userService.createNewUser(userDTO);
    }
}