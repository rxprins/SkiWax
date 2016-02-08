package prins.riana.SkiWax;

import prins.riana.SkiWax.Wax;

import java.util.Scanner;

public class Waxes {


    public static void main(String[] args) {
        int temp = 0;
        String snow;
    //Ask for input from the client
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        temp = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter snow condition (Powder, Firm or Crusty)");
        snow = sc.nextLine().toLowerCase();

         Wax w1 = new Wax();
         w1.createWax(temp, snow);

        System.out.println("The wax you need is : " + w1.getColor() + " " + w1.getType());

        }
    }

