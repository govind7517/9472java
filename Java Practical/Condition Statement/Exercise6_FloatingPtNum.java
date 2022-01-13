//Write a java program that reads in two floating point number & tests whether they are the same up to 3 decimal places.

import java.util.Scanner;
public class Exercise6_FloatingPtNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter floating point num :");
		double p = sc.nextDouble(); 
	
		System.out.println("Enter floating point num :");
		double q = sc.nextDouble(); 
		
		p = Math.round(p * 1000);
		p = p/1000;
		
		q = Math.round(q * 1000);
		q = q/1000;
		
		if(p==q) {
			System.out.println("They are the same up to three decimal places");

		}
		else {
			System.out.println("They are different");

		}

	}

}
