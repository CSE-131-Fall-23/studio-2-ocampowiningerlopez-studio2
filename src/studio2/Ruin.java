package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the amount of money that you start with: ");
		double startAmount = in.nextDouble();
		
		System.out.println("Enter the win probability: ");
		double winChance = in.nextDouble();

		System.out.println("Enter the win limit: ");
		double winLimit = in.nextDouble();
		
		
		while((startAmount <= winLimit) && (startAmount >= 0)) {
			
			double randomNumber = (double)Math.random();
			
			if(randomNumber <= winChance)
			{
				startAmount++;
				System.out.println("Win" + startAmount);
			}
			else
			{
				startAmount--;
				System.out.println("Loss" + startAmount);
			}
		}
		
	}

}
