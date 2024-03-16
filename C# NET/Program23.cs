using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HierarchicalInheritance {
    class A {
        public void get() {
            Console.WriteLine("Hii..");
        }
    }
    class B : A {
        public void put() {
            Console.WriteLine("Hello");
        }
    }
    class C : A {
        public void set() {
            Console.WriteLine("Welcome");
        }
    }
    class Program23 {
        static void Main(string[] args) {
            B obj1 = new B();
            C obj2 = new C();
            obj1.get();
            obj1.put();
            obj2.get();
            obj2.set();
            Console.ReadKey();
        }
    }
}
