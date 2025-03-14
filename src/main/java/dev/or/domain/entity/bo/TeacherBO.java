package dev.or.domain.entity.bo;

/**
 *
 * @author Jhonatan
 */
public class TeacherBO {

    private Integer id;
    private String name;
    private String document;
    private String maritalStatus;
    private String nationality;
    private Integer age;
    private byte[] profileImg;
    private AddressBO address;

    public TeacherBO(Integer id, String name, String document, String maritalStatus, String nationality, Integer age,
            byte[] profileImg, AddressBO address) {
        this.id = id;
        this.name = name;
        this.document = document;
        this.maritalStatus = maritalStatus;
        this.nationality = nationality;
        this.age = age;
        this.profileImg = profileImg;
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

    public AddressBO getAddress() {
        return address;
    }
}