package abstraction_codes;


abstract class Shape{  
    abstract void draw();  
}  

class Rectangle extends Shape{  
    void draw(){
    	System.out.println("drawing rectangle");
    }
}  
class Circle1 extends Shape{  
    void draw(){
    	System.out.println("drawing circle");
    	}  
    }

public class ab3 {

	public static void main(String[] args) {
		Shape s=new Circle1();
		Shape r = new Rectangle();
        r.draw();
		s.draw(); 
	}
}

