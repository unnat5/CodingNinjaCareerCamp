package fundamentals;

import java.util.Scanner;

public class stringInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		// Taking one word as input
		String str = s.next();
		char ch = str.charAt(0);
		
		
		// Taking a whole line as an input
		String linestr = s.nextLine();
		
		
		
		System.out.println(str);
		System.out.println(linestr);

	}

}
