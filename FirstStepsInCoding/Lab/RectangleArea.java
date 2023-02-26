package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        // Изчислваме лицето на правоъгълника
        int area = a * b ;
        System.out.println(area);
    }
}
