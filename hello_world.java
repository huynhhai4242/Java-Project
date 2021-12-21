
import java.util.Scanner;

public class helloworld {

    public static void clearScreen() {  
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    } 
    public static void main(String[] args) {
        clearScreen();
        //Change this: Ex Solve1() 
        Solve10();
    }
    private static void Solve1() {
        System.out.println("Hello");
        System.out.println("Alexandra Abramov");
    }
    private static void Solve2() {
        int num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1: ");
        num1 = sc.nextInt();
        System.out.println("Input num2: ");
        num2 = sc.nextInt();
        System.out.println("Test Data:");
        System.out.println(num1 + "+" + num2);
        System.out.println("Expected Output:");
        System.out.println(num1 + num2);
    }
    private static void Solve3() {
        int num1 = 0, num2 = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input num1: ");
        num1 = sc.nextInt();
        System.out.println("Input num2: ");
        num2 = sc.nextInt();
        System.out.println("Test Data:");
        System.out.println(num1 + "/" + num2);
        System.out.println("Expected Output:");
        System.out.println(num1 / num2);
    }
    private static void Solve4() {
        System.out.println(-5 + 8 * 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);
    }
    private static void Solve5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num1 = sc.nextInt();
        System.out.print("Input second number: ");
        int num2 = sc.nextInt();
        System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    }
    private static void Solve6(){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        num1 = sc.nextInt();
        System.out.print("Input second number: ");
        num2 = sc.nextInt();
        System.out.println("Expected Output: ");
        System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1*num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1%num2));

    }
    private static void Solve7(){
        int num1=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        num1 = sc.nextInt();
        System.out.println("Expected Output: ");
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(num1 + " x " + i + " = " + (num1*i));
        }
    }
    private static void Solve8(){
        String[] array1 = {" "," ", " " , "J", " ", " "," ", " ", "a"," ", " "," ", "v"," ", " "," ", " "," ", "v"," ", " ","a"," ", " "," "};
        String[] array2 = {" ", "J", " " , "J", " ", " "," ", "a", " ","a", " "," ", " ","v", " "," ", " ","v", " "," ", "a"," ","a", " "," "};
        String[] array3 = {"J", " ", " " , "J", " ", " ","a", "a", "a","a", "a"," ", " "," ", "V"," ", "V"," ", " ","a", "a","a","a", "a"," "};
        String[] array4 = {" ", "J", " " , "J", " ", " ","a", " ", " "," ", "a"," ", " "," ", " ","V", " "," ", "a"," ", " "," "," ", " ","a"};

        for(int i = 0; i<25; i++)
        {
            System.out.print(array1[i]);
        }
        System.out.println("");
        for(int i = 0; i<25; i++)
        {
            System.out.print(array2[i]);
        }
        System.out.println("");
        for(int i = 0; i<25; i++)
        {
            System.out.print(array3[i]);
        }
        System.out.println("");
        for(int i = 0; i<25; i++)
        {
            System.out.print(array4[i]);
        }
    }
    private static void Solve9(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Test Data:");
        System.out.print("Expected Output:\n" + (25.5 * 3.5 - 3.5 * 3.5)/(40.5 - 4.5));
    }
    private static void Solve10(){
        float pi = 3.141592654f, rad = 7.5f;
        System.out.println("Test Data:");
        System.out.println("Radius: " + rad);
        System.out.println("Expected Output: ");
        System.out.println("Perimeter is = " + (rad*2*pi));
        System.out.println("Area is = " + (rad*rad*pi));
        //System.out.printf("%.14f\n", (rad*2*pi));
        //System.out.printf("%.14f", (rad*rad*pi));
    }
}
