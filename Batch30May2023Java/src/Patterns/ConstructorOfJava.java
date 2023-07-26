package Patterns;

/**
 * @Author -- Aditya Shinde Java + Selenium 20-Jul-2023 5:25:01 pm
 **/
public class ConstructorOfJava {
	

	
	public ConstructorOfJava () {
		
	System.out.println("I am A Constructor ");
		
	}
	
	public ConstructorOfJava(int a ) {
		
	this();
	System.out.println("Planet Earth");
		
	}
	
	public ConstructorOfJava(int a , int b) {
		
		this(100);
		System.out.println("300");
		
	}
	
	
	public ConstructorOfJava(String Iran) {
		
		this(10,20);
		System.out.println("Iran");
		
	}
	
	public ConstructorOfJava(String AFG , String BAN) {
		
		this("Tehran");
		System.out.println("Afg + Ban");
		
	}
	
	public ConstructorOfJava(char i) {
		
		this("Kabul" ,"Dhaka");
		
		System.out.println("Unity In Diversity");

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

   new  ConstructorOfJava ('D');
		
		
		
	}

}
