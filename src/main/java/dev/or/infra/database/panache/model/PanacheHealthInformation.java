package dev.or.infra.database.panache.model;

import dev.or.domain.entity.enums.EnumMedicalCondition;
import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "PD_STUDENT_REGISTRATION")
public class PanacheHealthInformation extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID", sequenceName = "GEN_ID_STUDENT", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_STUDENT")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(name = "MEDICAL_CONDITION", updatable = false)
    private EnumMedicalCondition medicalCondition;

    @Column(name = "MEDICINE")
    private String medicine;

    @Column(name = "RESTRICTION_PHYSICAL")
    private String restrictionPhysical;

    @Column(name = "HEALTH_PLAN")
    private String healthPlan;

    @Column(name = "EMERGENCY_CONTACT")
    private String emergencyContact;

    @JoinColumn(name = "ID_STUDENT_REGISTRATION", referencedColumnName = "ID")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private PanacheStudentRegistration studentRegistration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EnumMedicalCondition getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(EnumMedicalCondition medicalCondition) {
        this.medicalCondition = medicalCondition;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getRestrictionPhysical() {
        return restrictionPhysical;
    }

    public void setRestrictionPhysical(String restrictionPhysical) {
        this.restrictionPhysical = restrictionPhysical;
    }

    public String getHealthPlan() {
        return healthPlan;
    }

    public void setHealthPlan(String healthPlan) {
        this.healthPlan = healthPlan;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public PanacheStudentRegistration getStudentRegistration() {
        return studentRegistration;
    }

    public void setStudentRegistration(PanacheStudentRegistration studentRegistration) {
        this.studentRegistration = studentRegistration;
    }

}