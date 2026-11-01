public class RoboMedico extends Robo{

    @Override
    protected void locomover() {
        System.out.println("Movendo com Rodas");
    }
    @Override
    protected void comunicar() {
        System.out.println("Comunicação por Wifi");
    }

    @Override
    protected void executarAcao() {
        System.out.println("Realizando operação");
    }


}
