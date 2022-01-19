import java.util.*;

public class VectorCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector<String> v = new Vector<String>();
		
		v.add("Ritesh");
		v.add("Badal");
		v.add("Janu");
		v.add("monika");
		
	Iterator<String> itr=v.iterator();
	
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}

	
		

	}

}
