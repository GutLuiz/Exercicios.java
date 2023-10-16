package curso_programacao;
import java.util.Locale;
import java.util.Scanner;



public class Main {
	
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("fale um numero inteiro: ");
		int x = sc.nextInt();
		
			for (int i = 1; i <= 10; i++) {
				int resultado = i * x; 
				System.out.println(i + " x " + x + "=" + resultado);
			
		}
		sc.close();
	}
}
