package access;

import java.util.LinkedList;

public class middle {
public static void main(String args[]){
		LinkedList<Integer> a= new LinkedList<Integer>();
		int i;
		a.add(23);
		a.add(43);
		a.add(12);
		a.add(45);
		a.add(13);
		for(i=0;i<a.size();i++){
		if(a.size()/2==0){
			int b=a.size()/2;
			
			int c= a.get(b);
			System.out.println(c);
		}
		}
		
}
}
