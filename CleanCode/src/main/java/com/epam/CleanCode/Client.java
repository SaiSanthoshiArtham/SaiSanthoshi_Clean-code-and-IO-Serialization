package com.epam.CleanCode;

import java.util.Scanner;


public class Client{
	private static Scanner sc;

	public static void main(String args[]){	
		
		sc = new Scanner(System.in);
		
		System.out.println("Enter 1 for simple and compound interest 2 for house construction cost");
		int choice = sc.nextInt(); 		
		
		if(choice == 1){
			double principle, rate, time;
			System.out.println("Enter amount");
			principle=sc.nextDouble();
			System. out. println("Enter the No.of years:");
			time=sc.nextDouble();
			System. out. println("Enter the Rate of  interest");
			rate=sc.nextDouble();
			SimpleCompoundInterest simplecompoundinterest = new SimpleCompoundInterest();
			
			double simple_interest = simplecompoundinterest.calculatingSimpleInterest(principle,rate,time);
			double compound_interest = simplecompoundinterest.calculatingCompoundInterest(principle,rate,time);
			
			System.out.println(simple_interest);
			System.out.println(compound_interest);
		}
		
		else{
			HouseConstruction housecon = new HouseConstruction();
			System.out.println("Enter 1)standard materials 2)above standard materials 3)high standard material 4)high standard material and fully automated home");
			int material = sc.nextInt();
			System.out.println("enter total area");
			
			double total_area = sc.nextDouble();
			double cost = housecon.constructionCost(material,total_area);
			
			System.out.println(cost+"INR");
			
		}
	}
}
