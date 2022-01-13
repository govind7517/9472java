import java.util.Scanner;
public class Exercise1_ConditionStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter a number : ");
 
 int input = sc.nextInt();
 
 if(input>0) {
	 System.out.println("The number is positive");
	}
 else if(input<0) {
	 System.out.println("The number is negative");
 
 }
 else {
	 System.out.println("The numberis zero");
 
 }
	}

}
