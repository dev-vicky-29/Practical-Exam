using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace ParamConstuctor {
    class Progra {
int a, b;
String c;
public Program(int x, int y, String z) {
a=x;
b=y;
c=z;
Console.WriteLine("a:"+a);
Console.WriteLine("b:"+b);
Console.WriteLine("c:"+c);
}
}
class Program10
{
static void Main(string[] args)
{
Program s=new Program(10,20,"Sakshi");
Console.ReadKey();
}
} 
}
