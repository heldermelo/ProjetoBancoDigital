package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;
import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		Banco meusBancos = new Banco();
		meusBancos.setNome("Bradesco");
		
		Cliente helder = new Cliente("Helder", meusBancos);
		
		Conta contaCorrente = new ContaCorrente(helder);
		Conta contaPoupanca = new ContaPoupanca(helder);
		contaCorrente.depositar(100);
		contaCorrente.transferir(100, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();
		meusBancos.listarClientes();
		
		System.out.println();
		
		Cliente jose = new Cliente("José");
		meusBancos.setNome("Itau");
		
		Conta contaCorrente2 = new ContaCorrente(jose);
		Conta contaPoupanca2 = new ContaPoupanca(jose);
		contaPoupanca2.depositar(300);
		contaPoupanca2.transferir(120, contaCorrente2);
		contaCorrente2.imprimirExtrato();
		contaPoupanca2.imprimirExtrato();
		meusBancos.listarClientes();
		

		
		sc.close();
	}
}
