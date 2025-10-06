package animais;

public class Animal {
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


    // ================================
    // Métodos genéricos que todos os animais possuem
    // ================================

    // Exemplo: comportamento de comer (pode ser sobrescrito nas subclasses)
    protected void comer() {}

    // Exemplo: comportamento de dormir (pode ser sobrescrito nas subclasses)
    protected void dormir() {}

    // Exemplo: emitir som (deve ser sobrescrito pelas subclasses)
    public void soar() {
        System.out.println(" ");
    }
}