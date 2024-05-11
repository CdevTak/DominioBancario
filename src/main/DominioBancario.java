package main;

import entity.ContaCorrente;
import entity.ContaPoupanca;

public class DominioBancario {

	public static void main(String[] args) {

		ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2000);

		contaCorrente.depositar(500);
		System.out.println("Saldo da conta corrente após depósito: " + contaCorrente.getSaldo());

		contaCorrente.sacar(200);
		System.out.println("Saldo da conta corrente após saque: " + contaCorrente.getSaldo());

		contaCorrente.transferir(contaPoupanca, 300);
		System.out.println("Saldo da conta corrente após transferência: " + contaCorrente.getSaldo());
		System.out.println("Saldo da conta poupança após receber transferência: " + contaPoupanca.getSaldo());
	}
}
