package animais;

public class Gato extends Animal {
    // ================================
    // Atributo específico
    // OBS: static faz o contador ser compartilhado entre todos os gatos
    // ================================
    static int numeroDeGatos;

    // ================================
    // Construtor
    // Chama o construtor da classe Animal para inicializar os atributos herdados
    // ================================
    public Gato(String nome, String cor, int altura ,double peso, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroDeGatos++; // incrementa contador a cada gato criado
    }

    // ================================
    // Sobrescrita do método toString
    // Retorna informações resumidas sobre o gato
    // ================================
    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                ", estadoDeEspirito='" + estadoDeEspirito + '\'' +
                '}';
    }

    // ================================
    // Sobrescrita do método soar
    // Cada animal tem seu próprio som
    // ================================
    @Override
    public void soar() {
        System.out.println("Miau Miau!");
    }
}
