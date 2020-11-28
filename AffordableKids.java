package com.techelevator;

import java.util.Scanner;

public class AffordableKids {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Find out if you can afford a child!");
		System.out.println("Answer a few questions about income and expenses to get the answers.");
		
		System.out.println("What is your yearly net income? (Avoid comma seperation) >>> example: 45000 ");
		String salary = input.nextLine();
		
		System.out.println("How much do you spend a month on bills and expenses? (Mortgage/rent, electric, water, grocery) >>> ");
		String bills = input.nextLine();
		
		int salaryInt = Integer.parseInt(salary);
		int billsInt = Integer.parseInt(bills);
		
		billsInt *= 12;
		salaryInt -= billsInt;
		
		if(salaryInt >= 8000 && salaryInt < 10000) {
			System.out.println("With the money you have left over after bills and expenses are paid, you can afford to raise a single child.");
			System.out.println("If you shop smart and use any assistance available to you it will be possible.");
		}
		if(salaryInt >= 10000 && salaryInt <= 12000) {
			System.out.println("With the money you have left over after bills and expenses are paid, you can afford to raise a child.");
			System.out.println("The average middle-income family in the U.S. spends 10 to 12 thousand dollars a year on a child.");
		}
		if(salaryInt >= 12000) {
			System.out.println("With the money you have left over after bills and expenses are paid, you can afford to comfortably raise a child.");
			System.out.println("The average middle-income family in the U.S. spends 10 to 12 thousand dollars a year on a child so you will be fine.");
		}
		else {
			System.out.println("Sorry, but with your income raising a child would be very hard. ");
		}
		System.exit(0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
