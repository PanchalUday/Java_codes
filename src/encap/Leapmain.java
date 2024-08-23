package encap;

import java.util.Scanner;

public class Leapmain {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Year : ");
        int year = input.nextInt();

        Leapyear lr = new Leapyear();
        lr.ly(year);

        lr.logic();


	}

}
