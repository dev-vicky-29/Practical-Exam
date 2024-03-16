using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace AbstractClass {
   public abstract class Shape {
public abstract void draw();
}
public class Reactangle:Shape {
public override void draw() {
Console.WriteLine("Drawing Reactangle");
}
}
public class Circle:Shape {
public override void draw() {
Console.WriteLine("Drawing Circle..");
}
}
public class Program18 {
public static void Main(string[] args) {
Shape s;
s=new Reactangle();
s.draw();
s = new Circle();
s.draw();
Console.ReadKey();
}
}
}
