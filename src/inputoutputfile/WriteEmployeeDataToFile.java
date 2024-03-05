package inputoutputfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteEmployeeDataToFile {

	public static void main(String[] args) {
		try {
			int numberOfEmployees = 2;

			FileOutputStream fout = new FileOutputStream("D:\\ReadWriteFile\\sample.txt");

			Scanner sc = new Scanner(System.in);
			for (int i = 1; i <= numberOfEmployees; i++) {
				System.out.println("Enter details for Employee " + i + ":");

				System.out.println("Enter employee ID: ");
				int id = sc.nextInt();
				System.out.println("Enter employee Name: ");
				String name = sc.next();
				System.out.println("Enter employee Email: ");
				String email = sc.next();

				String employeeData = "Employee ID: " + id + "\n" + "Employee Name: " + name + "\n" + "Employee Email: "
						+ email + "\n";

				byte b[] = employeeData.getBytes();

				fout.write(b);

				System.out.println("Employee " + i + " stored");

			}
			System.out.println("All Employee details stored into file");
			fout.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

		try {
			FileInputStream fin = new FileInputStream("D:\\ReadWriteFile\\sample.txt");
			int i = 0;
			while ((i = fin.read()) != -1) {
				System.out.print((char) i);
			}
			fin.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
