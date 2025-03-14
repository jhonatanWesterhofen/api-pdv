package dev.or.presentation;

import dev.or.domain.entity.dto.TeacherDTO;
import dev.or.service.PersonService;
import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Jhonatan
 */
@Path("/api-pdv/v1/person")
public class PersonController {

    @Inject
    PersonService personService;

    @POST
    @Path("teacher")
    public Response createUser(TeacherDTO teacherDTO) {
        return personService.createNewTeacher(teacherDTO);
    }
}