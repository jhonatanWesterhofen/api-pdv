package dev.or.domain.entity.bo;

import java.time.LocalDateTime;

public class AddressBO {

    private Integer id;
    private String address;
    private String city;
    private String state;
    private String street;
    private Integer number;
    private String neighborhood;
    private String complement;
    private LocalDateTime createdAt;

    public AddressBO(Integer id, String address, String city, String state, String street, Integer number,
            String neighborhood, String complement, LocalDateTime createdAt) {
        this.id = id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.street = street;
        this.number = number;
        this.neighborhood = neighborhood;
        this.complement = complement;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }

    public Integer getNumber() {
        return number;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getComplement() {
        return complement;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}