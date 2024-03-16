using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DestuctorCon {
    class Program {
 int a;
float b;
String c;
public Program() {
a = 10;
b = 2.45F;
c = "Hiiii";
Console.WriteLine("a: " + a);
Console.WriteLine("b: " + b);
Console.WriteLine("c: " + c);
} 
~Program() {
Console.WriteLine("Destructor is Called");
}
}
class Program11 {
public static void Main(string[] args)
{
Program s = new Program();
Console.ReadKey();
}
} 
}
