package taskPackage;

import java.util.Objects;
import java.util.Scanner;

public class Task2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the firstname: ");
        var name = scanner.nextLine();
        if (Objects.equals(name, "Вячеслав")) {
            System.out.println("Привет, " + name);
        } else System.out.println("Нет такого имени");
    }
}
