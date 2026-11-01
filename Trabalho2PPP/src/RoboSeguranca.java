public class RoboSeguranca extends Robo{
    @Override
    protected void locomover() {
        System.out.println("Movendo com Rodas");
    }
    @Override
    protected void comunicar() {
        System.out.println("Comunicação por Rádio");
    }

    @Override
    protected void executarAcao() {
        System.out.println("Vigiando ambiente");
    }

}
