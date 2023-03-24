import java.util.Scanner;

public class Carro {
    String nome;
    int ano_fab;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAno_fab(int ano_fab) {
        this.ano_fab = ano_fab;
    }

    public int getAno_fab() {
        return ano_fab;
    }

    public static void main(String[] args) {
        Carro[] carros;
        carros = new Carro[2];
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < carros.length; i++) {

            Carro carro = new Carro();
            System.out.println("\nQual o nome do " + (i + 1) + "o. carro?");
            carro.setNome(in.nextLine());

            System.out.println("\nQual o ano de fabricação do " + (i + 1) + "o. carro?");
            carro.setAno_fab(in.nextInt());
            in.nextLine();
            carros[i] = carro;
        }
        System.out.println("\n\n*** Carros inseridos ***\n");

        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].getNome());
        }
        in.close();
    }
}
