package animais;

public class Cachorro {
    //Atributos
    //Definindo caracteristicas do cachorro
    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;
    private int numerosDeCachorros;

    //Construtor padrão - recebe nada
    public Cachorro(){}

    //Construtores adicionados
     public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numerosDeCachorros ++;
    }

    //Estado de espirito do cachorro
    private String estadoDeEspirito;

    //Encapsulamento
    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public int getNumerosDeCachorros() {
        return numerosDeCachorros;
    }

    public void setNumerosDeCachorros(int numerosDeCachorros) {
        this.numerosDeCachorros = numerosDeCachorros;
    }

    //Métodos
    public void comer(){}

    public  void latir(){
        System.out.println("Au au!");
    }

    public String pegar(){
        return "Bolinha";
    }


    @Override
    public String toString() {
        return "Cachorro{" +
                "nome = '" + nome + '\'' +
                '}';
    }

    public String interagir(String acao){
        //Substituindo pelo swhitch
        switch (acao) {
            case "carinho" : this.estadoDeEspirito = "feliz"; break;
            case "vai dormir!" : this.estadoDeEspirito = "bravo"; break;
            case "pisar na patinha" : this.estadoDeEspirito = "triste"; break;

            default: this.estadoDeEspirito = "neutro";
        }

       /* if (acao.equals("carinho")){
            this.estadoDeEspirito = "feliz";
            return estadoDeEspirito;
        }else if (acao.equals("vai dormir!")) {
            this.estadoDeEspirito = "bravo!";
        }else {
            this.estadoDeEspirito = "neutro";
        }
        */



        return estadoDeEspirito;
    }
}
