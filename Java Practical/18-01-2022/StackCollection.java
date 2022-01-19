import java.util.*;
public class StackCollection {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		
		Stack<String> stack = new Stack<String>();
		stack.push("Jonathan");
		stack.push("Carter");
		stack.push("Adolf");
		stack.push("Hitler");
		stack.push("jonathan");

		
		stack.pop();
		
		Iterator<String> itr=stack.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

}
}