class TestJava62
{
int id;
String name;
TestJava62(int i,String n)
{
id=i;
name=n;
}
void display()
{
System.out.println(id+" "+name);
}
public static void main(String arg[])
{
TestJava62 t1=new TestJava62(101,"Nana");
TestJava62 t2=new TestJava62(102,"Gana");
t1.display();
t2.display();
}
}
