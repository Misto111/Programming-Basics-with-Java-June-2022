package WhileLoop.Exercises;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int poorGradesLimit = Integer.parseInt(scanner.nextLine());
        int poorGradesCounter = 0;
        boolean isFailed = false;
        double allGradesSum=0;
        int gradeCounter = 0;
        String lastProblem = "";



        String input = scanner.nextLine();


        while (!input.equals("Enough")) {
            int grade = Integer.parseInt(scanner.nextLine());

            allGradesSum += grade;
            gradeCounter++;
            lastProblem = input;

            if (grade <= 4) {
                poorGradesCounter++;


            }

            if (poorGradesLimit == poorGradesCounter) {
                isFailed = true;
                break;

            }
            input = scanner.nextLine();
        }
        double avgScore = allGradesSum / gradeCounter;

            if (isFailed) {
                System.out.printf("You need a break, %d poor grades.", poorGradesLimit);

            } else {
                System.out.printf("Average score: %.2f\n" +
                        "Number of problems: %d\n" +
                        "Last problem: %s", avgScore, gradeCounter, lastProblem);

            }


        }


    }



