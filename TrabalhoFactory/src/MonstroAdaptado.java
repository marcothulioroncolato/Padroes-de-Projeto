class MonstroAdaptado extends Personagem {
    private MonstroAntigo monstroAntigo;

    public MonstroAdaptado(String nome,int vida) {
        super(nome,vida);
        this.monstroAntigo = new MonstroAntigo();
    }

    @Override
public void atacar() {
    monstroAntigo.executarGolpeAntigo();
    }
}