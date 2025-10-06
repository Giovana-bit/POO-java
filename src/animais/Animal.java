package animais;

public abstract class Animal {
    // ================================
    // Atributos comuns a todos os animais
    // ================================
    protected String nome;
    protected String cor;
    protected int altura;             // altura em cm, por exemplo
    protected double peso;            // peso em kg
    protected String estadoDeEspirito;


    // ================================
    // Construtor completo
    // Responsável por inicializar os atributos do animal
    // ================================
    public Animal(String nome, String cor, int altura, double peso, String estadoDeEspirito) {
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoDeEspirito = estadoDeEspirito;
    }

    public String getNome() {
        return nome;
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

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }


    // ================================
    // Métodos genéricos que todos os animais possuem
    // ================================

    // Exemplo: comportamento de comer (pode ser sobrescrito nas subclasses)
    protected void comer() {}

    // Exemplo: comportamento de dormir (pode ser sobrescrito nas subclasses)
    protected void dormir() {}

    // Exemplo: emitir som (deve ser sobrescrito pelas subclasses)
    public abstract void soar();
}