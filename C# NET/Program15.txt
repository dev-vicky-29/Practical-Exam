using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interface {
    public interface Drawable{
        void draw();
    }
    public class Rectangle : Drawable {
        public void draw() {
            Console.WriteLine("Drawing Reactangle");
        }
    }
    public class Circle : Drawable {
        public void draw() {
            Console.WriteLine("Drawing Circle");
        }
    }
    class Program15 {
        static void Main(string[] args) {
            Drawable d;
            d = new Rectangle();
            d.draw();
            d = new Circle();
            d.draw();
            Console.ReadKey();
        }
    }
}
