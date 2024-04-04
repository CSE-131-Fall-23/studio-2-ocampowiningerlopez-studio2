package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount of money that you start with: ");
		//double startAmount = in.nextDouble();
		int startAmount = in.nextInt();
		
		System.out.println("Enter the win probability: ");
		double winChance = in.nextDouble();

		System.out.println("Enter the win limit: ");
		int winLimit = in.nextInt();
		//double winLimit = in.nextDouble();
		
		System.out.println("Enter total days: ");
		int totalSimulations = in.nextInt();
		
		/*while((startAmount <= winLimit) && (startAmount >= 0)) { //code from when I took the class
			
			double randomNumber = (double)Math.random();
			
			if(randomNumber <= winChance)
			{
				startAmount++;
				System.out.println("Win " + startAmount);
			}
			else
			{
				startAmount--;
				System.out.println("Loss " + startAmount);
			}
		}*/
		
		//new code
		
		//for loop represents going to the casino for one day
		int numRuins = 0;
		for(int i = 0; i < totalSimulations; i++) {
			int todaysMoney = startAmount;
			
			while(todaysMoney > 0 && todaysMoney < winLimit) {
				if(Math.random() < winChance) {
					//System.out.println("Win: " + todaysMoney);
					todaysMoney++;
				}
				else {
					//System.out.println("Lose: " + todaysMoney);
					todaysMoney--;
				}
			}
			System.out.println("Day " + i + " money: " + todaysMoney);
			if(todaysMoney == 0) {
				numRuins++;
			}
		}
		System.out.println("Number of ruin days (simulated): " + (double) numRuins / totalSimulations);
		
		double expectedRuin = 0;
		if(winChance == 0.5) {
			expectedRuin = 1 - ((double) startAmount / winLimit);
		}
		else {
			double alpha = (1 - winChance) / winChance;
			expectedRuin = (Math.pow(alpha, startAmount) - Math.pow(alpha, winLimit)) / (1 - Math.pow(alpha, winLimit));
		}
		System.out.println("Number of ruin days (computed): " + expectedRuin);
		//100, 0.4, 250, 50
		
		
		
		
	}
}
