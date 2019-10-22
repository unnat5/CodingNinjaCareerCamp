package fundamentals;
import java.util.Scanner;
/*
 * if n =4
 * output
 * A
 * BC
 * CDE
 * DEFG
 */

public class characterPattern {
	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        char ch = 'A';
        int ascii = ch;
        // ascii-=1;
        int temp;
        for(int i =1;i<n+1;i++){
            // System.out.print(i+"***");
            temp = ascii;
            for(int j=0;j<i;j++){
                System.out.print((char)ascii);
                ascii+=1;
            }
            ascii =temp;
            ascii+=1;
            // ascii-=1;
            System.out.print("\n");
        }

		
	}

}
