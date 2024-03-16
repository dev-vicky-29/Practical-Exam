using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace StringFunction {
    class Program25 {
        static void Main(string[] args) {
            String s1 = "Steven Clack";
            String s2 = "Clack";
            Console.WriteLine(s1.Clone());
            Console.WriteLine(s1.CompareTo(s2));
            Console.WriteLine(s1.Contains("Ven"));
            Console.WriteLine(s1.EndsWith("n"));
            Console.WriteLine(s1.Equals(s2));
            Console.WriteLine(s1.GetHashCode());
            Console.WriteLine(s1.GetType());
            Console.WriteLine(s1.IndexOf("e"));
            Console.WriteLine(s1.ToLower());
            Console.WriteLine(s1.ToUpper());
            Console.WriteLine(s1.Insert(0, "Hellow"));
            Console.WriteLine(s1.LastIndexOf("e"));
            Console.WriteLine(s1.Length);
            Console.WriteLine(s1.Remove(5));
            Console.WriteLine(s1.Replace('e', 'i'));
           
            Console.WriteLine(s1.StartsWith("s"));
            Console.WriteLine(s1.Substring(2, 5));
            Console.ReadKey();
        }
    }
}
