public abstract class Personagem {
    protected String nome;
    protected int vida;
    protected EstrategiaAtaque estrategiaAtaque;

    public Personagem(String nome, int vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void setEstrategiaAtaque(EstrategiaAtaque estrategiaAtaque) {
        this.estrategiaAtaque = estrategiaAtaque;
    }

    public abstract void atacar();

    public String getNome() {
        return nome;
    }
}