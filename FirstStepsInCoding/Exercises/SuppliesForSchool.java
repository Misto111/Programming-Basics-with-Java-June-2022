package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int cleaner = Integer.parseInt(scanner.nextLine());
        int disc = Integer.parseInt(scanner.nextLine());

        double pensPrice = pens * 5.80;
        double markersPrice = markers * 7.20;
        double cleanerPrice = cleaner * 1.20;

        double total = pensPrice + markersPrice + cleanerPrice;
        double totalPriceAfterDisc = total - (total * disc / 100);

        System.out.println(totalPriceAfterDisc);


    }


}
