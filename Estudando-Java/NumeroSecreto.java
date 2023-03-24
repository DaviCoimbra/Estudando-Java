import java.util.Scanner;
import java.util.*;

public class NumeroSecreto{
  
  public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numeroSecreto = (int)(Math.random()*101);
        int qtdChutes = 0;
        List<Integer> listaTentativas = new ArrayList<Integer>();
        
        System.out.println("Vamos começar um jogo do número secreto!!!");
        System.out.println("Dica: É um número de 1 a 100.");
        int chute=-1;
        
        while(numeroSecreto!=chute){
            System.out.print("\nDigite um número : ");
            chute = input.nextInt();
            qtdChutes+=1;
            listaTentativas.add(chute);

            if(chute==numeroSecreto){
                break;
            }
            else if(chute>numeroSecreto){
                System.out.println("O seu chute é maior que o número secreto, continue tentando!!!");
            }
            else{
                System.out.println("O seu chute é menor que o número secreto, continue tentando!!!");
            }
            
        }
        
        System.out.println("Você acertou!!! Vocês conseguiu com " + qtdChutes + " chutes");
        System.out.println("Sua lista de tentativas: " +listaTentativas);
        input.close();
    }
}