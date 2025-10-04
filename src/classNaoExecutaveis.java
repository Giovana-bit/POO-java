import animais.Cachorro;

public class classNaoExecutaveis {
    public static void main(String[] args) {

        //Variavel de referencia
        //Cria a variavel cachorro
        Cachorro cachorro1 = new Cachorro();

        //Definindo um cachorro
        cachorro1.nome = "Zoe";
        cachorro1.cor = "branco";
        cachorro1.peso = 8.5;
        cachorro1.tamanhoDoRabo = 10;

        //Endereço na memoria sobre o cachorro
        System.out.println(cachorro1);

        //Retorna meu print
        cachorro1.latir();

        //Retorna quando pega a bolinha
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        //Estado de espirito
        System.out.println("O cachorro está "+ cachorro1.interagir( "carinho"));
        System.out.println("O cachorro está "+ cachorro1.interagir( "vai dormir!"));
        System.out.println("O cachorro está "+ cachorro1.interagir( "nada"));

    }
}
