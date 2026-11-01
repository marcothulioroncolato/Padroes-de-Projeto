import java.util.ArrayList;
import java.util.List;
public class Vendedor {

    private String nome;
    private String endereco;
    private String email;

    private static Vendedor instancia;
    private EstrategiaDesconto estrategia;

    List<ObservadorVenda> observadores = new ArrayList<>();
   private String ultimoVeiculo;
   private double ultimoPrecoFinal;

    private Vendedor() {
    }

    public static Vendedor getInstance() {
        if (instancia == null) {
            instancia = new Vendedor();
        }
        return instancia;
    }
    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setEmail(String email) { this.email = email; }

    public double getUltimoPrecoFinal() {
        return ultimoPrecoFinal;
    }

    public String getUltimoVeiculo() {
        return ultimoVeiculo;
    }

    public void adicionarObservador(ObservadorVenda o){
        observadores.add(o);
    }
    public void removerObservador(ObservadorVenda o){
        observadores.remove(o);
    }
    protected void notificarObservador(){
        for(ObservadorVenda o : observadores){
            o.atualizar();
        }
    }

    public void concluirVenda(String veiculo, double precoFinal) {
        this.ultimoVeiculo = veiculo;
        this.ultimoPrecoFinal = precoFinal;

        System.out.println("Registro da venda: " + veiculo + " - Preço final: " + precoFinal);
        notificarObservador();
    }



    public void setEstrategia(EstrategiaDesconto e){
    this.estrategia = e;
    }

    public double calcularPrecoFinal(double preco){
    return estrategia.calcular(preco);
    }
}
