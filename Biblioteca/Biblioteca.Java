package entities;

public class Biblioteca {
	private Livros[] biblio;
	
	public Biblioteca(int tamanho) {
		biblio = new Livros[tamanho];
	}
	public void adicionarLivro(Livros livros) {
		for(int i = 0; i < biblio.length; i++) {
			if(biblio[i] == null) {
				biblio[i] = livros;
				System.out.println("LIVRO ADICIONADO!");
				return;
			}
		}
		System.out.println("Biblioteca esta cheia!");
	}
	public void buscarLivros(String autor) {
		 boolean encontrouLivro = false;
	        for (Livros livro : biblio) {
	            if (livro != null && livro.getAutor().equalsIgnoreCase(autor)) {
	                System.out.println("Livro encontrado:");
	                System.out.println("Título: " + livro.getTitulo());
	                System.out.println("Autor: " + livro.getAutor());
	                System.out.println("Ano de Publicação: " + livro.getAnoPulbicado());
	                encontrouLivro = true;
	            }
	        }
	        if (!encontrouLivro) {
	            System.out.println("Nenhum livro encontrado para o autor: " + autor);
	        }
	    }
	public void listarLivros() {
		 System.out.println("Lista de Livros na Biblioteca:");
	        for (Livros livro : biblio) {
	            if (livro != null) {
	                System.out.println("Título: " + livro.getTitulo());
	                System.out.println("Autor: " + livro.getAutor());
	                System.out.println("Ano de Publicação: " + livro.getAnoPulbicado());
	                System.out.println("----------------------");
	            }
	        }
	    }
	}
	

