package access;

public class exception {
	
	    public static void shape() 
	    { 
	        try
	        { 
	            throw new NullPointerException("try"); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("catched"); 
	            throw e;  
	        } 
	    } 
	  
	    public static void main(String args[]) 
	    { 
	        try
	        { 
	            shape(); 
	        } 
	        catch(NullPointerException e) 
	        { 
	            System.out.println("Caught"); 
	        } 
	        finally{
	        	System.out.println("It is always executed");
	        	}  
	    } 
	} 

