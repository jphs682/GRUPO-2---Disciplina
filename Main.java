/**
 * Main
 */
public class Main {
  public static void main(String[] args) {

    Disciplina disciplina1 = new Disciplina("LPOO", 60);
    System.out.printf("Média mínima: %.1f%n", disciplina1.mediaMinima);
    System.out.printf("Limite de faltas: %d%n", disciplina1.limiteFaltas());
    System.out.printf("Aprovado por nota com média 6.9: %b%n", disciplina1.aprovadoPorNota(6.9));
    System.out.printf("Aprovado por nota com média 7.0: %b%n", disciplina1.aprovadoPorNota(7.0));
    System.out.printf("Aprovado por frequência com 15 faltas: %b%n", disciplina1.aprovadoPorFrequencia(15));
    System.out.printf("Aprovado por frequência com 16 faltas: %b%n", disciplina1.aprovadoPorFrequencia(16));

    disciplina1.exibir();
    disciplina1.alterarMediaMinima(6.0);
    System.out.printf("Aprovado por nota com média 6.5: %b%n", disciplina1.aprovadoPorNota(6.5));
  }

}
