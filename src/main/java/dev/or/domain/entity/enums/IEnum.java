package dev.or.domain.entity.enums;

/**
 *
 * @author Jhonatan
 */
public interface IEnum {

    public String getKey();

    public boolean containsInEnum(String key);
}