
public class TesteRobos {
    public static void main(String[] args) {
        Robo[] robos = new Robo[5];
        robos[0] = new RoboExplorador();
        robos[1] = new RoboSeguranca();
        robos[2] = new RoboEntrega();
        robos[3] = new RoboMedico();
        robos[4] = new RoboBombeiro();


        for (Robo r : robos) {
            System.out.println("----------------------------------------");
            System.out.println("Robô: " + r.getClass().getSimpleName());
            System.out.println("----------------------------------------");


            r.mover();
            r.comunicar();
            r.executarAcao();
            System.out.println();
        }

        System.out.println("=== Teste de troca dinâmica de comportamento ===");
        Robo roboTeste = robos[0]   ;
        System.out.println("Antes da troca (" + roboTeste.getClass().getSimpleName() + "):");
        roboTeste.mover();

        roboTeste.setLocomocao(new Voar());

        System.out.println("Depois da troca dinâmica:");
        roboTeste.mover();
    }
}