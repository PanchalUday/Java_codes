package other_codes;

import java.util.Scanner;

public class Static_object {
	
	int n;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  

        Static_object  a = new Static_object();
        System.out.print("Enter number to find square : ");
        a.n = sc.nextInt();

        int c = a.n*a.n;
        System.out.println(c);
		
	}

}
