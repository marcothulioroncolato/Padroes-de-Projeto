class AppWeb implements AssinanteApp {
    private String usuario; //
    private JornalDigital jornal; //permite que o app consulte a noticia quando for notificado
    private EstrategiaApresentacao estrategia; // define como a noticia sera apresentada

    public AppWeb(String usuario, JornalDigital jornal, EstrategiaApresentacao estrategia) {
        this.usuario = usuario;
        this.jornal = jornal;
        this.estrategia = estrategia;
    }

    public void setEstrategia(EstrategiaApresentacao estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void atualizar() {
        String noticia = jornal.getNoticia();
        String texto = estrategia.apresentar(noticia);
        System.out.println(usuario + " [AppWeb]: " + texto);
    }
}