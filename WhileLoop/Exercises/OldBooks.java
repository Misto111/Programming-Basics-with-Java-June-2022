package WhileLoop.Exercises;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String searchedBook = scanner.nextLine();
        String book = scanner.nextLine();
        int bookCounter = 0;

        while (!book.equals("No More Books")){
            if (book.equals(searchedBook)){
                break;
            }
            bookCounter ++;

            book = scanner.nextLine();
        }

        if (book.equals("No More Books")){
            System.out.printf("The book you search is not here!\n" + "You checked %d books.", bookCounter);
         }else{
            System.out.printf("You checked %d books and found it.", bookCounter);

        }


    }

}
