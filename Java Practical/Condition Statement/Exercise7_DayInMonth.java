// Write a java program to find the no. in month.

import java.util.Scanner;
public class Exercise7_DayInMonth {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number_of_DaysInMonth = 0;
		
		String MonthOfName = "unknown";
		
		System.out.println("Enter a month num :");
		int month = sc.nextInt();
		
		System.out.println("Enter a year :");
		int year = sc.nextInt();
		
		switch(month) {
		case 1:
			MonthOfName = "January";
			number_of_DaysInMonth = 31;
			break;
		case 2:
			MonthOfName = "February";
            if((year % 400==0) || ((year % 4==0) &&(year % 100!=0))) {
    			number_of_DaysInMonth = 29;
    		 }
            else {
    			number_of_DaysInMonth = 28;

            }
            break;
		case 3 :
			MonthOfName = "March";
			number_of_DaysInMonth = 31;
            break;

		case 4 :
			MonthOfName = "April";
			number_of_DaysInMonth = 30;
            break;
         
		case 5 :
			MonthOfName = "May";
			number_of_DaysInMonth = 31;
            break;
            
            
		case 6 :
			MonthOfName = "June";
			number_of_DaysInMonth = 30;
            break;
            
		case 7 :
			MonthOfName = "July";
			number_of_DaysInMonth = 31;
            break;

		case 8 :
			MonthOfName = "August";
			number_of_DaysInMonth = 31;
            break;

		case 9 :
			MonthOfName = "september";
			number_of_DaysInMonth = 30;
            break;

		case 10 :
			MonthOfName = "October";
			number_of_DaysInMonth = 31;
			break;
		case 11 :
			MonthOfName = "november";
			number_of_DaysInMonth = 30;
			break;
     
		case 12 :
			MonthOfName = "December";
			number_of_DaysInMonth = 31;
			break;
			
		}     
        System.out.print(MonthOfName + " " + year + " has " + number_of_DaysInMonth + " days\n");

	}

}

