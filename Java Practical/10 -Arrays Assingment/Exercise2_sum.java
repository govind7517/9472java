//Write a java program to sum values of an array.

public class Exercise2_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int sum =0;
        for(int i=0; i<my_array.length; i++)
        	sum =sum +my_array[i];
        System.out.println("The sum is "+sum);
	}

}
