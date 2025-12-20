package javaEncapsulation;

import java.util.Scanner;

class ATM {

    static int userid = 1212;
    static String password = "mukesh123";

    private static int atmid;
    private static String location = "Omalur Salem";
    private static double money;

    public static String checkLogin(int uid, String pass) {
        if (userid == uid && password.equals(pass)) {
            return "Correct";
        }
        return "Wrong";
    }

    
    public static void setAtmId() {

        Scanner sc = new Scanner(System.in);
        int id = 0;

        while (id < 100000) {
            System.out.print("Enter ATM ID: ");
            id = sc.nextInt();

            if (id < 100000) {
                System.out.println("please enter Minimum 6-digit");
            } else {
                atmid = id;
                System.out.println("ATM ID set successfully");
            }
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
            System.out.println("Please enter location with District");
        }
    }

    public static void checkLocation() {
        System.out.println("Location : " + location);
    }

   
    	public static void addMoney() {

    	    Scanner sc = new Scanner(System.in);
    	    double amt = 0;

    	    while (amt <= 0) {

    	        System.out.print("Enter amount to add: ");
    	        amt = sc.nextDouble();

    	        if (amt <=1000) {
    	            System.out.println("Enter valid amount greater than 0");
    	        } else {
    	            money = money + amt;
    	            System.out.println("Money added successfully");
    	        }
    	    }
    	}

    

    public static void checkMoney() {
        System.out.println("Money : " + money);
    }
}

public class ATMMachine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Userid: ");
        int uid = sc.nextInt();

        System.out.print("Enter Password: ");
        sc.nextLine();
        String pass = sc.nextLine();

        String result = ATM.checkLogin(uid, pass);

        if (result.equals("Wrong")) {
            System.out.println("Wrong userid or password");
            sc.close();
            return;
        }

        System.out.println("Login Successful");

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n1. ATM ID");
            System.out.println("2. Location");
            System.out.println("3. Money");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:
                System.out.println("1. Set ATM ID");
                System.out.println("2. Check ATM ID");
                int a = sc.nextInt();

                if (a == 1) {
                    ATM.setAtmId();   
                } else {
                    ATM.checkAtmId();
                }
                break;

            case 2:
                System.out.println("1. Set Location");
                System.out.println("2. Check Location");
                int b = sc.nextInt();
                sc.nextLine();

                if (b == 1) {
                    System.out.print("Enter Location: ");
                    String loca = sc.nextLine();
                    ATM.setLocation(loca);
                } else {
                    ATM.checkLocation();
                }
                break;

            case 3:
                System.out.println("1. Add Money");
                System.out.println("2. Check Money");
                int c = sc.nextInt();

                if (c == 1) {
                   
                    ATM.addMoney();
                } else {
                    ATM.checkMoney();
                }
                break;

            case 4:
                System.out.println("Thank you");
                break;

            default:
                System.out.println("Invalid choice");
            }
        }
        sc.close();
    }
}
