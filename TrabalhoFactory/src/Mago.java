 class Mago extends Personagem {
     public Mago(String nome, int vida) {
         super(nome, vida);
     }

     @Override
     public void atacar(){   if (estrategiaAtaque != null) {
         estrategiaAtaque.atacar(nome);
     } else {
         System.out.println("Mago " + nome + " utiliza magia.");
     }
 }
 }


