package dev.or.domain.entity.enums;

/**
 *
 * @author Jhonatan
 */
public enum EnumCategory implements IEnum {

    SUB8("SUB-8", "SUB-8"),
    SUB10("SUB-10", "SUB-10"),
    SUB12("SUB-12", "SUB-12"),
    SUB14("SUB-14", "SUB-14"),
    SUB16("SUB-16", "SUB-16"),
    SUB18("SUB-18", "SUB-18"),
    SUB20("SUB-20", "SUB-20");

    private final String key, value;

    private EnumCategory(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.value;
    }

    @Override
    public boolean containsInEnum(String key) {
        for (EnumCategory en : EnumCategory.values()) {
            if (key.equalsIgnoreCase(en.getKey())) {
                return true;
            }
        }
        return false;
    }

}
