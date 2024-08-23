package encap;

import java.util.Scanner;

public class Marksheet_main {
	public static void main(String args[]) {
	
	int  eng, phy, chem, math, comp ;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter marks of five subjects:");
    System.out.print("Enter marks of English subject:");
    eng=input.nextInt();

    System.out.print("Enter marks of physics subject:");
    phy=input.nextInt();
   
    System.out.print("Enter marks of chemistry subject:");
    chem=input.nextInt();

    System.out.print("Enter marks of maths subject:");
    math=input.nextInt();

    System.out.print("Enter marks of computer subject:");
    comp=input.nextInt();

    Marksheet mr = new Marksheet();
    mr.getmarks(eng, phy, chem, math, comp);
    
    mr.displayresult();
	
	}

}
