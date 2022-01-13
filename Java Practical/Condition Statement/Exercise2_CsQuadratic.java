import java.util.Scanner;
public class Exercise2_CsQuadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
System.out.println("Enter a :");		
double a = sc.nextDouble();

System.out.println("Enter b :");		
double b = sc.nextDouble();

System.out.println("Enter c :");		
double c = sc.nextDouble();

double result = b*b-4.0*a*c;

if(result>0.0) {
	double r1 =(-b+ Math.pow(result, 0.5)/2.0*a);
	double r2 =(-b- Math.pow(result, 0.5)/2.0*a);
	System.out.println("The real root are" + r1 +"and" + r2);		
}

else if(result==0.0) {
	double r1 = -b/(2.0*a);
	System.out.println("The real root are" + r1 );	
	}
else {
	System.out.println("The equation has no real root.");	

}
	}

}
