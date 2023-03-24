package banco_poo;

public class TerminalBancario {
    public static void main(String[] args) {

        Conta conta = new Conta("Beltrana", 123);
        System.out.println("Nome: " + conta.getNome());
        conta.sacar(23);
        System.out.println(conta.getSaldo());
        System.out.println();
    
        System.out.println("Quantidade de contas abertas: " + Conta.quantidadeContasAbertas);
      }
}
