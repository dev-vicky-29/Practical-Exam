using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CopyConstructor {
    class Program {
 int a, b;
String c;
public Program(int x, int y, String z) {
a = x;
b = y;
c = z;
Console.WriteLine("a: " + a);
Console.WriteLine("b: " + b);
Console.WriteLine("c: " + c);
}
public Program(Program obj) {
a = obj.a;
b = obj.b;
c = obj.c;
Console.WriteLine("a :" + a);
Console.WriteLine("b :" + b);
Console.WriteLine("c :" + c);
}
}
class Program8
{
static void Main(string[] args)
{
Console.WriteLine("Parametrised");
Program s1 = new Program(10, 20, "Sakshi");
Console.WriteLine("Copy");
Program s2 = new Program(s1);
Console.ReadKey();
          }
     }
}
