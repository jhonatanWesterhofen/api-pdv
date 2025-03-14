package dev.or.infra.database.panache.mapper;

import dev.or.domain.entity.bo.TeacherBO;
import dev.or.infra.database.panache.model.PanacheTeacher;

/**
 *
 * @author Jhonatan
 */
public class PanacheTeacherMapper {

    public static PanacheTeacher toEntity(TeacherBO bo) {

        if (bo == null) {
            return null;
        }

        var panacheTeacher = new PanacheTeacher();

        panacheTeacher.setId(bo.getId());
        panacheTeacher.setName(bo.getName());
        panacheTeacher.setDocument(bo.getDocument());
        panacheTeacher.setMaritalStatus(bo.getMaritalStatus());
        panacheTeacher.setNationality(bo.getNationality());
        panacheTeacher.setAge(bo.getAge());
        panacheTeacher.setProfileImg(bo.getProfileImg());
        panacheTeacher.setAddress(PanacheAddressMapper.toEntity(bo.getAddress()));

        return panacheTeacher;
    }

    public static TeacherBO toDomain(PanacheTeacher entity) {

        if (entity == null) {
            return null;
        }

        return new TeacherBO(
                entity.getId(),
                entity.getName(),
                entity.getDocument(),
                entity.getMaritalStatus(),
                entity.getNationality(),
                entity.getAge(),
                entity.getProfileImg(),
                PanacheAddressMapper.toDomain(entity.getAddress()));
    }
}