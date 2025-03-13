package dev.or.domain.entity.enums;

public enum EnumMedicalCondition implements IEnum {

    HIPERTENSAO("HIPERTENSAO", "Hipertensão"),
    DIABETES("DIABETES", "Diabetes"),
    ASMA("ASMA", "Asma"),
    ARTRITE("ARTRITE", "Artrite"),
    DOENCA_CORONARIANA("DOENCA_CORONARIANA", "Doença Coronária"),
    AVC("AVC", "Acidente Vascular Cerebral (AVC)"),
    DOENCAS_RESPIRATORIAS("DOENCAS_RESPIRATORIAS", "Doenças Respiratórias"),
    CANCER("CANCER", "Câncer"),
    OBESIDADE("OBESIDADE", "Obesidade"),
    RENAL_CRONICA("RENAL_CRONICA", "Doença Renal Crônica"),
    DOENCA_AUTOIMUNE("DOENCA_AUTOIMUNE", "Doença Autoimune"),
    ALERGIAS("ALERGIAS", "Alergias"),
    DISSERTAMENTO_GASTRICO("DISSERTAMENTO_GASTRICO", "Distúrbios Gástricos"),
    EPILEPSIA("EPILEPSIA", "Epilepsia"),
    HIPOTIREOIDISMO("HIPOTIREOIDISMO", "Hipotireoidismo"),
    HEPATITE("HEPATITE", "Hepatite"),
    GLAUCOMA("GLAUCOMA", "Glaucoma"),
    SINDROME_METABOLICA("SINDROME_METABOLICA", "Síndrome Metabólica");

    private final String key, value;

    private EnumMedicalCondition(String key, String value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String getKey() {
        return this.value;
    }

    @Override
    public boolean containsInEnum(String key) {
        for (EnumMedicalCondition en : EnumMedicalCondition.values()) {
            if (key.equalsIgnoreCase(en.getKey())) {
                return true;
            }
        }
        return false;
    }

}
