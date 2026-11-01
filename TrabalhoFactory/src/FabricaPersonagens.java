public class FabricaPersonagens {
    public Personagem criarPersonagem(String tipo, String nome) {
        if (tipo == null) {
            return null;
        }

        switch (tipo.toLowerCase()) {
            case "guerreiro":
                return new Guerreiro(nome ,100);
            case "mago":
                return new Mago(nome ,100);
            case "arqueiro":
                return new Arqueiro(nome ,100);
            case "monstro":
                return new MonstroAdaptado(nome ,100);
            default:
                System.out.println("Tipo desconhecido: " + tipo);
                return null;
        }
    }
}