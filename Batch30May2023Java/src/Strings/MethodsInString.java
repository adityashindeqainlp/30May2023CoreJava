package Strings;

/**
 * @Author -- Aditya Shinde Java + Selenium 11-Aug-2023 5:35:39 pm
 **/
public class MethodsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1 Length
		String a = "Tom";
		int b = a.length();
		System.out.println(b);

		// 2 CharAt(Int Index) 0- T , 1 - o , 2 - m
		char c = a.charAt(2);
		System.out.println(c);

		// 3 Concat
		String d = a.concat(" & Jerry");
		System.out.println(d);

		// 4 equal
		boolean e = a.equals("tom");
		System.out.println(e);

		// 5 equalIgnoreCase
		boolean f = a.equalsIgnoreCase("tom");
		System.out.println(f);

		// 6 contains
		String g = "Spike";
		boolean h = g.contains("IK");

		// 7 toUpper Case
		String i = g.toUpperCase();
		System.out.println(i);

		// 8 to Lower Case
		String j = g.toLowerCase();
		System.out.println(j);

		// 9 isEmpty
		boolean k = g.isEmpty();
		System.out.println(k);

		// 10 isBlank
		boolean l = g.isBlank();
		System.out.println(l);

		String sp = "    ";

		System.out.println(sp.isEmpty());

		System.out.println(sp.isBlank());

		// 11 Trim
		String a1 = "  mrBean   ";
		String b1 = a1.trim();
		System.out.println(b1);

		// 12 IndexOf
		// 0-m , 1-r , 2-B , 3-e , 4-a , 5-n
		String c1 = "mrBean";
		int d1 = c1.indexOf('B');
		System.out.println(d1);

		// 13 Last Index Of
		int e1 = c1.lastIndexOf('a');
		System.out.println(e1);

		// 14 subString
		String f1 = c1.substring(2);
		System.out.println(f1);

		// 15 subString (start index , end Index )
		String g1 = c1.substring(1, 5);
		System.out.println(g1);

		// 16 Replace
		String h1 = "HelloWorld";
		String i1 = h1.replace('l', 'w');
		System.out.println(i1);

		// 17 Replace All
		String j1 = h1.replaceAll("World", "Java");
		System.out.println(j1);

		// 18 Split
		String o1 = "Tom & Jerry";
		String[] arr = o1.split("\\s");
		for (String ar : arr) {
			System.out.println(ar);
		}

		String ip = "192.168.1.100";
		String[] ips = ip.split("\\.");

		for (String i2 : ips) {

			System.out.println(i2);
		}

		// 19 Is Digit
		// 0-T , 1-o , 2-m , 3-1 , 4-2 , 5-1 , 6-@ , 7-J , 8- e , 9-r , 10 -r , 11 -y
		String x1 = "Tom121@Jerry";
		char y1 = x1.charAt(4);
		boolean check1 = Character.isDigit(y1);
		System.out.println(check1);

		// 20 To char Array
		char[] chs = x1.toCharArray();
		for (char ch : chs) {

			System.out.print(ch + " ");
		}

		System.out.println();

		for (int z = chs.length - 1; z >= 0; z--) {

			System.out.print(chs[z] + " ");

		}
	}

}
