public class Estoque implements Observer {
    private Vendedor vendedor;

    public Estoque(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public void atualizar() {
        // Modelo Pull: consulta os dados diretamente no Vendedor
        System.out.println("Estoque notificado: " + vendedor.getUltimoVeiculoVendido());
    }
}

