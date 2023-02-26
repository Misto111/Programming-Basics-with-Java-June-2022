package WhileLoop.Lab;

import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        double amount = 0;

        while (!input.equals("NoMoreMoney")){
            double currentSum = Double.parseDouble(input);
            amount += currentSum;

            System.out.printf("Increase %.2f", currentSum );

        }

    }
}
