package javaEncapsulation;

import java.util.Scanner;

public class ATMMachine {

	static int userid = 1212;
	static String password = "mukesh123";

	static int atmid;
	static String location = "Omalur Salem";
	static double money;
	static String login = "Fail";

	static {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Userid: ");
		int uid = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Password: ");
		String pass = sc.nextLine();

		if (userid == uid && password.equals(pass)) {
			System.out.println("Login Successful ");
			login = "Success";

		} else {
			System.out.println("Wrong userid or password ");
			login = "Fail";
		}
	}

	public static void setAtmId(int id) {
		if (id >= 100000) {
			atmid = id;
			System.out.println("ATM ID set successfully");
		} else {
			System.out.println("Enter minimum 6-digit ATM ID");
		}
	}

	public static void checkAtmId() {
		System.out.println("ATM ID : " + atmid);
	}

	public static void setLocation(String loc) {
		if (loc.length() > 10) {
			location = loc;
			System.out.println("Location set successfully");
		} else {
			System.out.println("Enter full location");
		}
	}

	public static void checkLocation() {
		System.out.println("Location : " + location);
	}

	public static void addMoney(double amt) {
		if (amt >= 1000) {
			money += amt;
			System.out.println("Money added successfully");
		} else {
			System.out.println("Minimum amount is 1000");
		}
	}

	public static void checkMoney() {
		System.out.println("Money : " + money);
	}

	public static void main(String[] args) {
		if (login == "Fail") {
			return;
		}

		Scanner sc = new Scanner(System.in);
		int choice = 0;

		while (choice != 4) {

			System.out.println("\n1. Set ATM ID");
			System.out.println("2. Location");
			System.out.println("3. Money");
			System.out.println("4. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter ATM ID: ");
				setAtmId(sc.nextInt());
				break;

			case 2:
				System.out.println("1. Set Location");
				System.out.println("2. Check Location");
				int l = sc.nextInt();
				sc.nextLine();

				if (l == 1) {
					System.out.print("Enter Location: ");
					setLocation(sc.nextLine());
				} else {
					checkLocation();
				}
				break;

			case 3:
				System.out.println("1. Add Money");
				System.out.println("2. Check Money");
				int m = sc.nextInt();

				if (m == 1) {
					System.out.print("Enter Amount: ");
					addMoney(sc.nextDouble());
				} else {
					checkMoney();
				}
				break;

			case 4:
				System.out.println("Thank you ");
				break;

			default:
				System.out.println("Invalid choice");
			}
		}
		sc.close();
	}
}
