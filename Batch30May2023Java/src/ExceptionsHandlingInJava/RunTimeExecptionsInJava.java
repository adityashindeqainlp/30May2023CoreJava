package ExceptionsHandlingInJava;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Aug-2023 4:47:47 pm
 **/
public class RunTimeExecptionsInJava {

	public static void main(String[] args) {

		System.out.println("Initialise Server and Start Database");
		
		
		int a = 1;
		System.out.println(a);
		int b = 2;
		System.out.println(b);
		
		
		
		try {
		
		int c = 3 / 0;
		System.out.println(c);
		
		}
		catch(ArithmeticException a1) {
			
			System.out.println("Cause : "+ a1.getMessage() + " Class: "+ a1.getClass());
		}
		catch(NullPointerException b1) {
			
			System.out.println("Cause : "+ b1.getMessage() + " Class: "+ b1.getClass());
		}
		catch(StringIndexOutOfBoundsException c1) {
			
			System.out.println("Cause : "+ c1.getMessage() + " Class: "+ c1.getClass());
		}
		catch (IllegalArgumentException d1) {
			
			System.out.println("Cause : "+ d1.getMessage() + " Class: "+ d1.getClass());
		}
		
		catch(Exception e) {
			
			System.out.println("Master Class Of Exception");
			
			System.out.println("Cause : "+ e.getMessage() + " Class: "+ e.getClass());
		}
		
		finally {
			
			System.out.println("Close all the secure access from database");
			
		}
		
		
		
		
		
		
		double d = 0.0 / 0.0;
		System.out.println(d);
		int e = 4;
		System.out.println(d);
		int f = 5;
		System.out.println(e);

		// System.out.println(Math.sqrt(-5));

	}

}
