package dev.or.domain.entity.enums;

/**
 *
 * @author Jhonatan
 */
public enum EnumKinship implements IEnum {

    PAI("PAI", "Pai"),
    MAE("MAE", "Mãe"),
    IRMAO("IRMAO", "Irmão"),
    IRMA("IRMA", "Irmã"),
    AVO("AVO", "Avô"),
    TIO("TIO", "Tio"),
    TIA("TIA", "Tia"),
    PRIMO("PRIMO", "Primo"),
    PRIMA("PRIMA", "Prima"),
    FILHO("FILHO", "Filho"),
    FILHA("FILHA", "Filha"),
    CUNHADO("CUNHADO", "Cunhado"),
    SOBRINHO("SOBRINHO", "Sobrinho"),
    BISAVO("BISAVO", "Bisavô"),
    ENTEADO("ENTEADO", "Enteado");

    private final String key, value;

    private EnumKinship(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.value;
    }

    @Override
    public boolean containsInEnum(String key) {
        for (EnumKinship en : EnumKinship.values()) {
            if (key.equalsIgnoreCase(en.getKey())) {
                return true;
            }
        }
        return false;
    }
}