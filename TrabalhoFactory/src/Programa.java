import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        FabricaPersonagens fabrica = new FabricaPersonagens();
        ArenaRPG arena = new ArenaRPG(fabrica);
        Scanner scanner = new Scanner(System.in);

        // Cenário 1: Vetor de tipos comuns
        String[] tiposComuns = {"guerreiro", "mago", "arqueiro"};

        for (String tipo : tiposComuns) {
            System.out.print("Digite o nome do " + tipo + ": ");
            String nome = scanner.nextLine();

            Personagem p = arena.adicionarPersonagem(tipo, nome);
            if (p != null) {
                p.setEstrategiaAtaque(new AtaqueNormal());
            }
        }

        System.out.println("\n--- Executando Ataques (Cenário 1) ---");
        arena.executarAtaques();

        // Cenário 2: Troca de estratégia do Guerreiro para Especial
        // (Buscando o guerreiro criado ou instanciando para demonstração do cenário)
        System.out.println("\n--- Cenário 2: Testando Troca de Estratégia ---");
        Personagem guerreiroTeste = arena.adicionarPersonagem("guerreiro", "Arthur");
        if (guerreiroTeste != null) {
            guerreiroTeste.setEstrategiaAtaque(new AtaqueNormal());
            guerreiroTeste.atacar();

            guerreiroTeste.setEstrategiaAtaque(new AtaqueEspecial());
            guerreiroTeste.atacar();
        }

        // Cenário 3: Adicionar Monstro (Adapter)
        System.out.println("\n--- Cenário 3: Monstro Legado ---");
        Personagem monstro = arena.adicionarPersonagem("monstro", "Goblin Chefão");
        if (monstro != null) {
            monstro.atacar();
        }

        scanner.close();
    }
}