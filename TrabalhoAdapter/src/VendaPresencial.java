public class VendaPresencial extends ProcessamentoVenda {

    public VendaPresencial(Vendedor vendedor, Documento documento) {
        super(vendedor, documento);
    }

    @Override
    protected void prepararVenda() {
        System.out.println("Preparando venda presencial na concessionária...");
    }
}