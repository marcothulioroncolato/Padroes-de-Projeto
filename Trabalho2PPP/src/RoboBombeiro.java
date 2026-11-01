public class RoboBombeiro extends Robo{

    @Override
    protected void locomover() {
        System.out.println("Mover com Esteira");
    }

    @Override
    protected void comunicar() {
        System.out.println("Comunicar por Satelite");
    }

    @Override
    protected void executarAcao() {
        System.out.println("Apagar Incendio");
    }
}
