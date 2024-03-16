//Program1
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverloading {
    class Sample  {
        void add(int a, int b)  {
            Console.WriteLine("The Sum of Number is:" + (a + b));
        }
        void add(double a, double b) {
            Console.WriteLine("The Sum of Number is:" + (a + b));
        }
        class Program19 {
            public static void Main(string[] args) {
                Sample s = new Sample();
                s.add(5, 3);
                s.add(45.670, 86.445);
                Console.ReadKey();
            }
        }
    }
}
