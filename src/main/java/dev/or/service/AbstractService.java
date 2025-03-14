package dev.or.service;

import dev.or.infra.database.panache.repositories.PanacheTeacherRepository;
import jakarta.inject.Inject;

/**
 *
 * @author Jhonatan
 */
public class AbstractService {

    @Inject
    protected PanacheTeacherRepository panacheTeacherRepository;

}