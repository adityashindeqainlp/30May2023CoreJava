package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 10-Jul-2023 9:43:26 am
 **/
public class TableMethodUsingWhile {

	public int num;
	public int limit;
	public int multiple;

	// User Define Figure Table along with start multiple value and end multiple
	// value

	public void table(int num, int start, int end) {

		this.num = num;
		multiple = start;
		limit = end;

		while (multiple <= limit) {

			int multi = num * multiple;

			System.out.println(multi);

			multiple++;

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TableMethodUsingWhile obj = new TableMethodUsingWhile();
		obj.table(2, 13, 29);
	}

}
