package Encapsulation;

/**
 * @Author -- Aditya Shinde Java + Selenium 04-Aug-2023 4:45:07 pm
 **/
public class B extends A{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B obj = new B();
		
		//Set
		obj.setEmpid(1001);
		obj.setName("Salim");
		
		//get
		System.out.println(obj.getEmpid());
		System.out.println(obj.getName());
	
		obj.setEmpid(1002);
		obj.setName("Anju");
		
		System.out.println(obj.getEmpid());
		System.out.println(obj.getName());
		
	}

}
