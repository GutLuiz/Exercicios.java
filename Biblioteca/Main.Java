package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Biblioteca;
import entities.Livros;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
		
		Scanner sc = new Scanner(System.in);
		
		        Biblioteca biblioteca = new Biblioteca(10);
		        
		      
		        Livros livro1 = new Livros("Harry Potter", "J.K. Rowling", 1997);
		        Livros livro2 = new Livros("O Senhor dos Anéis", "J.R.R. Tolkien", 1954);
		        Livros livro3 = new Livros("1984", "George Orwell", 1949);

		        
		        biblioteca.adicionarLivro(livro1);
		        biblioteca.adicionarLivro(livro2);
		        biblioteca.adicionarLivro(livro3);
		        
		        
		        biblioteca.listarLivros();
		        
		        
		        System.out.println("Livros por J.K. Rowling:");
		      
		        biblioteca.buscarLivros("J.K. Rowling");
		        sc.close();
	}

	}
