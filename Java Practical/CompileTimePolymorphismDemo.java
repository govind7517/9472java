//      PRACTICAL : POLYMORPHISM [Compile Time Polymorphism]

/*Execute the programme for integer values 80, 75, and 60. Show the resulting outputs.
 
 */

package com.govind;

class ClassMain{
	void disp(int num) {
		System.out.println("Method1 :"+num);
	}
	void disp(int num1 , int num2) {
		System.out.println("Method2 :"+num1 +""+ num2);
	
	}
	double disp(double num) {
	System.out.println("Method3 :"+num);
	return num;
	}
}

public class CompileTimePolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassMain a = new ClassMain();
    double result;
    a.disp(80);
    a.disp(75, 60);
    result =a.disp(6.0);
	System.out.println("ans is :"+ result);
 
	}

}
