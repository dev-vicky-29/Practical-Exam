class Adder
{
 static int add(int a,int b,int c)
 {
  return a+b+c;
 }
 static float add(int a,float b)
 {
 return a+b;
 }
}
class Adder5
{
 public static void main(String args[])
 {
  Adder a=new Adder();
  System.out.println("Addition:"+a.add(11,40,50));
  System.out.println("Addition:"+a.add(20,21));
 }
}
