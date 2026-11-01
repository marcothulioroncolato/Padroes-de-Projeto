class RoboEntrega extends Robo {
    public RoboEntrega() {
        this.locomocao = new MoverComRodas();
        this.comunicacao = new ComunicarPorWifi();
        this.acao = new EntregarPacote();
    }
}