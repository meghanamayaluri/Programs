package access;

import java.util.Scanner;

public class armstrong {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter armstrong number");
		
		int s=sc.nextInt();
		int u=0;
		int c=s;
		int l=0;
	
		
		while(s!=0){
	       u=s%10;
	       
		 l+=u*u*u;
		   s/=10;
		}
		if(c==l){
		System.out.println("Number is armstrong");
	}
		else{
			System.out.println("Number is not armstrong");
		}
	
	}
}
