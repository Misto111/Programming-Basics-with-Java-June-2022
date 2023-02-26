package ConditionalStatements.Exercises;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCardsParts = Integer.parseInt(scanner.nextLine());
        int processorsParts = Integer.parseInt(scanner.nextLine());
        int ramParts = Integer.parseInt(scanner.nextLine());

        double videoCardsPrice = videoCardsParts * 250;
        double processorsPrice = (videoCardsPrice * 0.35) * processorsParts;
        double ramPrice = (videoCardsPrice * 0.1) * ramParts;
        double finalPrice = videoCardsPrice + processorsPrice + ramPrice;

        if (videoCardsParts > processorsParts){
            finalPrice = finalPrice - (finalPrice * 0.15);

        }
         if (budget >= finalPrice){
            double residue = budget - finalPrice;
            System.out.printf("You have %.2f leva left!", Math.abs(residue));

        } else  {
            double neededPrice = budget - finalPrice;
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(neededPrice));

        }

    }
}


