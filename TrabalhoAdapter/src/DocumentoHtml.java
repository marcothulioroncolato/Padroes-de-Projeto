public class DocumentoHtml implements Documento {
    private String conteudo;

    @Override
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    @Override
    public void desenha() {
        System.out.println("[HTML] Desenhando comprovante: " + conteudo);
    }

    @Override
    public void imprime() {
        System.out.println("[HTML] Imprimindo documento HTML...");
    }
}