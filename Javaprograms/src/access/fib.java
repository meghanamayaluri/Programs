package access;

import java.util.Scanner;

public class fib {
	public static void main(String args[]){
	int t1=0;
	int t2=1;
	
	Scanner input = new Scanner(System.in);
	System.out.println("Enter n value to print the fibonacci series");
	int n=input.nextInt();
	for(int i=1;i<=n;i++){
		
		System.out.print(t1 + "+" );
		int sum=t1+t2;
		t1=t2;
		t2=sum;
		
	}
}


}
