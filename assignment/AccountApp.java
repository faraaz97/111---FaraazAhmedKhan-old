package com.marticus.exercise1.assignment;

import java.util.Scanner;

public class AccountApp{
public static void main(String[] args) {
		System.out.println("Welcome to the bank ATM !!");
		System.out.println("");
	
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Select Account:");
		System.out.println("Choose 1 to Savings Account");
		System.out.println("Choose 2 to Current Account");
		System.out.println("Choose 0 to EXIT");
		while(true) {
			int choice = scanner.nextInt();
			switch(choice) {
			case 1:
				Account ac = new Account();
				ac.accountNumber();
				break;
			case 2:
				Account ac1 = new Account();
				ac1.accountNumber();
				break;
			}
				System.out.println("Thank You for using ATM!");
				
			}
		}
	}