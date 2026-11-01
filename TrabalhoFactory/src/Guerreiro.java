class Guerreiro extends Personagem {
    public Guerreiro(String nome, int vida) {
        super(nome, vida);
    }

    @Override
    public void atacar() {
        if (estrategiaAtaque != null) {
            estrategiaAtaque.atacar(nome);
        } else {
            System.out.println("Guerreiro " + nome + " ataca com espada.");
        }
    }
    }


