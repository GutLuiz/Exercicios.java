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
		
		
		List<String> palavra= new ArrayList<>();
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.print("Digite uma palavra: ");
			String pala = sc.nextLine();
			
			 palavra.add(pala);
		}
		
		for( String p : palavra) {
			System.out.println(p);
		}
		
		Collections.sort(palavra);
		
		for( String ordenada : palavra) {
			System.out.println(ordenada);
		}
		
		
		sc.close();
	}
}
