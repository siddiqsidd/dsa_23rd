package assignment_dsa;
import java.util.*;
public class april_22 {
/*
 * 	"1. Create a linked list and add the following elements to it - 2,4,1,3,8,5
Search for the number 3 and display ts index

Output -> Found at 4th position

2. Create a liked list and add the following elements to it - 2,4,1,3,8,5.
Add the element 20 at the end 

Output - 2,4,1,3,8,5,20"
 */
	public static void main(String[] args) {
		///1.
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(1);
		list.add(3);
		list.add(8);
		list.add(5);
		 int pos =list.indexOf(3);
		    
		  System.out.println("\nThe element 3 is at index : " + pos);
		  
		///2.
		  list.add(6,20);
		  System.out.println(list);
	}

}
