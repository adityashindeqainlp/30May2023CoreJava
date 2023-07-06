package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 30-Jun-2023 6:07:37 pm
 **/
public class OperatorsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;

		// Unary
		// Post fix (a ++ a --)
		a++;
		System.out.println(a); // 6
		// Pre-fix
		++a;
		System.out.println(a); // 7

		// Post fix
		a--;
		System.out.println(a); // 6

		// pre -fix
		--a;
		System.out.println(a);// 5

		// Arithmetic operators
		int b = 1;
		int c = 1;

		int d = b / c;

		System.out.println(b / c);
		System.out.println(d);

		int a1 = 10;
		int b1 = 9;

		int c1 = a1 % b1; // 0 or 1

		System.out.println(c1);

		// Comparison Operators > ,< ,<= ,>= ,== , !=

		int x = 10;
		int y = 20;

		boolean z = x < y;

		System.out.println(z);
		System.out.println(x > y);
		System.out.println(x == y);
		System.out.println(x != y);

		System.out.println();

		// Logical And --> && // Rule Both Conditions are True in Nature

		// True //True
		System.out.println((x < y) && (x != y)); // True

		// true //false
		System.out.println((x < y) && (x == y)); // False

		// False //True
		System.out.println((x > y) && (x != y)); // False

		// False //False
		System.out.println((x == y) && (x > y)); // False

		System.out.println();

		// Logical OR --> || Only one condition must be true

		// True //True
		System.out.println((x < y) || (x != y)); // True

		// True //False
		System.out.println((x < y) || (x == y)); // True

		// False //True
		System.out.println((x == y) || (x < y)); // True

		// False //False
		System.out.println((x == y) || (x > y)); // False
		
		
		//Assignment operators 
		
		System.out.println();
		
		int r = 1;
		int s = 189;
		int t = r+s;
		System.out.println(t);
		
		System.out.println(r); // 1 
		 
		r+=5;
		System.out.println(r); // 6
		
		r-=2;
		System.out.println(r);//4
		
		r*=10;
		System.out.println(r); //40
		
		r/=5;
		System.out.println(r); //8
		
		r%=3;
		System.out.println(r); //2
		

	}

}
