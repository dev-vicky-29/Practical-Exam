using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace GetSetProperties{
    class Student  {
        private String name = "Hiii...........";
        public String Name {
            get {
                return name;
            }
            set {
                name = value;
            }
        }
    }
    class Program16 {
        static void Main(string[] args)  {
            Student s = new Student();
            s.Name = "Sakshi";
            Console.WriteLine("Name of Student is:" + s.Name);
            Console.ReadKey();
        }
    }
}
