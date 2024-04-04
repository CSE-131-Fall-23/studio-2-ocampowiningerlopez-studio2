package studio2;

import java.util.Scanner;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		System.out.println("How many darts? ");
		int numDarts = in.nextInt();
		int numCircle = 0;
		for(int i = 0; i < numDarts; i++) {
			double x = Math.random();
			double y = Math.random();
			
			double distance = Math.sqrt(Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2));
			if(distance < 0.5) {
				numCircle++;
			}
		}
		double piOver4 = (double) numCircle / numDarts;
		System.out.println(piOver4 * 4);
		
		
	}

}
