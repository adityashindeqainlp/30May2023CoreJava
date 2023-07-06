package controlstatements;

/**
 * @Author -- Aditya Shinde Java + Selenium 06-Jul-2023 8:53:32 am
 **/
public class IncomeTaxSheet {

	public static void main(String[] args) {

		int salary = 350000;

		if (salary < 250000) {

			System.out.println("Not applicable for income tax ");

		} else if (salary > 250000 && salary < 500000) {

			double taxPer = 0.03 * salary;

			System.out.println("3% Tax apply on the Total Salary : " + taxPer);

		} else if (salary > 500000 && salary < 750000) {

			double taxPer = 0.05 * salary;

			System.out.println("5% Tax apply on the Total Salary : " + taxPer);
		} else if (salary > 750000) {

			double taxPer = 0.07 * salary;

			System.out.println("7% Tax apply on the Total Salary : " + taxPer);
		}

	}
}
