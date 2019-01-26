package access;

import java.util.LinkedList;

public class stack {
	public static void main(String args[]){
	LinkedList<Integer> in=new LinkedList<Integer>();
	in.push(5);
	in.push(2);
	in.push(10);
	System.out.println("Linked list after adding elements" +in);
	in.pop();
	System.out.println("Linked list after removing element" + in);
	in.peek();
	System.out.println("Linked list highest element" + in);

}
}
