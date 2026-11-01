public class DescontoPromocional implements EstrategiaDesconto {
    @Override
    public double calcular(double preco) {
        // Aplica 15% de desconto promocional
        return preco * 0.85;
    }
}