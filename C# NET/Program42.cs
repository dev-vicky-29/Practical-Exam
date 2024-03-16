//Program 2
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace FactorialCommandArg {
    class Program42 {
        static void Main(string[] args) {
            int result = 1;
            int fact = int.Parse(args[0]);
            if (fact == 0) {
                Console.WriteLine(result);
            }
            else {
                for (int i = fact; i >= 1; i--)
                    result = i * result;
            }
            Console.WriteLine(result);
            Console.ReadKey();
        }
    }
}
