
public class TesteRobo{
public static void main(String[] args){
    Robo[] robos = {
            new RoboEntrega(),
            new RoboBombeiro(),
            new RoboMedico(),
            new RoboExplorador(),
            new RoboSeguranca()
    };// percorre uma lista ou vetor onde cada elemento e tratado como do tipo da superclasse
    for (Robo robo : robos) {
        System.out.println(robo.getClass().getSimpleName()); //imprime um cabeçalho que identifica a
        // classe do robo que esta sendo processado
        robo.executarMissao();
        System.out.println();
    }
}
}
