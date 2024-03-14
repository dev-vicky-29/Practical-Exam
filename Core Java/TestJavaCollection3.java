import java.util.*;  
public class TestJavaCollection3{  
public static void main(String args[]){  
Vector<String> v=new Vector<String>();  
v.add("Ravi");  
v.add("Amit");  
v.add("Ajit");  
v.add("Sujit");  
Iterator<String> itr=v.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
}  
