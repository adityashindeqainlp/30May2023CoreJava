package StringBufferStringBuilder;

/**
 * @Author -- Aditya Shinde Java + Selenium 18-Aug-2023 3:56:53 pm
 **/
public class p1 {

	public static void main(String[] args) {

		String s = "Hello";
		long startTime = System.currentTimeMillis();
		for (int i = 0; i <= 10000; i++) {

			s.concat("world");
		}

		System.out.println("Total time taken by string : " + (System.currentTimeMillis() - startTime) + "ms");

		
		
		
		StringBuffer sb = new StringBuffer("Hello");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {

			sb.append("world");
		}

		System.out.println("Total time taken by stringBuffer : " + (System.currentTimeMillis() - startTime) + "ms");

		
		
		StringBuilder sbd = new StringBuilder("Hello");
		startTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {

			sbd.append("world");
		}

		System.out.println("Total time taken by stringBuilder : " + (System.currentTimeMillis() - startTime) + "ms");

		
		
		
	}

}
