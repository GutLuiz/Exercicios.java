package curso_programacao;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;



public class Main {

    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);	
    Account account;
   
    System.out.print("Enter account number: ");
    int number = sc.nextInt();
    
    System.out.print("Enter account holder: ");
    sc.nextLine();
    String holder = sc.nextLine();
    
    System.out.print("is there an initial deposit (y/n)?");
    char response = sc.next().charAt(0);
    
    if(response == 'y') {
    	System.out.print("Enter initial deposit value: ");
    	double initialDeposit = sc.nextDouble();
    	account =  new Account (number, holder, initialDeposit);
    }
    else {
    	account = new Account (number, holder);
    }
    
    System.out.println();
    System.out.println("account data:");
    System.out.println(account);
    
    
    sc.close();
       
    }
}