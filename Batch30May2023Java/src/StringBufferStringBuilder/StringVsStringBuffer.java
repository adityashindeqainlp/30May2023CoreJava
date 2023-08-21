package StringBufferStringBuilder;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Aug-2023 4:44:45 pm
 **/
public class StringVsStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Tom";
		boolean check = s.equals("Tom");
		System.out.println(check);

		StringBuffer sb = new StringBuffer("Jerry");
		StringBuffer sb1 = new StringBuffer("Jerry");

		boolean check1 = sb.equals(sb1);
		System.out.println(check1);

		// String vs String Buffer Execution speed

		String a = "Tom";
		long startTime = System.currentTimeMillis();

		for (int i = 0; i <= 100000; i++) {

			String b = a.concat(" & Jerry");
		}

		System.out.println("Time Taken By String :  " + (System.currentTimeMillis() - startTime) + " ms ");

		StringBuffer sb2 = new StringBuffer("Tom");
		startTime = System.currentTimeMillis();

		for (int i = 0; i <= 100000; i++) {

			StringBuffer c = sb2.append(" & Jerry");
		}

		System.out.println("Time Taken By StringBuffer :  " + (System.currentTimeMillis() - startTime) + " ms ");

		StringBuilder sbd = new StringBuilder("Tom");
		startTime = System.currentTimeMillis();

		for (int i = 0; i <= 100000; i++) {

			StringBuffer c = sb2.append(" & Jerry");
		}

		System.out.println("Time Taken By StringBuilder :  " + (System.currentTimeMillis() - startTime) + " ms ");

	}

}
