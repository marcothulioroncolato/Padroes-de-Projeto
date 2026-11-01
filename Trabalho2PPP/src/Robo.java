public abstract class Robo {
    //metodo opcional que permite que a superclasse pergunte uma determinada etapa deve ser executada
    //ou nao durante o fluxo do template
    public final void executarMissao() {
        iniciarSistemas();
        locomover();
        comunicar();
        executarAcao();
        if (deveGerarRelatorio()) {
            gerarRelatorio();
        }
        finalizarMissao();
    }

    public boolean deveGerarRelatorio() {
        return true;
    }

    public void gerarRelatorio() {
        System.out.println("Gerando relatório da missão...");
    }

    public void iniciarSistemas() {
        System.out.println("Inicializando Sistema...");
    }

    public void finalizarMissao() {
        System.out.println("Finalizando a missão...");
    }

    protected abstract void locomover();
    protected abstract void comunicar();
    protected abstract void executarAcao();
}