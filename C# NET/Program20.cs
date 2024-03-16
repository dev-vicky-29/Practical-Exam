//Program1
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
namespace MethodOverriding{
    class Polygon{
        public virtual void render() {
            Console.WriteLine("Rendering Polygon");
        }
    }
    class Square : Polygon {
        public override void render() {
            Console.WriteLine("Rendering Square");
        }
    }
    class Program20{
        static void Main(string[] args) {
            Polygon p = new Polygon();
            p.render();
            p = new Square();
            p.render();
            Console.ReadKey();
        }
    }
}
