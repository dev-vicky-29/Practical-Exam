//Program2
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodoverEx2 {
    class Sample {
        public void area(int r) {
            double Circle;
            Circle = 3.14 * r * r;
            Console.WriteLine("Area of Circle is:" + Circle);
        }
        public void area(float l, float b) {
            float Rectangle;
            Rectangle = l * b;
            Console.WriteLine("Area of reactange is:" + Rectangle);
        }
        public void area(double l, double b) {
            double Triangle;
            Triangle = l * b;
            Console.WriteLine("Area of Triangle is:" + Triangle);
        }
    }
    class Program191 {
        static void Main(string[] args) {
            Sample s = new Sample();

            s.area(3);
            s.area(3.2, 4.5);
            s.area(56.675, 56.455);
            Console.ReadKey();
        }
    }
}
