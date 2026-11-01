class ApresentacaoResumida implements EstrategiaApresentacao {
    @Override
    public String apresentar(String noticia) {
        //Tamanho da notícia limitado a 40 caracteres
        int limite = Math.min(noticia.length(), 40);
        return "RESUMO: " + noticia.substring(0, limite) + "...";
    }
}