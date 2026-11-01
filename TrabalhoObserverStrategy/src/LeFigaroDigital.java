import java.util.ArrayList;
import java.util.List;

class LeFigaroDigital implements JornalDigital {
    private List<AssinanteApp> assinantes = new ArrayList<>();
    private String noticia;

    //adiciona novos aplicativos a lista de assinantes
    @Override
    public void inscrever(AssinanteApp a) {
        assinantes.add(a);
    }

    //remove aplicativo da lista de assinante
    @Override
    public void cancelar(AssinanteApp a) {
        assinantes.remove(a);
    }

    //notifica os assinantes da nova noticia pelo for each
    @Override
    public void notificar() {
        for (AssinanteApp a : assinantes) {
            a.atualizar();
        }
    }
    //atualiza o texto da noticia
    public void novaNoticia(String noticia) {
        this.noticia = noticia;
        notificar(); // Dispara a notificação automática aos assinantes
    }

    @Override
    public String getNoticia() {
        return this.noticia;
    }
}