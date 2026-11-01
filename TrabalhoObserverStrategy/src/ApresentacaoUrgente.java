public class ApresentacaoUrgente implements EstrategiaApresentacao {
    @Override
    public String apresentar(String noticia) {
        return "URGENTE: " + noticia;
    }
}
