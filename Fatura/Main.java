
package Principal;


import java.util.Locale;
import java.util.Scanner;

import 	Conta.Fatura;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Fatura fatura;
		
		System.out.print("Digite o numero da fatura: ");
		int numero = sc.nextInt();
		
		System.out.print("fale a quantidade do produto: ");
		int quantidade = sc.nextInt();
		
		System.out.print("Digite o preço de cada produto: ");
		double preço = sc.nextDouble();
		
	    fatura = new Fatura(numero, quantidade, preço);
		
	    System.out.println();
	    System.out.println("Fatura finalizada:");
	    System.out.println(fatura); 
	    System.out.printf("No total de: %.2f%n" , fatura.getTotalFatura() ); 
	    
	    
		
		sc.close();
	}
}
