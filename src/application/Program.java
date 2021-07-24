package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourceEmployee;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> listEmployee = new ArrayList<Employee>();

		System.out.print("Enter the number of employee: ");
		int quant_E = sc.nextInt();

		int i = 1;
		while (i <= quant_E) {
			double vadd = 0;

			System.out.println("Employee #" + i + " data: \n");
			System.out.println("Outsourced: (yes/no): ");
			String resp = sc.next().toUpperCase();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hours: ");
			double vph = sc.nextDouble();

			if (resp.indexOf("Y") != -1) {
				System.out.print("Addicional charge: ");
				vadd = sc.nextDouble();
				listEmployee.add(new OutsourceEmployee(name, hours, vph, vadd));
			} else {
				listEmployee.add(new Employee(name, hours, vph));
			}
			
			i++;
		}

		for (Employee e : listEmployee) {
			System.out.println(e.getNome() + " - " + e.payment());
		}

		sc.close();
	}
}
