class ApresentacaoDetalhada implements EstrategiaApresentacao {
    @Override
    public String apresentar(String noticia) {
        //Tamanho da noticia não possui limites, NOTICIA DETALHADA
        return "DETALHES: " + noticia;
    }
}