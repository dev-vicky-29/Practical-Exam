import java.io.*;
class Student {
String name;
int id;
Student(String name, int id) {
this.name=name;
this.id=id;
}
Student(Student obj2) {
this.name=obj2.name;
this.id=obj2.id;
}
}
class TestJava63 {
public static void main(String[] args) {
System.out.println("first Object");
Student s1=new Student("Nana",101);
System.out.println("Name: "+s1.name+" and ID:"+s1.id);
Student s2=new Student(s1);
System.out.println("copy constructor used second object");
System.out.println("Name: "+s2.name+" and ID:"+s2.id);
}
}
