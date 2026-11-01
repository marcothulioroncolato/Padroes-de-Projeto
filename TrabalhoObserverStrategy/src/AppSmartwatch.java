public class AppSmartwatch implements AssinanteApp {
    private String usuario;
    private JornalDigital jornal;
    private EstrategiaApresentacao estrategia;

    public AppSmartwatch(String usuario, JornalDigital jornal, EstrategiaApresentacao estrategia) {
        this.estrategia = estrategia;
        this.jornal = jornal;
        this.usuario = usuario;
    }
    public void setEstrategia(EstrategiaApresentacao estrategia) {
        this.estrategia = estrategia;
    }


    public void atualizar() {
        String noticia = jornal.getNoticia();
        String texto = estrategia.apresentar(noticia);
        System.out.println(usuario + " [AppSmartwatch]: " + texto);
    }
}
