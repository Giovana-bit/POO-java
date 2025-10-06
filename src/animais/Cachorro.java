package animais;

public class Cachorro extends Animal {
    // ================================
    // Atributos específicos do cachorro
    // ================================
    private int tamanhoDoRabo;

    // OBS: como esse contador é de instância, cada cachorro terá o seu.
    static int numerosDeCachorros;


    // ================================
    // Construtor
    // ================================
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        // Chama o construtor da classe Animal
        super(nome, cor, altura, peso, estadoDeEspirito);

        this.tamanhoDoRabo = tamanhoDoRabo;

        // Incrementa contador
        numerosDeCachorros++;
    }


    // ================================
    // Encapsulamento (Getters e Setters)
    // ================================
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
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

    // OBS: já herdado de Animal
    // public String getEstadoDeEspirito() { return estadoDeEspirito; }

    public int getNumerosDeCachorros() {
        return numerosDeCachorros;
    }

    public void setNumerosDeCachorros(int numerosDeCachorros) {
        this.numerosDeCachorros = numerosDeCachorros;
    }


    // ================================
    // Métodos sobrescritos
    // ================================
    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", tamanhoDoRabo=" + tamanhoDoRabo +
                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au au!");
    }


    // ================================
    // Método de interação com o cachorro
    // Altera o estado de espírito de acordo com a ação
    // ================================
    public String interagir(String acao) {
        switch (acao) {
            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir!":
                this.estadoDeEspirito = "bravo";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
        }

        return estadoDeEspirito;
    }
}
