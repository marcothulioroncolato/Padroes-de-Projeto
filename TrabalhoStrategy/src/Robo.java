public abstract class Robo {
    protected Locomocao locomocao;
    protected Comunicacao comunicacao;
    protected Acao acao;

    public void mover() {
        locomocao.mover();
    }

    public void comunicar() {
        comunicacao.comunicar();
    }

    public void executarAcao() {
        acao.executar();
    }

    // Setters para troca dinâmica exigidos na Parte 4
    public void setLocomocao(Locomocao locomocao) {
        this.locomocao = locomocao;
    }

    public void setComunicacao(Comunicacao comunicacao) {
        this.comunicacao = comunicacao;
    }

    public void setAcao(Acao acao) {
        this.acao = acao;
    }
}