using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticCons {
    class Program {
 int a;
float b;
String c;
static int d;
public Program() {
a = 10;
b = 4.33F;
c = "HI.............";
Console.WriteLine("a: " + a);
Console.WriteLine("b: " + b);
Console.WriteLine("c: " + c);
}
static Program() {
d = 100;
Console.WriteLine("d: " + d);
}
}
class Program9 {
static void Main(string[] args){
Program s = new Program();
Console.ReadKey();
       }
   }
}
