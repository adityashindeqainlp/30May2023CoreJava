package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 29-Jun-2023 6:34:55 pm
 **/
public class P15_MarkSheet {

	public static void markSheet(int phy, int chem, int maths) {

		int physics = phy;
		int chemistry = chem;
		int mathematics = maths;

		System.out.println("physics : " + physics);
		System.out.println("chemistry : " + chemistry);
		System.out.println("mathematics : " + mathematics);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Marks of Yasmin : ");
		markSheet(85, 95, 90);

		System.out.println();

		System.out.println("Marks of Salim : ");
		markSheet(80, 90, 89);

		System.out.println();

		System.out.println("Marks of Yasmin : ");
		markSheet(85, 95, 90);

	}

}
