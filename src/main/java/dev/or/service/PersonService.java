package dev.or.service;

import dev.or.domain.entity.dto.TeacherDTO;
import dev.or.domain.usecase.CreateTeacher;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author Jhonatan
 */
@ApplicationScoped
public class PersonService extends AbstractService {

    @Transactional
    public Response createNewTeacher(TeacherDTO teacherDTO) {

        CreateTeacher createTeacher = new CreateTeacher(panacheTeacherRepository);

        TeacherDTO dto = createTeacher.execute(teacherDTO);

        return Response.status(Response.Status.ACCEPTED).entity(dto).build();
    }
}