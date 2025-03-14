package dev.or.infra.database.panache.repositories;

import dev.or.domain.entity.bo.TeacherBO;
import dev.or.domain.entity.repositories.ITeacherRepository;
import dev.or.domain.entity.utils.ListUtils;
import dev.or.infra.database.panache.mapper.PanacheTeacherMapper;
import dev.or.infra.database.panache.model.PanacheTeacher;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.persistence.EntityManager;

/**
 *
 * @author Jhonatan
 */
@ApplicationScoped
public class PanacheTeacherRepository implements ITeacherRepository {

    EntityManager em = PanacheTeacher.getEntityManager();

    @Override
    public TeacherBO create(TeacherBO teacherBO) {

        PanacheTeacher panache = PanacheTeacherMapper.toEntity(teacherBO);

        panache.persistAndFlush();

        return PanacheTeacherMapper.toDomain(panache);
    }

    @Override
    public TeacherBO find(String document) {
        return ListUtils.stream(PanacheTeacher.list("document", document))
                .map(element -> PanacheTeacherMapper.toDomain(((PanacheTeacher) element)))
                .findFirst()
                .orElse(null);

    }

    @Override
    public TeacherBO merge(TeacherBO teacherBO) {

        PanacheTeacher panache = PanacheTeacherMapper.toEntity(teacherBO);

        em.merge(panache);

        return PanacheTeacherMapper.toDomain(panache);
    }
}