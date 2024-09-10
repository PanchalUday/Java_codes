package abstraction_codes;


abstract class Car{  
    abstract void model();  
}  

class innova extends Car{  
    void model(){
    	System.out.println("Innova : V varient is available");
    }
}  
class fortuner extends Car{  
    void model(){
    	System.out.println("Fortuner : Legender is available");
    	}  
    }

public class ab4 {

	public static void main(String[] args) {
		Car f=new fortuner();
		Car i = new innova();
        f.model();
		i.model(); 
	}
}



