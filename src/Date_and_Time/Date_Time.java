package Date_and_Time;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Date_Time {

	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();  
	    System.out.println("Before Formatting: " + myDateObj);  
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss");  
	    
	    String formattedDate = myDateObj.format(myFormatObj);  
	    System.out.println("After Formatting: " + formattedDate);  

	}

}
