//Program2
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace ImplementClassUser2 {
    class Student {
        public int rollno;
        String name;
        void getinfo() {
            Console.WriteLine("Enter Roll No of Student");
            rollno = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter Name of Student");
            name = Console.ReadLine();
        }
        public void putinfo() {
            Console.WriteLine("Roll No of  Student is=" + rollno);
            Console.WriteLine("Name No of Student is=" + name);
        }
        class Program141 {
            static void Main(string[] args) {
                Student s = new Student();
                s.getinfo();
                s.putinfo();
                Console.ReadKey();
            }
        }
    }  
}
