package access;

import java.util.Scanner;

public class integerpalindrome {
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		 System.out.println("Enter a number");
		int n=in.nextInt();
		
		boolean s=pal(n);
		System.out.println(s);
			
		}

	private static boolean pal(int n1) {
		
		int u=0;
		int s;
		int l;
		l=n1;
		boolean palin=false;
		while(n1>0){
	       s=n1%10;
		   u= u*10+s;
		   n1=n1/10;
		}
		   if(l==u){
				palin = true;
			}
		   else
			   palin= false;
		return palin;
}
}
