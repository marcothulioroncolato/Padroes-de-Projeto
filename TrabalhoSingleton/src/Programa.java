public class Programa {
    public static void main(String[] args) {
        System.out.println("Inicializando vendedor...");

        // 1. Obter Vendedor v1
        Vendedor v1 = Vendedor.getInstance();

        // 2. Configurar dados
        v1.setNome("Carlos Silva");
        v1.setEndereco("Av. Central, 1000"); // Nota: ajuste o método conforme o atributo se necessário
        v1.setEmail("carlos@ufu.br");

        // 3. Criar Estoque e Financeiro passando v1 e cadastrá-los
        Estoque estoque = new Estoque(v1);
        Financeiro financeiro = new Financeiro(v1);
        Auditoria auditoria = new Auditoria(v1);

        v1.adicionarObservador(estoque);
        v1.adicionarObservador(financeiro);
        v1.adicionarObservador(auditoria);

        // 4. Selecionar DescontoNormal e concluir primeira venda
        v1.setEstrategia(new DescontoNormal());
        v1.concluirVenda("Veículo A", 50000.0);

        System.out.println("--------------------------------------------------");

        // 5. Trocar para DescontoPromocional em tempo de execução e concluir segunda venda
        v1.setEstrategia(new DescontoPromocional());
        v1.concluirVenda("Veículo B", 60000.0);

        System.out.println("--------------------------------------------------");

        // 6. Obter Vendedor v2
        Vendedor v2 = Vendedor.getInstance();

        v2.setNome("Otavio ");
        v2.setEndereco("Rua das Aguas, 270");
        v2.setEmail("Otavio@ufu.br");

        v2.setEstrategia(new DescontoFuncionario());
        v2.concluirVenda("Veiculo A", 50000.0);

        System.out.println("--------------------------------------------------");
        // 7. Exibir v1 == v2 para comprovar que apontam para o mesmo objeto
        //System.out.println("Mesmo vendedor? " + (v1 == v2));
    }
}