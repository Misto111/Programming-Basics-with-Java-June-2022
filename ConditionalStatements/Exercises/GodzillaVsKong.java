package ConditionalStatements.Exercises;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double clothingPrice = Double.parseDouble(scanner.nextLine());

        double decor = budget * 0.10;
        double clothing = extras * clothingPrice;
        if (extras >= 150) {
            clothing = clothing - (clothing * 0.1);
        }

        if (budget < clothing + decor) {
            double lack = budget - (clothing + decor);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(lack));

        }

        else if (budget >= clothing + decor) {
                double residue = budget - (clothing + decor);
                System.out.println("Action!");
                System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(residue));
            }

        }
    }










