package FirstStepsInCoding.Exercises;

import java.util.Scanner;

public class VacationBooksList {
    // за домашно
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPages = Integer.parseInt(scanner.nextLine());
        int pagesForHour = Integer.parseInt(scanner.nextLine());
        int daysForReadingBook = Integer.parseInt(scanner.nextLine());



        int allHoursForReadingBook =  numberOfPages / pagesForHour;
        int hourForDay = allHoursForReadingBook / daysForReadingBook;


        System.out.println(hourForDay);
    }

}
