package ForLoop.Exercises;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int age = Integer.parseInt(scanner.nextLine());
        double washingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int brother = 0;
        int toys = 0;
        double moneyForBirthday = 0;

        for (int i = 1; i <= age ; i++) {

            if (i % 2 == 0){
            moneyForBirthday += 10 * i / 2;
            brother++;
            }else{
            toys++;

            }
    }
        double toysPrice = toys * toyPrice;
        double totalMoney = toysPrice + moneyForBirthday - brother;

        if (washingMachine <= totalMoney){
            System.out.printf("Yes! %.2f", totalMoney - washingMachine);
        }else {
            System.out.printf("No! %.2f", washingMachine - totalMoney);
        }
}
}
