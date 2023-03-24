package banco_poo;

public class Conta {
    double saldo;
	String nome;
	int cpf;
	static int quantidadeContasAbertas;
	
	
	Conta() {
		System.out.println("Olá, seja bem-vindo!");
		adicionarQuantidadeContasAbertas();
	}
	
	Conta(String nomeCorrentista, double saldoInicial) {
		this.nome = nomeCorrentista;
    this.saldo = saldoInicial;
		adicionarQuantidadeContasAbertas();
	}
	
	
	void adicionarQuantidadeContasAbertas() {		
		Conta.quantidadeContasAbertas += 1;
	}
	
	
	public void depositar(double valorDeposito) {
		if(valorDeposito > 0) {
			this.saldo += valorDeposito;
			System.out.println("Depósito realizado!");
		} else {
			System.out.println("Valor de depósito tem que ser mair do que 0");
		}
	}
	
	public void sacar(double valorSaque) {
		if(valorSaque <= saldo) {
			this.saldo -= valorSaque;
			System.out.println("Saque realizado!");
		} else {
			System.out.println("Saldo indisponível!");
		}
	}

	public double getSaldo() {
		return this.saldo;
	}
	

	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
