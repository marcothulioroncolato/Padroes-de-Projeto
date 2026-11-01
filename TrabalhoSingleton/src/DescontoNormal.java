public class DescontoNormal implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        // Sem desconto ou desconto base de 0%
        return preco;
    }
}

