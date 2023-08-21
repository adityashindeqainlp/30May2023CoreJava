package StringBufferStringBuilder;

/**
 * @Author -- Aditya Shinde Java + Selenium 17-Aug-2023 5:26:41 pm
 **/
public class StringBuliderMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Defining the String Buffer 
		StringBuilder sb = new StringBuilder("Tom");
		
		System.out.println(sb);
		
		// 1 Capacity
		StringBuilder sb1 = new StringBuilder();
	    int cap = sb1.capacity();
		System.out.println(cap);
		
		// 2 Length 
		int len = sb.length();
		System.out.println(len);
		
		// 3 reverse 
		sb.reverse();
		System.out.println(sb);
		
		// 4 append 
		StringBuilder sb2 = new StringBuilder("Spike");
		sb2.append(" is a Dog");
		System.out.println(sb2);
		
		// 5 delete 
		sb2.delete(5, 14);
		System.out.println(sb2);
		
		//6 Replace 
		sb2.replace(0, 5, "Jerry");
		System.out.println(sb2);
		
		// 7 Insert 
		sb2.insert(2, "Tom");
		System.out.println(sb2);
		
		
	}

}
