public class DescontoNormal implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        return preco;
    }
}