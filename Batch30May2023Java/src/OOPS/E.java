package OOPS;

/**
 * @Author -- Aditya Shinde Java + Selenium 27-Jul-2023 4:53:23 pm
 **/
public class E extends D {

	public static int a = 1000;
	public int b = 2000;

	public static void m1() {

		int a = 11;
		int b = 22;

		System.out.println(a);
		System.out.println(E.a);
		//Parent Class Global Static Variable in Static Method Of Child
		//ClassName.Variable Name 
		System.out.println(D.a);

		System.out.println(b);
		E obj = new E();
		System.out.println(obj.b);
		
		//Parent Class Global Non Static Variable in Static Method Of Child
		//Object of Child Store In Parent Reference 
		D obj1 = new E();
		System.out.println(obj1.b);
	}

	public void m2() {

		int a = 21;
		int b = 22;
		System.out.println(a);
		System.out.println(E.a);
		//Parent Class Global Static Variable in Static Method Of Child
		//ClassName.Variable Name 
		System.out.println(D.a);
		
		System.out.println(b);
		System.out.println(this.b);
		//Parent Class Global Non Static Variable in Static Method Of Child
        // super.variableName 
		System.out.println(super.b);

	}

	public static void main(String[] args) {

//		System.out.println(B.a);
//
//		B ref = new E();
//
//		System.out.println(ref.b);

		m1();

		System.out.println();

		E obj = new E();
		obj.m2();

	}

}
