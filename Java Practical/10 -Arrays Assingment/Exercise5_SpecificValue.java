import java.util.Arrays;
public class Exercise5_SpecificValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
    //  int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
     // int find =67;
      
      //boolean check =false;
      
     // for(int element:arr) {
    	//  if(element ==find) {
    		//  check=true;
    		  //break;
    //	  }
      //}
    //  if(check) {
    	//  System.out.println(true);
   //   }
     // else {
    	//  System.out.println(false);
  
  //    }
	//}
//}
	     int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
	      int find =8;

boolean found=Arrays.stream(arr).anyMatch(element->element==find);
if(found) {
	 System.out.println(true);

}
else {
	 System.out.println(false);

}
	}
	
}