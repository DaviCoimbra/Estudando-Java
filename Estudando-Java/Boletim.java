import java.util.*;

public class Boletim {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Sistema de Boletim");
    
    System.out.print("Quantos alunos você vai registrar as notas:");
    int qtdAluno = input.nextInt();
    
    System.out.print("Quantos bimestres vai registrar:");
    int qtdBimestre = input.nextInt();
    
    System.out.println("");

    double[][] notas = new double[qtdAluno][qtdBimestre];

    for (int i = 0; i < notas.length; i++) {
      for (int j = 0; j < notas[i].length; j++) {
        System.out.print("Digite a " + (j + 1) + "° nota do " + (i + 1) + "° aluno: ");
        notas[i][j] = input.nextDouble();
      }
    }

    for (int index = 0; index < qtdAluno; index++) {
      double notaAluno = 0;
      for (int index1 = 0; index1 < qtdBimestre; index1++) {
        notaAluno = notaAluno + notas[index][index1];

      }
      
      double mediaAluno = (notaAluno / qtdBimestre);
      System.out.println("");
      System.out.println("A média do " + (index + 1) + "° aluno é: " + mediaAluno);
    }
    input.close();
  }
}
