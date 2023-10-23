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
package util;

public class Aprovados {
		private String nome;
		private double nota1;
		private double nota2;
		
		public Aprovados(String nome, double nota1, double nota2) {
			this.nome = nome;
			this.nota1 = nota1;
			this.nota2 = nota2;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public double getNota1() {
			return nota1;
		}

		public void setNota1(double nota1) {
			this.nota1 = nota1;
		}

		public double getNota2() {
			return nota2;
		}

		public void setNota2(double nota2) {
			this.nota2 = nota2;
		}
		
		
}
