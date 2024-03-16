using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace InheritanceSingle {
    class A {
        public void Welcome() {
            Console.WriteLine("Welcome to C#");
        }
    }
    class B : A
    {
        public void Hellow()
        {
            Console.WriteLine("Hello Sir..");
        }
    }
    class Program21   {
        static void Main(string[] args) {
            B s = new B();
            s.Welcome();
            s.Hellow();
            Console.ReadKey();
        }
    }
}
