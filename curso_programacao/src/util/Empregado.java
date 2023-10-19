package util;

public class Empregado {
		private String nome;
		private String sobreNome;
		private double salario;
		
		
		public Empregado(String nome, String sobreNome, double salario) {
			this.nome = nome;
			this.sobreNome = sobreNome;
			this.salario = salario;
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public String getSobreNome() {
			return sobreNome;
		}


		public void setSobreNome(String sobreNome) {
			this.sobreNome = sobreNome;
		}


		public double getSalario() {
			return salario;
		}


		public void setSalario(double salario) {
			this.salario = salario;
		}
		public double empregadoTeste() {
			return salario * 12;
		}
		public double salarioMensal() {
			return (empregadoTeste() * 10) /100 + salario;
		}
		public String toString() {
			return "Sistema concluido!, Empregado: "
					+ nome
					+ " "
					+sobreNome
					+" com o salario anual de: $"
					+ String.format("%.2f", empregadoTeste());
		}
		
		
		
}
