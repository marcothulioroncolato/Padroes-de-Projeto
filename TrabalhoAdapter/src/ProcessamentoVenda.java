public abstract class ProcessamentoVenda {
    protected Vendedor vendedor;
    protected Documento documento;

    public ProcessamentoVenda(Vendedor vendedor, Documento documento) {
        this.vendedor = vendedor;
        this.documento = documento;
    }

    // Hook method que varia por herança
    protected abstract void prepararVenda();

    // Template Method: esqueleto fixo do algoritmo de venda
    public final void executarVenda(String veiculo, double precoBruto) {
        prepararVenda();

        double precoFinal = vendedor.calcularPrecoFinal(precoBruto);

        vendedor.concluirVenda(veiculo, precoFinal);

        documento.setConteudo("Comprovante de Venda do veículo: " + veiculo + " | Valor: R$ " + precoFinal);
        documento.desenha();
        documento.imprime();
    }
}