package dev.or.domain.mapper;

import dev.or.domain.entity.bo.TeacherBO;
import dev.or.domain.entity.dto.TeacherDTO;

/**
 *
 * @author Jhonatan
 */
public class TeacherMapper {

    public static TeacherDTO toDTO(TeacherBO teacherBO) {

        if (teacherBO == null) {
            return null;
        }

        var teacherDTO = new TeacherDTO();
        teacherDTO.setId(teacherBO.getId());
        teacherDTO.setName(teacherBO.getName());
        teacherDTO.setDocument(teacherBO.getDocument());
        teacherDTO.setMaritalStatus(teacherBO.getMaritalStatus());
        teacherDTO.setNationality(teacherBO.getNationality());
        teacherDTO.setAge(teacherBO.getAge());
        teacherDTO.setProfileImg(teacherBO.getProfileImg());
        teacherDTO.setAddress(AddressMapper.toDTO(teacherBO.getAddress()));

        return teacherDTO;
    }

    public static TeacherBO toBO(TeacherDTO teacherDTO) {

        if (teacherDTO == null) {
            return null;
        }

        var teacherBO = new TeacherBO(
                teacherDTO.getId(),
                teacherDTO.getName(),
                teacherDTO.getDocument(),
                teacherDTO.getMaritalStatus(),
                teacherDTO.getNationality(),
                teacherDTO.getAge(),
                teacherDTO.getProfileImg(),
                teacherDTO.getAddress() != null ? AddressMapper.toBO(teacherDTO.getAddress()) : null);

        return teacherBO;
    }

}
