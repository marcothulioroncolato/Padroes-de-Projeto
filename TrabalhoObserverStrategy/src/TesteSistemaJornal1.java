
class TesteSistemaJornal1 {
    public static void main(String[] args) {
        System.out.println("=== Teste: Publicação e Múltiplas Estratégias ===");

        // Cria o jornal
        LeFigaroDigital jornal = new LeFigaroDigital();

        // Cri diferentes estratégias
        EstrategiaApresentacao estResumida = new ApresentacaoResumida();
        EstrategiaApresentacao estDetalhada = new ApresentacaoDetalhada();
        EstrategiaApresentacao estUrgente = new ApresentacaoUrgente();

        // Cria os aplicativos associados ao jornal e com estratégias iniciais
        AppCelular joao = new AppCelular("João", jornal, estResumida);
        AppTablet maria = new AppTablet("Maria", jornal, estDetalhada);
        AppWeb carlos = new AppWeb("Carlos", jornal, estResumida);
        AppSmartwatch stephane = new AppSmartwatch("Stephane", jornal, estUrgente);

        //Registra todos os aplicativos no jornal
        jornal.inscrever(joao);
        jornal.inscrever(maria);
        jornal.inscrever(carlos);
        jornal.inscrever(stephane);

        // Publicar uma notícia
        jornal.novaNoticia("Tempestade severa provoca interrupções prolongadas no transporte ferroviário de Paris.");
    }
}