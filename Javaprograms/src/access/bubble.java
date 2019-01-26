package access;

public class bubble {
	public static void main(String args[]){
		int[] arr={2,1,4,3};
		int b;
		int c=arr.length;		
		for(int i=0;i<c-1;i++){
			for(int j=0;j<c-i-1;j++){
				if(arr[j]>arr[j+1]){
					b=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=b;
					
				}
				
			}
			
	}
		for(int i=0;i<c;i++){
			System.out.println(arr[i]);
		}
	}

}
