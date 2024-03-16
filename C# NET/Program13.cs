using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Value_Type
{
    class Program13
    {
        static void ChangeValue(int x)
        {
            x = 20;
            Console.WriteLine(x);
        }
        public static void Main(String[]args)
        {
            int i = 100;
            Console.WriteLine(i);
            ChangeValue(i);
            Console.WriteLine(i);
            Console.ReadKey();
       
        }
    }
}
