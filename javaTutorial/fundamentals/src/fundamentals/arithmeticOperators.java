package fundamentals;

public class arithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 3;
		int c = 10% 3;
		System.out.println(c);
		
		double k = 10/30;
		System.out.println(k);
		// this will still return 0.0
		
		k = 10.0/30.0;
		System.out.println(k);
		
		k = 10/30.0;
		System.out.println(k);
		// equal precedence
		// /,*,%
		// +,-
		c = 3 * 2/5;
		// first multiplication and then divison
		System.out.println(c);
		

	}

}
