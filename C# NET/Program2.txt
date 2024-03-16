using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace Amstong {
    class Program2 {
        static void Main(string[] args) {
            int n, r, sum = 0, temp;
            Console.WriteLine("Enter Any Number:");
            n = Convert.ToInt32(Console.ReadLine());
            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = sum + (r * r * r);
                n = n / 10;
            }
            if (temp == sum) {
                Console.WriteLine("It is Armstrong Number");
            }
            else {
                Console.WriteLine("It is Not Armstrong Number");
            }
            Console.ReadLine();
        }
    }
}
