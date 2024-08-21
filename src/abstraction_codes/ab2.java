package abstraction_codes;

abstract class Bike{  
    abstract void run();  
  }  
  class Honda4 extends Bike{  
    void run()
    {
        System.out.println("running safely");
    } 
  }
  
public class ab2 {

    public static void main(String args[]){  
        Bike model = new Honda4();  
        model.run();  
       }  
    }      


