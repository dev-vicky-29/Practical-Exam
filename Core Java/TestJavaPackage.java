package myPackage;		
public class TestJavaPackage{	
   public int add(int a, int b){	
	return a+b;
   }	
   public static void main(String args[]){	
	TestJavaPackage obj = new TestJavaPackage();
	System.out.println(obj.add(10, 20));
   }	
}	 
