public class Auditoria implements Observer{
    private Vendedor vendedor;

    public   Auditoria(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    @Override
    public void atualizar() {
        System.out.println("Auditoria notificado: " + vendedor.getUltimoVeiculoVendido());
    }
}
