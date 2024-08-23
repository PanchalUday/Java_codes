package encap;

import java.util.Scanner;

public class OddEven_main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();    

        OddEven oe = new OddEven();
        oe.ip(num);

        oe.disresult();


	}

}
