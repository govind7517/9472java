import java.util.*;
public class ListedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> al=new LinkedList<String>();
		
		al.add("Alex");
		al.add("Haden");
		al.add("Walse");
		al.add("Junior");
		al.add("nitin");
		
		Iterator<String>itr =al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}


	}

}
