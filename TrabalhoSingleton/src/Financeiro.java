public class Financeiro implements Observer{
    private Vendedor vendedor;

    public Financeiro(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public void atualizar() {
        // Modelo Pull: consulta os dados diretamente no Vendedor
        System.out.println("Financeiro notificado: " + vendedor.getUltimoVeiculoVendido());
    }
}