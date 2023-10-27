package curso_programacao;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		// exercicio 1 :
		
		//criando a primeira matriz:
		
		
		String[][] mat = new String[4][5];
		
		for(int i = 0 ; i < mat.length; i ++) {
			for(int j = 0 ; j < mat[i].length; j++) {
				mat[i][j] = sc.next();
			}
		}
		
		
		// segunda: 
		int[][] mat2 = new int[3][4];
		
		for(int i = 0 ; i < mat.length; i ++) {
			for(int j = 0 ; j < mat[i].length; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}
		
		// terceira:
		double[][] mat3 = new double[3][3];
		
		for(int i = 0 ; i < mat.length; i ++) {
			for(int j = 0 ; j < mat[i].length; j++) {
				mat3[i][j] = sc.nextDouble();
			}
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}
}

		
