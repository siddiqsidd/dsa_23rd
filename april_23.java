package assignment_dsa;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

/*
 * 	"1. Create a linked list and add ten values to it by taking it from the user. 
Delete all nodes which are greater than 40

2. Print the node which is at index 5

Input - 10->20->20->40->50->60->70->null
Output - 50

"
 */
public class april_23 {

	public static void main(String[] args) {
	//2.
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println(list.get(5));
		
		///1.
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> LIST = new ArrayList<Integer>();
		while (sc.hasNextInt()) 
		{
		    int i = sc.nextInt();
		    LIST.add(i);
		}
		System.out.println(LIST);
	}

}
