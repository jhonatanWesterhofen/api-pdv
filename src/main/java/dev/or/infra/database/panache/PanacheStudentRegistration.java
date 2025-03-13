package dev.or.infra.database.panache;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import dev.or.domain.entity.enums.EnumCategory;
import dev.or.domain.entity.enums.EnumSportsInterest;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "PD_STUDENT_REGISTRATION")
public class PanacheStudentRegistration extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID", sequenceName = "GEN_ID_STUDENT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_STUDENT")
    private Integer id;

    @CreationTimestamp
    @Column(name = "FREE_DAY", updatable = false)
    private LocalDate freeDay;

    @CreationTimestamp
    @Column(name = "FREE_TIME", updatable = false)
    private LocalTime freeTime;

    @Enumerated(EnumType.STRING)
    @Column(name = "CATEGORY", updatable = false)
    private EnumCategory category;

    @Enumerated(EnumType.STRING)
    @Column(name = "SPORT_INTEREST", updatable = false)
    private EnumSportsInterest sportInterest;

    @JoinColumn(name = "ID_RESPONSIBLE_PERSON", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private PanacheResponsiblePerson personResponsible;

    @OneToMany(mappedBy = "studentRegistration", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<PanacheHealthInformation> healthInformations;

    @Column(name = "ACTIVE")
    private boolean active;

    @CreationTimestamp
    @Column(name = "CREATED_AT", updatable = false)
    private LocalDateTime createdAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFreeDay() {
        return freeDay;
    }

    public void setFreeDay(LocalDate freeDay) {
        this.freeDay = freeDay;
    }

    public LocalTime getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(LocalTime createdTime) {
        this.freeTime = createdTime;
    }

    public EnumCategory getCategory() {
        return category;
    }

    public void setCategory(EnumCategory category) {
        this.category = category;
    }

    public EnumSportsInterest getSportInterest() {
        return sportInterest;
    }

    public void setSportInterest(EnumSportsInterest sportInterest) {
        this.sportInterest = sportInterest;
    }

    public PanacheResponsiblePerson getPersonResponsible() {
        return personResponsible;
    }

    public void setPersonResponsible(PanacheResponsiblePerson personResponsible) {
        this.personResponsible = personResponsible;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<PanacheHealthInformation> getHealthInformations() {
        return healthInformations;
    }

    public void setHealthInformations(List<PanacheHealthInformation> healthInformations) {
        this.healthInformations = healthInformations;
    }
}