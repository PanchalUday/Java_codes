package abstraction_codes;

//Top-level abstract class Animal
abstract class Animal {
 // Abstract method (does not have a body)
 public abstract void animalSound();
 
 // Regular method
 public void sleep() {
     System.out.println("Zzz");
 }
}

//Top-level subclass Pig that inherits from Animal
class Pig extends Animal {
 public void animalSound() {
     // The body of animalSound() is provided here
     System.out.println("The pig says: wee wee");
 }
}

//Main class
public class ab1 {
 public static void main(String[] args) {
     Pig myPig = new Pig(); // Create a Pig object
     myPig.animalSound();
     myPig.sleep();
 }
}



