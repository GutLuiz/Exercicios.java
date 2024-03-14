package curso_programacao;

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
	
		Scanner sc = new Scanner (System.in);
		 
		int inteiro = sc.nextInt();
		double dou = sc.nextDouble();
		sc.nextLine();
		String str = sc.nextLine();
		
		System.out.println("String: " + str);
		System.out.println("Double: " + dou);
		System.out.println("Int: " + inteiro );
		
	}
		
} 
