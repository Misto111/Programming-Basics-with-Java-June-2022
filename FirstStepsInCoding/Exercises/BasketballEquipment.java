package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double sneakers = annualFee - (annualFee * 0.40);
        double outfit = sneakers - (sneakers * 0.20);
        double ball = outfit * 0.25;
        double accessories = ball * 1 / 5;

        double allCosts = annualFee + sneakers + outfit + ball + accessories;

        System.out.println(allCosts);


     }

}
