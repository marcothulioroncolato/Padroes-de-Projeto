public class DescontoFuncionario implements EstrategiaDesconto{
    @Override
    public double calcular(double preco) {
        return preco * 0.90;
    }
}
