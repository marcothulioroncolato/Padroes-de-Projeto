public class VendaOnline extends ProcessamentoVenda {

    public VendaOnline(Vendedor vendedor, Documento documento) {
        super(vendedor, documento);
    }

    @Override
    protected void prepararVenda() {
        System.out.println("Preparando venda online via plataforma digital...");
    }
}