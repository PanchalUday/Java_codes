package Loops_codes;
import java.util.*;

public class printsquare {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("how many lines you want to print :");
		int n = sc.nextInt();
		System.out.println("How many stars you want to print in single line :");
		int m = sc.nextInt();
		
//		this is the syntax of for loop
//		for(intialization ; condition ; updation) {
//			//code
//		}
		
		
		for(int i = 1; i<=n ; i++) {
			for (int j = 1; j <=m ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
// ----------------------------------------------------------------------------
		
		for(int i = 1; i<=n ; i++) {
			for (int j = 1; j <=m ; j++) 
			{
				if(i == 1 || j == 1 || i == n || j == m){
					System.out.print("*");
				}else {
				System.out.print(" ");
				}
			}
			System.out.println();
		}
		
// ------------------------------------------------------------------------------		
		
		for(int i = 1; i<=n ; i++) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}

// -------------------------------------------------------------------------------
		
		for(int i = n; i>=1 ; i--) {
			for (int j = 1; j <=i ; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}
