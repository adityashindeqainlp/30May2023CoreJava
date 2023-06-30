package corejava;

/**
 * @Author -- Aditya Shinde Java + Selenium 29-Jun-2023 6:34:55 pm
 **/
public class P16_MarkSheetNonStatic {

	public void markSheet(int phy, int chem, int maths) {

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
		P16_MarkSheetNonStatic yasmin = new P16_MarkSheetNonStatic();
		yasmin.markSheet(85, 95, 90);

		System.out.println();

		System.out.println("Marks of Salim : ");
		P16_MarkSheetNonStatic salim = new P16_MarkSheetNonStatic();
		salim.markSheet(80, 90, 89);

		System.out.println();

		System.out.println("Marks of Veena");
		P16_MarkSheetNonStatic veena = new P16_MarkSheetNonStatic();
		veena.markSheet(85, 95, 88);

	}

}
