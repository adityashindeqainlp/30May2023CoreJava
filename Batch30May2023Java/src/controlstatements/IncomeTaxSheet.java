package controlstatements;

import java.util.Scanner;

/**
 * @Author -- Aditya Shinde Java + Selenium 06-Jul-2023 8:53:32 am
 **/
public class IncomeTaxSheet {

	public int salary;

	public void incomeTaxCalculator(int salary ) {
 
		this.salary = salary;
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the salary Here ...");
//		int salary = sc.nextInt();

		if (salary >= 0 && salary <= 250000) {

			System.out.println("Not Applicable for Tax");

		}

		else if (salary >= 250000 && salary <= 500000) {

			double tax = 0.03 * salary;
			double net = salary - tax;

			System.out.println("3% Tax is Apply on Salary     " + tax + "   Net Salary  " + net);
		}

		else if (salary >= 500000 && salary <= 750000) {

			double tax = 0.05 * salary;
			double net = salary - tax;

			System.out.println("5% Tax is Apply on Salary     " + tax + "   Net Salary  " + net);
		} else if (salary >= 750000 && salary <= 1000000) {

			double tax = 0.07 * salary;
			double net = salary - tax;

			System.out.println("7% Tax is Apply on Salary     " + tax + "   Net Salary  " + net);
		} else {

			double tax = 0.09 * salary;
			double net = salary - tax;

			System.out.println("9% Tax is Apply on Salary     " + tax + "   Net Salary  " + net);

			System.out.println();
		}

	}

	public static void main(String[] args) {

		IncomeTaxSheet aditya = new IncomeTaxSheet();
		aditya.incomeTaxCalculator(450000);

		IncomeTaxSheet raz = new IncomeTaxSheet();
		raz.incomeTaxCalculator(570000);

		IncomeTaxSheet anju = new IncomeTaxSheet();
		anju.incomeTaxCalculator(760000);

		IncomeTaxSheet jessi = new IncomeTaxSheet();
		jessi.incomeTaxCalculator(1500000);
		
//		IncomeTaxSheet veena = new IncomeTaxSheet();
//		veena.incomeTaxCalculator();
		
	}
}
