package ForLoop.Lab;

import java.util.Scanner;

public class CharacterSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        for(int i = 0; i<= name.length() -1; i++){
            char symbol = name.charAt(i);
            System.out.println(symbol);
        }
    }
}
