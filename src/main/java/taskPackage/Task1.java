package taskPackage;

import java.util.Scanner;

public class Task1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter the integer number: ");
            var number = Integer.parseInt(scanner.nextLine());
            if (number > 7) {
                System.out.println("Привет");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Value must contain only integer number");
        }
    }
}