public class Disciplina {
  String nome;
  int cargaHoraria;
  double mediaMinima = 7.0;
  double percentualFaltas = 0.25;

  public Disciplina(String nome, int cargaHoraria) {
    this.nome = nome;
    this.cargaHoraria = cargaHoraria;
  }

  // Método limiteFaltas
  public int limiteFaltas() {
    return (int) (this.cargaHoraria * this.percentualFaltas);
  }

  // Método aprovadoPorNota
  public boolean aprovadoPorNota(double media) {
    return media >= this.mediaMinima;
  }

  // Método aprovadoPorFrequencia

  public boolean aprovadoPorFrequencia(int faltas) {
    return faltas <= this.limiteFaltas();
  }

  // Método alterarMediaMinima

  public void alterarMediaMinima(double novaMedia) {
    this.mediaMinima = novaMedia;
  }

  // Método exibir
  public void exibir() {
    System.out.printf("%s - %dh - limite de faltas: %d%n", this.nome, this.cargaHoraria, this.limiteFaltas());
  }

}
