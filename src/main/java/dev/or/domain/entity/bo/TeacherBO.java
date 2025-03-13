package dev.or.domain.entity.bo;

import java.time.LocalDateTime;

public class TeacherBO {

    private Integer id;
    private String name;
    private String document;
    private String maritalStatus;
    private String nationality;
    private Integer age;
    private byte[] profileImg;
    private LocalDateTime createdAt;
    private AddressBO address;

    public TeacherBO(Integer id, String name, String document, String maritalStatus, String nationality, Integer age,
            byte[] profileImg, LocalDateTime createdAt, AddressBO address) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.age = age;
        this.profileImg = profileImg;
        this.createdAt = createdAt;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDocument() {
        return document;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getNationality() {
        return nationality;
    }

    public Integer getAge() {
        return age;
    }

    public byte[] getProfileImg() {
        return profileImg;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public AddressBO getAddress() {
        return address;
    }
}