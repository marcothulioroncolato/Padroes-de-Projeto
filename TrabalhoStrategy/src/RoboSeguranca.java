class RoboSeguranca extends Robo {
    public RoboSeguranca() {
        this.locomocao = new MoverComRodas();
        this.comunicacao = new ComunicarPorRadio();
        this.acao = new VigiarArea();
    }
}
