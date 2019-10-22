package fundamentals;
import java.util.Scanner;
import java.lang.Math;

public class totalSalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
        int basic = s.nextInt();
        String grade = s.next();
        double hra = (20.0/100.0)*basic;
        double da = (50.0/100.0)*basic;
        int allow;
        if (grade.equals("A")){
            allow = 1700;
        } else if(grade.equals("B")){
            allow=1500;
        } else{
            allow = 1300;
        }
        double pf = (11.0/100)*basic;
        double total = (basic+hra+da+allow-pf);
        System.out.println(Math.round(total));
	}

}
