public class RoboExplorador extends Robo {
    @Override
    protected void locomover(){
        System.out.println("Movendo com Esteira");
    }
    @Override
    protected void comunicar(){
        System.out.println("Comunicando por rádio");
    }

    @Override
    protected void executarAcao() {
        System.out.println("Explorando ambiente");
    }
}
