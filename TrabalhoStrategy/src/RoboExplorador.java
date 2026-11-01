class RoboExplorador extends Robo {
    public RoboExplorador() {
        this.locomocao = new MoverComEsteira();
        this.comunicacao = new ComunicarPorRadio();
        this.acao = new ExplorarAmbiente();
    }
}
