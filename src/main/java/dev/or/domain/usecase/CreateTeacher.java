package dev.or.domain.usecase;

import dev.or.domain.entity.bo.TeacherBO;
import dev.or.domain.entity.dto.TeacherDTO;
import dev.or.domain.entity.repositories.ITeacherRepository;
import dev.or.domain.mapper.TeacherMapper;

/**
 *
 * @author Jhonatan
 */
public class CreateTeacher {

    private ITeacherRepository iTeacherRepository;

    public CreateTeacher(ITeacherRepository iTeacherRepository) {
        this.iTeacherRepository = iTeacherRepository;
    }

    public TeacherDTO execute(TeacherDTO teacherDTO) {

        TeacherBO bo = TeacherMapper.toBO(teacherDTO);

        TeacherBO teacherBO = iTeacherRepository.create(bo);

        return TeacherMapper.toDTO(teacherBO);

    }
}