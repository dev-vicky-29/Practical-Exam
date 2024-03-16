//Program2
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace MethodOverridEx2 {
    public class Shape {
        public virtual void draw()  {
            Console.WriteLine("Draawing..");
        }
    }
    class Rectangle : Shape {
        public override void draw() {
            Console.WriteLine("Drawing Reactangle");
        }
    }
    class Circle : Shape {
        public override void draw() {
            Console.WriteLine("Drawing Circle");
        }
    }
    class Program201 {
        static void Main(string[] args) {
            Shape s = new Shape();
            s.draw();
            s = new Rectangle();
            s.draw();
            s = new Circle();
            s.draw();
            Console.ReadKey();
        }
    }
}
