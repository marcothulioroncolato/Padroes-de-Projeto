public class Programa {
    public static void main(String[] args) {
        System.out.println("=== INICIALIZANDO SISTEMA ===");

        // 1. Obter Vendedor Singleton
        Vendedor v1 = Vendedor.getInstance();
        v1.setNome("Carlos Silva");
        v1.setEndereco("Av. Central, 1000");
        v1.setEmail("carlos@concessionaria.com");

        // 2. Criar e registrar observadores
        Estoque estoque = new Estoque(v1);
        Financeiro financeiro = new Financeiro(v1);

        v1.adicionarObservador(estoque);
        v1.adicionarObservador(financeiro);

        System.out.println("\n--- CENÁRIO 1: Venda Presencial com HTML e Desconto Normal ---");
        v1.setEstrategia(new DescontoNormal());
        Documento docHtml = new DocumentoHtml();

        ProcessamentoVenda venda1 = new VendaPresencial(v1, docHtml);
        venda1.executarVenda("Veículo A", 50000.0);

        System.out.println("\n--- CENÁRIO 2: Venda Online com PDF (Adapter) e Desconto Promocional ---");
        v1.setEstrategia(new DescontoPromocional());

        ComponentePdf componenteLegado = new ComponentePdf();
        Documento docPdf = new DocumentoPdf(componenteLegado); // Usando o Adapter

        ProcessamentoVenda venda2 = new VendaOnline(v1, docPdf);
        venda2.executarVenda("Veículo B", 60000.0);

        System.out.println("\n--- CENÁRIO 3: Remover Financeiro e executar Venda Presencial (Veículo C) ---");
        v1.removerObservador(financeiro); // Financeiro não deve ser notificado
        v1.setEstrategia(new DescontoPromocional());

        Documento docHtml2 = new DocumentoHtml();
        ProcessamentoVenda venda3 = new VendaPresencial(v1, docHtml2);
        venda3.executarVenda("Veículo C", 40000.0);

        System.out.println("\n=== COMPROVAÇÃO DO SINGLETON ===");
        Vendedor v2 = Vendedor.getInstance();
        System.out.println("v1 == v2? " + (v1 == v2));
    }
}