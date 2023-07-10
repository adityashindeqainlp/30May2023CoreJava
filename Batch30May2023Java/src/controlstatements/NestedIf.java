package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 07-Jul-2023 5:18:00 pm
 **/
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Only 20000 Salary Will get 5000 Bonus , According salary bonus
		 */

		int salary = 20000;
		int bonus = 5000;

		if (salary == 20000) {

			if (bonus == 5000) {

				int grossSalary = salary + bonus;

				System.out.println("Gross Salary : " + grossSalary);

			}

		} else {

			System.out.println("Salary and Bonus Values are not Matching ");
		}

	}

}
