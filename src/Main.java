import animais.Cachorro;
import animais.Gato;
import animais.Passaro;
import lojas.Petshop;

public class Main {
    public static void main(String[] args) {

        // ================================
        // Variáveis de referência
        // ================================

        // Cria a variável cachorro
        //Cachorro cachorro1 = new Cachorro(); // comentado porque o construtor exige parâmetros

        // Instanciando objetos de Cachorro
        Cachorro cachorro2 = new Cachorro("Zion", "marrom", 10, 5.5, 15, "nada");
        Cachorro cachorro3 = new Cachorro("Zoe", "branca", 15, 6.2, 15, "nada");

        // Instanciando objeto de Gato
        Gato gato1 = new Gato("Lua", "preto", 10, 5.2, "nada");

        // Instanciando objeto de Pássaro
        Passaro passaro1 = new Passaro("Pinho", "marrom", 3, 0.5, "nada");


        // ================================
        // Testando getters
        // ================================
        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getAltura());


        // ================================
        // Contagem de cachorros
        // OBS: como numerosDeCachorros não é static,
        // cada cachorro terá seu próprio contador.
        // ================================
        System.out.println(cachorro2.getNumerosDeCachorros());
        System.out.println(cachorro3.getNumerosDeCachorros());


        // ================================
        // Exibição com toString()
        // ================================
        System.out.println(cachorro2.toString());
        System.out.println(cachorro3.toString());


        // ================================
        // Exemplo de setters (não utilizado no momento)
        // ================================
        /*
        cachorro1.setNome("Zoe");
        cachorro1.setCor("Branco");
        cachorro1.setAltura(10);
        cachorro1.setPeso(8.5);
        cachorro1.setTamanhoDoRabo(10);
        */

        // Endereço na memória sobre o cachorro
        //System.out.println(cachorro1);


        // ================================
        // Sons dos animais
        // ================================
        cachorro2.soar();
        gato1.soar();
        passaro1.soar();


        // ================================
        // Retorna quando o cachorro pega a bolinha
        // OBS: método pegar() foi comentado na classe Cachorro
        // ================================
        //System.out.println("O cachorro pegou uma " + cachorro2.pegar());


        // ================================
        // Estado de espírito do cachorro
        // OBS: exemplo com interagir()
        // ================================
        /*
        System.out.println("O cachorro está " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro está " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro está " + cachorro1.interagir("nada"));
        */

        Petshop petshop = new Petshop();

        petshop.darBanho(passaro1);
        System.out.println(cachorro2.getEstadoDeEspirito());

        petshop.tosar(cachorro3);
        System.out.println(cachorro3.getEstadoDeEspirito());

        petshop.deixarNoHotel(gato1);
        System.out.println(gato1.getEstadoDeEspirito());
    }
}