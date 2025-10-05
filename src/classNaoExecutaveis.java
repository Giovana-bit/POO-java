import animais.Cachorro;

public class classNaoExecutaveis {
    public static void main(String[] args) {

        // Variavel de referencia
        // Cria a variavel cachorro
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("Zion", "marrom",10, 5.5, 15, "nada");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getAltura());

        // Definindo um cachorro
        /*cachorro1.setNome("Zoe");
        cachorro1.setCor("Branco");
        cachorro1.setAltura(10);
        cachorro1.setPeso(8.5);
        cachorro1.setTamanhoDoRabo(10); */

        // Endereço na memória sobre o cachorro
        System.out.println(cachorro1);

        // Retorna meu print
        cachorro1.latir();

        // Retorna quando pega a bolinha
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        // Estado de espírito
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
    }
}