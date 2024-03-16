//Program1
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace ConstrutorDefault1 {
    class Sample
    {
        int a, b;
        public Sample()
        {
            a = 10;
            b = 20;
            Console.WriteLine("Value of A:" + a);
            Console.WriteLine("Value of B:" + b);
        }
    }
    class Program71
    {
        public static void Main(string[] args)
        {
            Sample s = new Sample();
            Console.ReadKey();
        }
    }
}
