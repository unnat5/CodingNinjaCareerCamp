package fundamentals;

public class loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		   while(i<5)
		   {
		       System.out.print(2*i);
		       i=i+1;
		   }
		   System.out.println("");
		   i=2;
		   while(i<10)
		   {
		       System.out.print(i);
		       i=i+2;
		   }
		   
		   System.out.println("");
		   i=2;
		   while(i<10)
		   {
		       System.out.print(i);
		       i*=2;
		   }
		   System.out.println("");
		   i=10;
		   while(i>0)
		   {
		       if(i%2==0)
		       {
		           System.out.print(10-i);
		       }
		       i--;
		   }
		   
		    for(int k = 0; k < 3; k++) {
		        System.out.print(k + " ");
		        }
//		    System.out.print(k + " ");

	}

}
