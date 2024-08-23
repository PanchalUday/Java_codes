package encap;

public class Leapyear {

	int year;

    void ly(int a){
        year = a;

    }

    void logic(){
        if(year % 4 == 0){
            System.out.print("The year is leap year");
        }
        
        else{
             System.out.print("The year is not leap year");
        }
    }

}
