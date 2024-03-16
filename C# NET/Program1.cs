using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Factorial
{
    class Program1
    {
        static void Main(string [] args)
        {
            int number, fact = 1;
            Console.WriteLine("Enter Any one Number:");
            number = int.Parse(Console.ReadLine());
            for (int i = 1; i <= number; i++)
            {
                fact = fact * i;
            }
            Console.WriteLine("Factorial is:" + fact);
            Console.ReadLine();
        }
    }
}
