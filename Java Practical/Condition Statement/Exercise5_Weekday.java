//Displays the weekday between 1 & 7.

import java.util.Scanner;
public class Exercise5_Weekday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int day = sc.nextInt();
		System.out.println(getDayName(day));

	}
public static String getDayName(int day) {
	String dayName = "";
	
	switch (day) {
	case 1: dayName = "Monday"; break;
	case 2: dayName = "Tuesday"; break;
	case 3: dayName = "Wednesday"; break;
	case 4: dayName = "Thursday"; break;
	case 5: dayName = "friday"; break;
	case 6: dayName = "saturday"; break;
	case 7: dayName = "sunday"; break;
    default : dayName = "Invalid day range";
	}
	return dayName;
	
}
}
