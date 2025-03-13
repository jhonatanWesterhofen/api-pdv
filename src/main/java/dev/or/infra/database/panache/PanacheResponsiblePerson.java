package dev.or.infra.database.panache;

import dev.or.domain.entity.enums.EnumKinship;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "PD_RESPONSIBLE_PERSON")
public class PanacheResponsiblePerson extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID", sequenceName = "GEN_ID_RESPONSIBLE_PERSON", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_RESPONSIBLE_PERSON")
    private Integer id;

    @Column(name = "NAME_FIRST_RESPONSIBLE")
    private String nameFirstResponsible;

    @Column(name = "FONE_FIRST_RESPONSIBLE")
    private String foneFirstResponsible;

    @Column(name = "EMAIL_FIRST_RESPONSIBLE")
    private String emailFirstResponsible;

    @Column(name = "NAME")
    private String name;

    @Column(name = "FONE")
    private String fone;

    @Column(name = "EMAIL")
    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "RELATION_SHIP", updatable = false)
    private EnumKinship relationShip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameFirstResponsible() {
        return nameFirstResponsible;
    }

    public void setNameFirstResponsible(String nameFirstResponsible) {
        this.nameFirstResponsible = nameFirstResponsible;
    }

    public String getFoneFirstResponsible() {
        return foneFirstResponsible;
    }

    public void setFoneFirstResponsible(String foneFirstResponsible) {
        this.foneFirstResponsible = foneFirstResponsible;
    }

    public String getEmailFirstResponsible() {
        return emailFirstResponsible;
    }

    public void setEmailFirstResponsible(String emailFirstResponsible) {
        this.emailFirstResponsible = emailFirstResponsible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnumKinship getRelationShip() {
        return relationShip;
    }

    public void setRelationShip(EnumKinship relationShip) {
        this.relationShip = relationShip;
    }

}