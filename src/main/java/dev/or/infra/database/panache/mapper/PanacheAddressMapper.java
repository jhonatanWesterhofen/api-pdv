package dev.or.infra.database.panache.mapper;

import dev.or.domain.entity.bo.AddressBO;
import dev.or.infra.database.panache.model.PanacheAddress;

/**
 *
 * @author Jhonatan
 */
public class PanacheAddressMapper {

    public static AddressBO toDomain(PanacheAddress entity) {

        if (entity == null) {
            return null;
        }

        return new AddressBO(
                entity.getId(),
                entity.getAdress(),
                entity.getCity(),
                entity.getState(),
                entity.getStreet(),
                entity.getNumber(),
                entity.getNeighborhood(),
                entity.getComplement(),
                entity.getCreatedAt());
    }

    public static PanacheAddress toEntity(AddressBO bo) {

        if (bo == null) {
            return null;
        }

        PanacheAddress panacheAddress = new PanacheAddress();

        panacheAddress.setId(bo.getId());
        panacheAddress.setAdress(bo.getAddress());
        panacheAddress.setCity(bo.getCity());
        panacheAddress.setState(bo.getState());
        panacheAddress.setStreet(bo.getStreet());
        panacheAddress.setNumber(bo.getNumber());
        panacheAddress.setNeighborhood(bo.getNeighborhood());
        panacheAddress.setComplement(bo.getComplement());
        panacheAddress.setCreatedAt(bo.getCreatedAt());

        return panacheAddress;
    }
}
