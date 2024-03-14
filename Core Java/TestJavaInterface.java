//Interface Declaration
interface Drawable{
void draw();
}
//Implementation
class Rectangle implements Drawable{
public void draw() {
	System.out.println("Drawing Rectangle");
}
}
class Circle implements Drawable{
public void draw(){
	System.out.println("Drawing Circle");
}
}
//Using Interface 
class TestJavaInterface{
public static void main(String args[]){
Drawable d=new Rectangle();
d.draw();
d=new Circle();
d.draw();
}
}
