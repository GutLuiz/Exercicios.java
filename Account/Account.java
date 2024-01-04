package entities;

public class Account {
		private Integer number;
		private String name;
		private Double balance;
		
		public Account(Integer number, String name) {
			this.number = number;
			this.name = name;
		}

		public Account(Integer number, String name, double balance) {
			this.number = number;
			this.name = name;
			this.balance = balance;
		}

		public Integer getNumber() {
			return number;
		}


		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Double getBalance() {
			return balance;
		}

		public void Deposit(double amount) {
			balance += amount;
		}
		public void withdraw(double amount) {
			balance -= amount + 5;
		}
		
		public String toString() {
		return "Account "
				+ number
				+ ", holder: "
				+ name 
				+ ", balance: $"
				+ String.format("%.2f", balance );
		}
		
}
