package taskPackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            System.out.print("Enter the array length: ");
            var length = Integer.parseInt(scanner.nextLine());
            int[] array = new int[length];

            if(length == 0){
                System.out.println("The array must contains at least 1 element");
            } else {
                System.out.println("Enter the array element(s):");
                for (var i = 0; i < length; i++) {
                    System.out.print("Element №" + (i + 1) + ": ");
                    array[i] = Integer.parseInt(scanner.nextLine());
                }

                List<Integer> list = new ArrayList<>();
                var countElements = 0;
                for (var i = 0; i < length; i++) {
                    if (array[i] % 3 == 0) {
                        ++countElements;
                        list.add(array[i]);
                    }
                }
                if(list.isEmpty()){
                    System.out.println("The array contains " + countElements + " elements that are multiples of 3");
                } else System.out.println("List of element(s) multiples of 3:" + list);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
