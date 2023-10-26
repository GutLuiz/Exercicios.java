package curso_programacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
	
		List<Integer> numeros = new ArrayList<>();
		
		for(int i = 0 ; i < 10; i++) {
			System.out.print("Fale o numero " + (i + 1) + ": ");
			int num = sc.nextInt();
			
			numeros.add(num);
			
		}
		
		for(int num1: numeros) {
			System.out.println("Os numeros sao os seguintes: " + num1);
		}
		
		Collections.sort(numeros);
		
		System.out.println("Numeros ordenados: ");
		for(Integer numero : numeros) {
			System.out.println(numero);
		}
	}
}
