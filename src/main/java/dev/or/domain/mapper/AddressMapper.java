package dev.or.domain.mapper;

import dev.or.domain.entity.bo.AddressBO;
import dev.or.domain.entity.dto.AddressDTO;

/**
 *
 * @author Jhonatan
 */
public class AddressMapper {

    public static AddressDTO toDTO(AddressBO addressBO) {

        if (addressBO == null) {
            return null;
        }

        var addressDTO = new AddressDTO();

        addressDTO.setId(addressBO.getId());
        addressDTO.setAddress(addressBO.getAddress());
        addressDTO.setCity(addressBO.getCity());
        addressDTO.setState(addressBO.getState());
        addressDTO.setStreet(addressBO.getStreet());
        addressDTO.setNumber(addressBO.getNumber());
        addressDTO.setNeighborhood(addressBO.getNeighborhood());
        addressDTO.setComplement(addressBO.getComplement());
        addressDTO.setCreatedAt(addressBO.getCreatedAt());

        return addressDTO;
    }

    public static AddressBO toBO(AddressDTO addressDTO) {

        if (addressDTO == null) {
            return null;
        }

        var addressBO = new AddressBO(
                addressDTO.getId(),
                addressDTO.getAddress(),
                addressDTO.getCity(),
                addressDTO.getState(),
                addressDTO.getStreet(),
                addressDTO.getNumber(),
                addressDTO.getNeighborhood(),
                addressDTO.getComplement(),
                addressDTO.getCreatedAt());

        return addressBO;
    }

}
