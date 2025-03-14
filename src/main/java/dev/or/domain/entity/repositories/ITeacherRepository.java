package dev.or.domain.entity.repositories;

import dev.or.domain.entity.bo.TeacherBO;

/**
 *
 * @author Jhonatan
 */
public interface ITeacherRepository {

    TeacherBO create(TeacherBO teacherBO);

    TeacherBO find(String document);

    TeacherBO merge(TeacherBO teacherBO);
}