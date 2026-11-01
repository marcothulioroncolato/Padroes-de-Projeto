public class RoboEntrega extends Robo{
    @Override
    protected void locomover() {
        System.out.println("Movendo com Rodas");
    }
    @Override
    protected void comunicar() {
        System.out.println("Comunicacao por Wifi");
    }

    @Override
    protected void executarAcao() {
        System.out.println("Realizando entrega");
    }

    @Override
    public boolean deveGerarRelatorio() {
        return false;
    }
}
