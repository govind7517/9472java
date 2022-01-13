//printOwel of consonant, depending on user input.

import java.util.Scanner;
public class Exercise8_Owel_Consonat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AN alphabet");
		String input = sc.next().toLowerCase();
		
		boolean uppercase = input.charAt(0) >=65 && input.charAt(0)<= 99;
		boolean lowercase = input.charAt(0) >=97 && input.charAt(0)<= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i") || input.equals("o") || input.equals("u");
        
        if(input.length() > 1) {
    		System.out.println("Error. Not a single character.");
}
        else if(!(uppercase || lowercase)) {
    		System.out.println("Error. Not a a letter.Enter uppercase or lowercase letters.");     
   }
        else if(vowels) {
        	System.out.println("Input letter is vowels");
        }
        else {
        	System.out.println("input letter is consonant");
        }
	}

}
