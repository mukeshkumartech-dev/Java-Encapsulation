package javaEncapsulation;
import java.util.Scanner;
public class Simpleencaps {

    class product{
        private double price;
        int password=112;
        
        public void setprice(int p) {
            this.price = p;
        }
    }
    public void displayProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password:");
        int inputPassword = sc.nextInt();
        product p = new product(); 
        if(p.password == inputPassword) { 
            p.price = 100; 
            if(p.price >= 0) {
                System.out.println("The price is: $" + p.price);
            } else {
                System.out.println("Invalid price.");
            }
            System.out.println("Access granted. The price is $" + p.price + ".");
        } else {
            System.out.println("Access denied. Incorrect password.");
        }
        sc.close();
    }

    public static void main(String[] args) {
        Simpleencaps obj = new Simpleencaps();
        product p = obj.new product(); 
        p.setprice(150);
        obj.displayProduct(); 
        
    }
      

}

