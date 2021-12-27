package xin_chao_the_gioi;

import static java.lang.System.out;
import java.util.Scanner;

public class Xin_chao_the_gioi {

    public static void main(String[] args) {
        Solve1(); // 1 -> 6
    }

    //Positive_negative_number
    static void Solve1() {
        Scanner sc = new Scanner(System.in);
        out.println("Input number: ");
        int a = sc.nextInt();
        out.println((a > 0) ? "Number is positive" : (a < 0) ? "Number is negative" : "Number is not positive or negative");

    }

    //Solve quadratic equations
    static void Solve2() {
        Scanner sc = new Scanner(System.in);
        out.println("Input a: ");
        double a = sc.nextInt();
        out.println("Input b: ");
        double b = sc.nextInt();
        out.println("Input c: ");
        double c = sc.nextInt();

        double delta = (Math.pow(b, 2) - 4 * a * c);
        double x1 = ((-b) + Math.sqrt(delta)) / (2 * a);
        double x2 = ((-b) - Math.sqrt(delta)) / (2 * a);
        double x3 = (-b) / (2 * a);
        out.println((delta > 0) ? "x1 = " + x1 + "\nx2 = " + x2 : (delta == 0) ? "x1 = x2 = " + x3 : "No solution");

    }

    //Greatest number
    static void Solve3() {
        Scanner sc = new Scanner(System.in);
        out.println("Input a: ");
        double a = sc.nextDouble();
        out.println("Input b: ");
        double b = sc.nextDouble();
        out.println("Input c: ");
        double c = sc.nextDouble();

        double mx1 = Math.max(a, b);
        double mx2 = Math.max(mx1, c);

        out.println(mx2);

    }

    /*
    Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
    Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, 
    or "large" if it exceeds 1,000,000
     */
    static void Solve4() {
        Scanner sc = new Scanner(System.in);
        out.println("Input the number: ");
        double a = sc.nextDouble();
        out.println("Input value: " + a);

        if (a > 0) {
            if (a < 1) {
                out.println("Your number too small");
            } else if (a > 1000000) {
                out.println("Your number too large");
            } else {
                out.println("Positive number");
            }
        } else if (a < 0) {
            if (a > -1) {
                out.println("Your number too large");
            } else if (a < -1000000) {
                out.println("Your number too small");
            } else {
                out.println("Negative number");
            }
        } else {
            out.println("Zero");
        }

    }

    /*An integer between 1 and 7 and displays the name of the weekday    
    Test Data
    Input number: 3
    Expected Output :
    Wednesday
     */
    static void Solve5() {
        String[] day = {"", "", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner sc = new Scanner(System.in);
        out.println("Input number: ");
        int a = sc.nextInt();
        out.println((a > 1 && a < 9) ? day[a] : "Please input number > 1 and < 9");
    }

    //Write a Java program that reads in two floating-point numbers and tests whether they are the same up to three decimal places
    static void Solve6() {
        Scanner sc = new Scanner(System.in);
        out.println("Input floating-point number: ");
        double a = sc.nextDouble();
        out.println("Input floating-point another number: ");
        double b = sc.nextDouble();

        a = Math.round(a*1000.0)/1000.0;
        b = Math.round(b*1000.0)/1000.0;
        
        out.println((a == b)?"They are same":"They are different");

    }

}
