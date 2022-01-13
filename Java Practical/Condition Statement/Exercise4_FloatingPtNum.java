//Print a floating point num in specific format.
import java.util.Scanner;
public class Exercise4_FloatingPtNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enterr the value : ");
		double input = sc.nextDouble();
		
		if(input >0) {
			if(input <1) {
				System.out.println("Positive small num :");
			}
			else if(input>1000000) {
				System.out.println("Positive large num :");
			}
			else {
				System.out.println("Positive num :");
			}
		}
		
		else if (input<0) {
			if(Math.abs(input)<1) {
				System.out.println("negaitive small num :");
}
			if(Math.abs(input)>1000000) {
				System.out.println("negaitive large num :");
	
			}
         
		}
		else {
			System.out.println("Zero");

		}                                 
	}

}
