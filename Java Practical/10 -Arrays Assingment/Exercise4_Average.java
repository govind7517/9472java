
public class Exercise4_Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] number=new int[] {20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		for(int i=0; i<number.length; i++)
			sum = sum +number[i];
		   double average=sum/number.length;
		System.out.println( "Average value of array element is :"+ average);
	

	}

}
