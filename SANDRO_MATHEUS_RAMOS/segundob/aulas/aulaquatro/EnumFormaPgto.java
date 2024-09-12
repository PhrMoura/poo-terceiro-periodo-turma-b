package segundob.aulas.aulaquatro;

public enum EnumFormaPgto {

    PIX("PIX", "Pagamentos Instantaneos"),
    BOLETO("BOLETO", "Boleto"),
    CARTAO_DEBITO("CARTAO_DEBITO", "Cartão de Débito");

    private String key;

    private String descricao;

    EnumFormaPgto(String key, String descricao) {
        this.key = key;
        this.descricao = descricao;
    }

    public String getKey() {
        return key;
    }

    public String getDescricao() {
        return descricao;
    }

    public static EnumFormaPgto parseSrt(String str) {
        for (EnumFormaPgto enumPgto : EnumFormaPgto.values()) {
            if (enumPgto.getKey().equalsIgnoreCase(str)) {
                return enumPgto;
            }
        }

        return null;
    }

}
