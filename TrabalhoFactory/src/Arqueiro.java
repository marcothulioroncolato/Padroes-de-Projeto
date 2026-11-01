public class Arqueiro extends Personagem {
    public Arqueiro(String nome,int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        if (estrategiaAtaque != null) {
            estrategiaAtaque.atacar(nome);
        } else {
            System.out.println("Arqueiro " + nome + " ataca com arco.");
        }
    }
}

