package dev.or.infra.database.panache;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

/**
 *
 * @author Jhonatan
 */
@Entity
@Table(name = "PD_PERSON")
public class PanacheTeacher extends PanacheEntityBase {

    @Id
    @SequenceGenerator(name = "ID", sequenceName = "GEN_ID_PERSON", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_PERSON")
    private Integer id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "DOCUMENT")
    private String document;

    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    @Column(name = "NATIONALITY")
    private String nationality;

    @Column(name = "AGE")
    private Integer age;

    @Column(name = "PROFILE_IMG", columnDefinition = "BYTEA")
    private byte[] profileImg;

    @CreationTimestamp
    @Column(name = "CREATED_AT", updatable = false)
    private LocalDateTime createdAt;

    @JoinColumn(name = "ID_ADDRESS", referencedColumnName = "ID")
    @OneToOne(fetch = FetchType.LAZY)
    private PanacheAddress address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public byte[] getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(byte[] profileImg) {
        this.profileImg = profileImg;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PanacheAddress getAddress() {
        return address;
    }

    public void setAddress(PanacheAddress address) {
        this.address = address;
    }

}