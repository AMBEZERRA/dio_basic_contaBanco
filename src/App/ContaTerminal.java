package App;

import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o n�mero da Conta: ");
		int numeroConta = sc.nextInt();
		
		System.out.println("Informe a Agencia Banc�ria: ");
		String agenciaBancaria = sc.next();
		
		System.out.println("Informe o Nome do Cliente: ");
		String nomeCliente = sc.next();
		
		System.out.println("Informe o Nome do Cliente: ");
		String sobreNome = sc.next();
		
		System.out.println("Saldo em conta: ");
		double saldoConta = sc.nextDouble();
		
		
		System.out.println("Ol� " + nomeCliente +" "+sobreNome + ", Obrigado por criar uma conta em nosso banco, sua ag�ncia � "
		+ agenciaBancaria + "," + " conta " + numeroConta 
		+ " e seu saldo " + saldoConta + " " + "j� est� dispon�vel para saque.");
				
	}

}
