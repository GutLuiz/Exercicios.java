package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Empregado;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Empregado empregado;
		
		System.out.println("bem vindo!");
		
		System.out.print("Digite o nome do empregado: ");
		String nome = sc.nextLine();
		
		System.out.print("digite seu sobrenome: ");
		String sobrenome = sc.nextLine();
		
		System.out.print("Digite o salario do Empregado: ");
		double salario = sc.nextDouble();
		
		empregado = new Empregado(nome, sobrenome,salario);
		
		System.out.println(empregado);
		
		System.out.printf("E com beneficios anuais, seu salario mensal atual é : %.2f%n " , empregado.salarioMensal());
		
		
		
	    
		
		sc.close();
	}
}
