package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// exercicio 2:
		
		int[][] mat = new int[5][5];
		
		for(int i = 0; i < mat.length; i ++) {
			for(int j = 0 ; j < mat[i].length; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		//Fazendo as somas:
		//impares:
		
		int impares = 0;
		for(int i = 0; i < mat.length; i ++) {
			for(int j = 0 ; j < mat[i].length; j++) {
				 if(mat[i][j] % 2 != 0) {
					 impares += mat[i][j];
				 }
			}
		}
		System.out.println("A soma dos numeros impares é: " + impares);
		
		
		System.out.println();
		// Soma de cada coluna
		for (int j = 0; j < mat[0].length; j++) {
		    int somaColuna = 0;
		    for (int i = 0; i < mat.length; i++) {
		        somaColuna += mat[i][j];
		    }
		    System.out.println("A soma dos elementos da coluna " + j + " é: " + somaColuna);
		}
		System.out.println();
		// Soma de cada linha
		for (int i = 0; i < mat[0].length; i++) {
		    int somaLinha = 0;
		    for (int j = 0; j < mat.length; j++) {
		        somaLinha += mat[i][j];
		    }
		    System.out.println("A soma dos elementos da linha " + i + " é: " + somaLinha);
		}


		
		
		
		System.out.println();
		
		
		
		
		sc.close();
	}
}

		
