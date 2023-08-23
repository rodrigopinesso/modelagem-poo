public enum Tipoveiculo {

    carga("Automovel de carga"),

    passeio("Automovel de passeio");

    private String automovel;

    Tipoveiculo(String automovel) {
        this.automovel = automovel;
    }

    public String getAutomovel() {
        return this.automovel;
    }
}