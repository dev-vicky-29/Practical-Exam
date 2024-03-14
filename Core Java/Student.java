class Student{
 int rollno;
 String name;
 void insertRecord(int r,String n) {
  rollno=r;
  name=n;
 }
 void displayInfo()
 {
 System.out.println(rollno+"  "+name);
 }
}
 class Student4
{
 public static void main(String args[])
 {
 Student s1=new Student();
 Student s2=new Student();
 s1.insertRecord(101,"Nana");
 s2.insertRecord(102,"Gana");
 s1.displayInfo();
 s2.displayInfo();
 }
}
