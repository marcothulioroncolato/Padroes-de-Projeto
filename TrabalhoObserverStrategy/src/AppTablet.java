class AppTablet implements AssinanteApp {
    private String usuario;
    private JornalDigital jornal;
    private EstrategiaApresentacao estrategia;

    public AppTablet(String usuario, JornalDigital jornal, EstrategiaApresentacao estrategia) {
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
        System.out.println(usuario + " [AppTablet]: " + texto);
    }
}