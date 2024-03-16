using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace palindrome {
    class Program3 {
        static void Main(string[] args) {
            int n, r, sum = 0, temp;
            Console.WriteLine("Enter Any Number:");
            n = Convert.ToInt32(Console.ReadLine());
            temp = n;
            while (n > 0) {
                r = n % 10;
                sum = (sum * 10) + r;
                n = n / 10;
            }
            if (temp == sum) {
                Console.WriteLine("It is Palindrome Number..");
            }
            else {
                Console.WriteLine("It is Not Palindrome Number..");
            }
        Console.ReadLine();
        }
    }
}
