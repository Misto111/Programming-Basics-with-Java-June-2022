package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + paint * 10 / 100.00) * 14.50;
        double thinnerPrice = thinner * 5;

        double totalPrice = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double workmen = totalPrice * 30 / 100 * hours;

        totalPrice = totalPrice + workmen;

        System.out.println(totalPrice);
    }

}
