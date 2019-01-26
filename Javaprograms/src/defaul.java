import access.accesexample;


public class defaul extends accesexample{
public static void main(String args[]){
	accesexample a=new accesexample();
//	complie time error occurs because default cant access methods in other packages 
	a.def();
	
}
}
