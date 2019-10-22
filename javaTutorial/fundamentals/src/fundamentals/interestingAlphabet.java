package fundamentals;
import java.util.Scanner;

public class interestingAlphabet {
	
	/*
	 * if n =5
	 * output
	 *	E
	 *	DE
	 *	CDE
	 *	BCDE
	 *	ABCDE
	 */
	
	public static void main(String[] args) {
		//Your code goes here
        char ch = 'A';
        int ascii = ch;
        
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ascii+=n-1;
        int temp;
        for(int i = 1; i < n+1; i++){
            temp = ascii;
            for(int j = 0; j < i; j++ ){
                System.out.print((char)ascii);
                ascii+=1;
            }
            System.out.print("\n");
            ascii = temp;
            ascii-=1;
        }

	}

}
