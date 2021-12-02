package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter account data");
		System.out.print("Number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double amount = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		double limit = sc.nextDouble();

		Account account = new Account(number, holder, amount, limit);

		System.out.println("Enter amount for withdraw: ");
		amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("New balance: " + account.getBalance());
		
		sc.close();

	}

}
