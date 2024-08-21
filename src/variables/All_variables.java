package variables;

public class All_variables {

	public static void main(String[] args) {
		
		// Syntex to define variable :
		// type variableName = value;
		
		/* 
		byte	1 byte	Stores whole numbers from -128 to 127
		short	2 bytes	Stores whole numbers from -32,768 to 32,767
		int	4 bytes	Stores whole numbers from -2,147,483,648 to 2,147,483,647
		long	8 bytes	Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		float	4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
		double	8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
		boolean	1 bit	Stores true or false values
		char	2 bytes	Stores a single character/letter or ASCII values */
		

		int a = 127;
		float b = 5.99f;
		char c = 'D';
		boolean d = true;
		String e = "Hello";
		byte g = 127;
		short h = 32767;
		long i = 922337259;
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);
		
		
	}

}
