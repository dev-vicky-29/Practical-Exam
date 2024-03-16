using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StaticClassMethod {
    static class Sample {
    public static int rollno;
public static String name;
public static String address;
public static void display() {
Console.WriteLine("Enter Roll No of Student:");
rollno = Convert.ToInt32(Console.ReadLine());
Console.WriteLine("Enter Name No of Student:");
name = Console.ReadLine();
Console.WriteLine("Enter Address of Student");
address = Console.ReadLine();
}
}
class Program17 {
static void Main(string[] args) {
   Sample.display();
      Console.ReadKey();
        }
    }
}
