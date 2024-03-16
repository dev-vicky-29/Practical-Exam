using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace MultipleInheritance {
    public interface Ibase1 {
        void display();
    }
    public interface Ibase2 {
        void display();
    }
    public class C : Ibase1, Ibase2 {
        public void display() {
            Console.WriteLine("Hello");
        }
    }
    class Program22  {
        static void Main(string[] args) {
            C obj = new C();
            obj.display();
            Console.ReadKey();
        }
    }
}

