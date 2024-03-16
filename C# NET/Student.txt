using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace RefType
{
    class Student
    {
        string StudentName;
        static void ChangeRefType(Student Std2)
        {
            Std2.StudentName = "Siddhi";
        }
        static void Main(String[] args)
        {
            Student Std1 = new Student();
            Std1.StudentName = "Sakshi";
            ChangeRefType(Std1);
            Console.WriteLine(Std1.StudentName);
            Console.ReadKey();
        }
    }
}
