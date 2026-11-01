public class RoboBombeiro extends Robo{
    public RoboBombeiro() {
        this.locomocao = new MoverNaAgua();
        this.comunicacao = new ComunicarPorSatelite();
        this.acao = new ApagarIncendio();
    }
}
