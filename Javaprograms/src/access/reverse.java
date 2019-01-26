package access;

import java.util.Scanner;

public class reverse {
	

	


	 public static void main(String args[]){
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a word to reverse");
		 String r=sc.nextLine();
		 String b = "";
		 int a = r.length();
		 
		 for(int i=a-1;i>=0;i--){
			 b= b + r.charAt(i);
			 
			 
		 }
		System.out.println(b);
		
	}
	 
	

}
