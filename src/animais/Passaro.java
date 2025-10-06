package animais;

public class Passaro extends Animal {
    // ================================
    // Atributo específico
    // assim todos os pássaros compartilham o mesmo valor.
    // ================================
    static int numeroDePassaros;


    // ================================
    // Construtor
    // Chama o construtor da classe Animal para inicializar os atributos herdados
    // ================================
    public Passaro(String nome, String cor, int altura ,double peso, String estadoDeEspirito){
        super(nome, cor, altura, peso, estadoDeEspirito);
        numeroDePassaros++; // incrementa contador sempre que cria um novo pássaro
    }


    // ================================
    // Sobrescrita do método toString
    // Retorna informações resumidas sobre o pássaro
    // ================================
    @Override
    public String toString() {
        return "Passaro{" +
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
        System.out.println("Piu piu!");
    }
}
