public class ComponentePdf {
    public void pdfFixaConteudo(String conteudo) {
        System.out.println("[ComponentePdf Legado] Fixando conteúdo: " + conteudo);
    }

    public void pdfPreparaExibicao() {
        System.out.println("[ComponentePdf Legado] 1/3 - Preparando exibição do PDF...");
    }

    public void pdfAtualiza() {
        System.out.println("[ComponentePdf Legado] 2/3 - Atualizando estado do PDF...");
    }

    public void pdfFinalizaExibicao() {
        System.out.println("[ComponentePdf Legado] 3/3 - Finalizando exibição do PDF...");
    }

    public void pdfEnviaImpressora() {
        System.out.println("[ComponentePdf Legado] Enviando PDF para a impressora...");
    }
}