//Program1
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Implement_class {
    class Student
    {
        public int rollno;
        public String name;
    }
    class Program14 {
        static void Main(string[] args)
        {
            Student s = new Student();
            s.rollno = 7;
            s.name = "Sakshi";
            Console.WriteLine(s.rollno);
            Console.WriteLine(s.name);
            Console.ReadKey();
   
        }
    }
}
