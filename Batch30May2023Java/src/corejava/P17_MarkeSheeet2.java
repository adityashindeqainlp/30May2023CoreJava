package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 30-Jun-2023 5:30:05 pm
 **/
public class P17_MarkeSheeet2 {

	public String name;
	public int physics;
	public int chemistry;
	public int english;
	public double avg;

	public void marksheet(String name, int physics, int chemistry, int english) {

		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.english = english;
		avg = (physics + chemistry + english) / 3.0;

		System.out.println("Physics : " + physics);
		System.out.println("chemistry : " + chemistry);
		System.out.println("Englis : " + english);
		System.out.println("Average : " + avg);

		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		P17_MarkeSheeet2 obj = new P17_MarkeSheeet2();

		obj.marksheet("Anju", 75, 85, 95);
		obj.marksheet("raz", 85, 89, 93);
		obj.marksheet("salim", 79, 83, 87);
		obj.marksheet("Tom", 56, 47, 86);

	}

}
