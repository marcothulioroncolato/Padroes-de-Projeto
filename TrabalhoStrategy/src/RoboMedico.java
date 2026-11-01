class RoboMedico extends Robo {
    public RoboMedico() {
        this.locomocao = new MoverComRodas();
        this.comunicacao = new ComunicarPorWifi();
        this.acao = new PrestarSocorro();
    }
}
