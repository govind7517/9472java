//Take three num from user & print greatest num .

import java.util.Scanner;
public class Exercise3_GreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the 1st num :");
	int a = sc.nextInt();
	
    System.out.println("Enter the 2nd num :");
	int b = sc.nextInt();
	
	System.out.println("Enter the 3rd num :");
	int c = sc.nextInt();
   
	if(a>b)
		if(a>c)
			System.out.println("The greatest num :"+a);
	
	if(b>a)
		if(b>c)
			System.out.println("The greatest num :"+b);
	
	if(c>a)
		if(c>b)
			System.out.println("The greatest num :"+c);

	}

}
