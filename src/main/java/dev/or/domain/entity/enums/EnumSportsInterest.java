package dev.or.domain.entity.enums;

/**
 *
 * @author Jhonatan
 */
public enum EnumSportsInterest implements IEnum {

    FUTEBOL("FUTEBOL", "FUTEBOL"),
    VOLEI("VÔLEI", "VÔLEI"),
    HANDEBOL("HANDEBOL", "HANDEBOL"),
    FUTSAL("FUTSAL", "FUTSAL"),
    BASQUETE("BASQUETE", "BASQUETE");

    private final String key, value;

    private EnumSportsInterest(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.value;
    }

    @Override
    public boolean containsInEnum(String key) {
        for (EnumSportsInterest en : EnumSportsInterest.values()) {
            if (key.equalsIgnoreCase(en.getKey())) {
                return true;
            }
        }
        return false;
    }

}