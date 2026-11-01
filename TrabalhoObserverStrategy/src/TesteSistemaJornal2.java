class TesteSistemaJornal2 {
    public static void main(String[] args) {
        System.out.println("\n=== Teste: Cancelamentos e Mudança Dinâmica de Estratégia ===");

        LeFigaroDigital jornal = new LeFigaroDigital();

        EstrategiaApresentacao estResumida = new ApresentacaoResumida();
        EstrategiaApresentacao estDetalhada = new ApresentacaoDetalhada();
        EstrategiaApresentacao estUrgente = new ApresentacaoUrgente();

        AppCelular joao = new AppCelular("João", jornal, estResumida);
        AppTablet maria = new AppTablet("Maria", jornal, estDetalhada);
        AppWeb carlos = new AppWeb("Carlos", jornal, estResumida);
        AppSmartwatch stephane = new AppSmartwatch("Stephane", jornal, estUrgente);

        jornal.inscrever(joao);
        jornal.inscrever(maria);
        jornal.inscrever(carlos);
        jornal.inscrever(stephane);

        // Publica primeira notícia para verificar estado inicial
        System.out.println("\n>> Publicação 1:");
        jornal.novaNoticia("Tempestade provoca interrupções no transporte ferroviário do Brasil.");

        System.out.println("\n>> Alterando a estratégia do João para detalhada...");
        joao.setEstrategia(estDetalhada);

        System.out.println(">> Carlos cancelou sua assinatura.");
        jornal.cancelar(carlos);

        System.out.println("\n>>Segunda Publicação: ");
        jornal.novaNoticia("Vencedor da bola de ouro 2026 anunciado");

        System.out.println(">>Joao cancelou sua assinatura.");
        jornal.cancelar(joao);

        System.out.println(">>Alterando a estratégia da Maria para Urgente");
        maria.setEstrategia(estUrgente);

        System.out.println("\n>> Nova Publicação: ");
        jornal.novaNoticia("Tempestade provoca interrupções no transporte ferroviário de Dinamarca");
    }
}