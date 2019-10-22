package fundamentals;

public class typeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'c';
		int i = ch;
		System.out.println(i);
		// char to int automatic type conversion (implicit)
		// int to char is explicit type 
		ch = (char)i;
		ch = (char)(ch+1);
		System.out.println(i);
		short k = 3;
		i = k;
		k = (short)i;//explicit conversion
		System.out.println('c'+0);

	}

}
