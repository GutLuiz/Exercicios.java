package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// exercicio 3:
		
		int[][] mat = new int[3][5];
		
		for(int i = 0 ; i < mat.length; i++) {
			for(int j = 0 ; j < mat[i].length; j++ ) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		// Exibindo elementos repetitivos: 
		
		int elemento = 0;
		for (int i = 0; i < mat.length; i++) {
		    for (int j = 0; j < mat[i].length; j++) {
		        int contador = 0; 
		        for (int k = 0; k < mat.length; k++) {
		            for (int l = 0; l < mat[k].length; l++) {
		                if (mat[i][j] == mat[k][l]) {
		                    contador++;
		                }
		            }
		        }
		        if (contador > 1) {
		            elemento++;
		        }
		    }
		}
		System.out.println("Elementos que se repetem na matriz: " + elemento);

		
		
		
		System.out.println();
		
		
		
		
		sc.close();
	}
}

		
