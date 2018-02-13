import java.util.*;
public class Main {

    public static void main(String args[]){
        Scanner scnr = new Scanner(System.in);
        int mpg;
        int exit = 0;

            System.out.println("Enter your car's MPG rating (miles/gallon) as a positive integer: ");
            mpg = scnr.nextInt();
            if (mpg <= 0) {
                System.out.println("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
                System.exit(0);
            }
            System.out.println("Enter your car's tank capacity (gallons) as a positive decimal number: ");
            double tankCap = scnr.nextDouble();
            if (tankCap <= 0) {
                System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ACCEPTED FOR TANK CAPACITY!!!");
                System.exit(0);
            }
            System.out.println("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
            double tankPercent = scnr.nextDouble();
            if (tankPercent < 0 || tankPercent > 100) {
                System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
                System.exit(0);
            }
            double rawRange = mpg * tankCap * (tankPercent * .01);
            if (rawRange > 25) {
                System.out.print("Keep driving! Your current estimated range is: " + (int) rawRange + " miles!");
            } else {
                System.out.print("Attention! Your current estimated range is running low: " + (int) rawRange + " miles left!!!");
            }
        }

    }

