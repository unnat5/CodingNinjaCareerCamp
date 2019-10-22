package fundamentals;

import java.util.Scanner;

public class takingInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		Scanner s = new Scanner(System.in);
		a = s.nextInt();
		b = s.nextInt();
		
		int c = a+b;
		System.out.println(c);
		/*
		 * for float stdin
		 * s.nextfloat()
		 * for double stdin
		 * s.nextDouble
		 * for long stdin
		 * s.nextlong()
		 * 
		 */

	}

}
