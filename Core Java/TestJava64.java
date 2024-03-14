class TestJava64
{
int id;
String name;
int age;
TestJava64(int i,String n)
{
id=i;
name=n;
}
TestJava64(int i,String n,int a)
{
id=i;
name=n;
age=a;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
TestJava64 t1=new TestJava64(101,"Nana");
TestJava64 t2=new TestJava64(102,"Gana",21);
t1.display();
t2.display();
}
}
