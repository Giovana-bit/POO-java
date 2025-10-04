package animais;

public class Cachorro {
    //Definindo caracteristicas do cachorro
    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    //Estado de espirito do cachorro
    public String estadoDeEspirito;

    //Métodos
    public void comer(){}

    public  void latir(){
        System.out.println("Au au!");
    }

    public String pegar(){
        return "Bolinha";
    }

    public String interagir(String acao){
        if (acao.equals("carinho")){
            this.estadoDeEspirito = "feliz";
            return estadoDeEspirito;
        }else if (acao.equals("vai dormir!")) {
            this.estadoDeEspirito = "bravo!";
        }else {
            this.estadoDeEspirito = "neutro";
        }

        return estadoDeEspirito;
    }
}
