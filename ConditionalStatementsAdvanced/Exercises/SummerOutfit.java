package ConditionalStatementsAdvanced.Exercises;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();
        String outfit = "";
        String shoes = "";

        if (10 <= degrees && degrees <= 18) {
            switch (time) {
                case "Morning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }

        } else if (18 < degrees && degrees <= 24) {
            switch (time) {
                case "Morning":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }

        } else {
            switch (time) {
                case "Morning":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;


            }

        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }

}
