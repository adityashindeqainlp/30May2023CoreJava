package Strings;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Aug-2023 1:32:44 pm
 **/
public class trial {

	public static void main(String[] args) {

		// Old way to define string
		String a = new String("Tom");

		// Literal
		String b = "jerry";

		// 1 char at
		char a1 = a.charAt(2);
		System.out.println(a1);

		// 2 Concat
		String b1 = a.concat(b);
		System.out.println(b1);

		// 3 equals
		boolean c1 = a.equals("Tom");
		System.out.println(c1);

		// 4 equalsIgnoreCase
		boolean d1 = a.equalsIgnoreCase("tom");
		System.out.println(d1);

		// 5 substr
		String e1 = b.substring(2);
		System.out.println(e1);

		// 6 substr
		String f1 = b.substring(2, 4);
		System.out.println(f1);

		// 7 contains
		boolean g1 = b.contains("je");
		System.out.println(g1);

		// 8 trim
		String c = "  spike  ";
		String h1 = c.trim();
		System.out.println(h1);

		// 9 replace
		String i1 = b.replace('r', 'h');
		System.out.println(i1);

		// 10 replaceAll
		String d = "j e r r y";
		String j1 = d.replaceAll(" ", "");
		System.out.println(j1);

		// 11 To upper case
		String k1 = b.toUpperCase();
		System.out.println(k1);

		// 12 to Lower Case
		String l1 = b.toLowerCase();
		System.out.println(l1);

		// 13 blank
		boolean m1 = b.isBlank();
		System.out.println(m1);

		// 14 Length
		int n1 = b.length();
		System.out.println(n1);

		// 15 Index Of
		int o1 = a.indexOf('m');
		System.out.println(o1);

		// 16 Last Index Of
		int p1 = b.lastIndexOf('r');
		System.out.println(p1);

		// 17 Is Empty
		boolean q1 = b.isEmpty();
		System.out.println(q1);

		// 18 to char array
		char[] r1 = b.toCharArray();

		for (char r : r1) {

			System.out.println(r);
		}

		for (int i = 0; i < r1.length; i++) {

			System.out.println(r1[i]);
		}

		// 19 is digit
		char s1 = b.charAt(2);
		boolean t1 = Character.isDigit(s1);
		System.out.println(t1);

		// 20 split

		String u1 = "Tom & Jerry";
		String[] arr = u1.split("\\s");
	
		for (String ar : arr) {

			System.out.println(ar);
		}

	}
}
