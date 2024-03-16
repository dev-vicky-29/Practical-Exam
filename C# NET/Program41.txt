using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CmdLineArg
{
    class Program41
    {
        static void Main(string[] args)
        {
            int sum;
            int x, y;
            x = Convert.ToInt32(args[0]);
            y = Convert.ToInt32(args[1]);
            sum = x + y;
            Console.WriteLine("ADDITION IS :" + sum);
            Console.ReadKey();
        }
    }
}
