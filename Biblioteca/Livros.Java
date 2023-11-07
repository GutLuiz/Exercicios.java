package entities;

public class Livros {
		private String titulo;
		private String autor;
		private int anoPulbicado;
		
		public Livros() {
			
		}

		public Livros(String titulo, String autor, int anoPulbicado) {
			this.titulo = titulo;
			this.autor = autor;
			this.anoPulbicado = anoPulbicado;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getAutor() {
			return autor;
		}

		public void setAutor(String autor) {
			this.autor = autor;
		}

		public int getAnoPulbicado() {
			return anoPulbicado;
		}

		public void setAnoPulbicado(int anoPulbicado) {
			this.anoPulbicado = anoPulbicado;
		}
		
		
}
