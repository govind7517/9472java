import java.util.*;
public class JoinArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("List of first array: " + c1);
        ArrayList<String> c2= new ArrayList<String>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");
        System.out.println("List of second array: " + c2);
       
    
      ArrayList<String> a = new ArrayList<String>();
      a.addAll(c1);
      a.addAll(c2);
      System.out.println("New array: " + a);
      


	}

}
