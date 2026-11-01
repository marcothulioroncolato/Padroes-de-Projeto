import java.util.ArrayList;
import java.util.List;

 class ArenaRPG {
    private FabricaPersonagens fabrica;
    private List<Personagem> personagens;

    public ArenaRPG(FabricaPersonagens fabrica) {
        this.fabrica = fabrica;
        this.personagens = new ArrayList<>();
    }

    public Personagem adicionarPersonagem(String tipo, String nome) {
        Personagem p = fabrica.criarPersonagem(tipo, nome);
        if (p != null) {
            personagens.add(p);
        }
        return p;
    }

    public void executarAtaques() {
        for (Personagem p : personagens) {
            p.atacar();
        }
    }
}