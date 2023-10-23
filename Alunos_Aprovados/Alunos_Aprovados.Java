package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import util.Aprovados;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		//exercicio 11:
		System.out.print("Quantos alunos serao digitados? ");
		int n = sc.nextInt();
		
		Aprovados[] vect = new Aprovados[n];
		
		for(int i = 0 ; i < n ; i++) {
			sc.nextLine();
			System.out.printf("Digite nome, primeira e segunda nota do  %do aluno:\n", i + 1);
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			
			vect[i] = new Aprovados(nome, nota1, nota2);
		}
		
		
		double media = 6.0;
		String aprovados = null; 
		
		for(int i = 0 ; i < n ; i++) {
			if((vect[i].getNota1() + vect[i].getNota2())/2 >= media) {
					aprovados = vect[i].getNome();
					System.out.println("alunos aprovados : " + aprovados);
			}
			else {
				System.out.println("NENHUM APROVADO!");
			}
		}
		
		
		
		
		
			
		sc.close();
	}
}
