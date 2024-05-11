package entity;

public abstract class Conta {
	
	private double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public Conta(double saldoInicial) {
		this.saldo = saldoInicial;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println(" Saldo insuficente!");
		}
	}
	
	public void transferir(Conta destino, double valor) {
		if(this.saldo >= valor) {
			this.sacar(valor);
		} else {
			System.out.println(" Saldo insuficente para transferência!");
		}
	}

}
