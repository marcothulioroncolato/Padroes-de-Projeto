import java.util.ArrayList;
import java.util.List;

public class Vendedor {
    private String nome;
    private String endereco;
    private String email;

    // Instância única do Singleton
    private static Vendedor instancia;

    private EstrategiaDesconto estrategia;
    private List<Observer> observadores = new ArrayList<>();

    private String ultimoVeiculoVendido;
    private double ultimoPrecoFinal;

    // Construtor privado impede instanciação externa via 'new'
    private Vendedor() {}

    // Ponto de acesso global com criação lazy
    public static synchronized Vendedor getInstance() {
        if (instancia == null) {
            instancia = new Vendedor();
        }
        return instancia;
    }

    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setEmail(String email) { this.email = email; }

    public void exibir() {
        System.out.println("Vendedor: " + nome + ", Endereço: " + endereco + ", E-mail: " + email);
    }

    public void setEstrategia(EstrategiaDesconto estrategia) {
        this.estrategia = estrategia;
    }

    public double calcularPrecoFinal(double preco) {
        if (estrategia == null) {
            return preco; // Comportamento padrão caso nenhuma estratégia esteja definida
        }
        return estrategia.calcular(preco);
    }

    public void adicionarObservador(Observer o) {
        observadores.add(o);
    }

    public void removerObservador(Observer o) {
        observadores.remove(o);
    }

    public void notificarObservadores() {
        for (Observer o : observadores) {
            o.atualizar();
        }
    }

    public String getUltimoVeiculoVendido() {
        return ultimoVeiculoVendido;
    }

    public double getUltimoPrecoFinal() {
        return ultimoPrecoFinal;
    }

    public void concluirVenda(String veiculo, double precoBruto) {
        this.ultimoVeiculoVendido = veiculo;
        this.ultimoPrecoFinal = calcularPrecoFinal(precoBruto);

        System.out.println("Venda: " + veiculo + " - preço final: " + this.ultimoPrecoFinal);
        notificarObservadores();
    }
}