package FirstStepsInCoding.Lab;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Прочитане вход
        double inches = Double.parseDouble(scanner.nextLine());
        // Преобразуване от инчиве в саниметри
        double centimetres = inches * 2.54;
        System.out.println(centimetres);
    }
}
