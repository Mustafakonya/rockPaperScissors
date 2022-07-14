package game;

import java.util.Scanner;

public class rockPaperScissorsGame {

    public static void main(String[] args) {
        // rock > scissors
        // scissors > paper
        // paper > rock
        /*
            First of all, we are creating a Scanner in order to get a choice from the user.
            Then we define the scores of the user and the computer in our main function.
            In our while loop, we assign the selection, we received from the user to the variable, named as "choice".
            We receive the computer's move using the Math.random method.
            We generate a random number between 0 and 3 by saying Math.random()*3 to the computer.
            And we compare our choice with the choice of the computer and write the results.
            At the end we ask the user whether he wants to continue the game.
            Our loop is running from the beginning, even if it doesn't want it, it logs out.
	    */


        Scanner scan = new Scanner(System.in);

        int userPoint = 0;

        int computerPoint = 0;

        String answer = "YES";

        int choice;

        int count = 1;

        while (answer.equalsIgnoreCase("YES")) {

            if (count == 1) {

                System.out.println("================================================");

                System.out.println("Welcome to Rock-Paper-Scissors game :) ");

                System.out.println("================================================");

                System.out.println("1-Rock 2-Paper 3-Scissors");

                System.out.println("=====================");

            }

            System.out.println("Your choice : ");

            count = 0;

            choice = scan.nextInt();

            int computerMove = (int) (Math.random() * 3);

            if (choice == 1) {

                if (computerMove == 1) {

                    System.out.println("Computer's move is rock ===> Result : The game is draw");

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                } else if (computerMove == 2) {

                    System.out.println("Computer's move is paper ===> Result : You lose!");

                    computerPoint++;

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                } else {

                    System.out.println("Computer's move is scissors ===> Result : You win!");

                    userPoint++;

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                }

            } else if (choice == 2) {

                if (computerMove == 1) {

                    System.out.println("Computer's move is rock ===> Result : You win!");

                    userPoint++;

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                } else if (computerMove == 2) {

                    System.out.println("Computer's move is paper ===> Result : The game is draw");

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                } else {

                    System.out.println("Computer's move is scissors ===> Result : You lose!");

                    computerPoint++;

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                }

            } else if (choice == 3) {

                if (computerMove == 1) {

                    System.out.println("Computer's move is rock ===> Result : You lose!");

                    computerPoint++;

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                } else if (computerMove == 2) {

                    System.out.println("Computer's move is paper ===> Result : You win!");

                    userPoint++;

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                } else {

                    System.out.println("Computer's move is scissors ===> Result : The game is draw");

                    System.out.println("Your point : " + userPoint + " Computer's point : "

                            + computerPoint);

                }

            } else {

                System.out.println("Please type a valid move!");

                continue;

            }

            if (userPoint == 3) {

                System.out.println("You won. The score is " + userPoint + "-" + computerPoint);

                System.out.println("=================================================================");

                System.out.println("░░░░░░░░░░░░░░░░░░░░░░█████████\r\n"
                        + "░░███████░░░░░░░░░░███▒▒▒▒▒▒▒▒███\r\n"
                        + "░░█▒▒▒▒▒▒█░░░░░░░███▒▒▒▒▒▒▒▒▒▒▒▒▒███\r\n"
                        + "░░░█▒▒▒▒▒▒█░░░░██▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░░█▒▒▒▒▒█░░░██▒▒▒▒▒██▒▒▒▒▒▒██▒▒▒▒▒███\r\n"
                        + "░░░░░█▒▒▒█░░░█▒▒▒▒▒▒████▒▒▒▒████▒▒▒▒▒▒██\r\n"
                        + "░░░█████████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░░░█▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒██▒▒▒▒▒▒▒▒▒▒██▒▒▒▒██\r\n"
                        + "██▒▒▒███████████▒▒▒▒▒██▒▒▒▒▒▒▒▒██▒▒▒▒▒██\r\n"
                        + "█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒████████▒▒▒▒▒▒▒██\r\n"
                        + "██▒▒▒▒▒▒▒▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░█▒▒▒███████████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒██\r\n"
                        + "░██▒▒▒▒▒▒▒▒▒▒████▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
                        + "░░████████████░░░█████████████████");

                System.out.println("==============================================================");

                System.out.println("The game is over, do you want to continue the game : (YES / NO)");

                System.out.println("==============================================================");

                answer = scan.next();


                if (answer.equalsIgnoreCase("YES")) {

                    userPoint = 0;

                    computerPoint = 0;

                    count = 1;
                }
                else{
                    System.out.println("Good Bye!");
                }

            } else if (computerPoint == 3) {

                System.out.println("You lost the game. The score is " + computerPoint + "-" + userPoint);

                System.out.println("==================================================================");

                System.out.println("┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀██┼███▀▀▀███┼███▀█▄█▀███┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼█┼┼┼██┼██┼┼┼\r\n"
                        + "██┼┼┼▄▄▄┼██▄▄▄▄▄██┼██┼┼┼▀┼┼┼██┼██▀▀▀\r\n"
                        + "██┼┼┼┼██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██┼┼┼\r\n"
                        + "███▄▄▄██┼██┼┼┼┼┼██┼██┼┼┼┼┼┼┼██┼██▄▄▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "███▀▀▀███┼▀███┼┼██▀┼██▀▀▀┼██▀▀▀▀██▄┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼██┼┼██▀▀▀┼██▄▄▄▄▄▀▀┼\r\n"
                        + "██┼┼┼┼┼██┼┼┼██┼┼█▀┼┼██┼┼┼┼██┼┼┼┼┼██┼\r\n"
                        + "███▄▄▄███┼┼┼─▀█▀┼┼─┼██▄▄▄┼██┼┼┼┼┼██▄\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼██┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼████▄┼┼┼▄▄▄▄▄▄▄┼┼┼▄████┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼▀▀█▄█████████▄█▀▀┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████████████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██▀▀▀███▀▀▀██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼██┼┼┼███┼┼┼██┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼█████▀▄▀█████┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼███████████┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▄▄▄██┼┼█▀█▀█┼┼██▄▄▄┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼▀▀██┼┼┼┼┼┼┼┼┼┼┼██▀▀┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼▀▀┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼┼\r\n"
                        + "\r\n"
                        + "");

                System.out.println("==============================================================");

                System.out.println("The game is over, do you want to continue the game : (YES / NO)");

                System.out.println("==============================================================");

                answer = scan.next();

                if (answer.equalsIgnoreCase("YES")) {

                    userPoint = 0;

                    computerPoint = 0;

                    count = 1;

                }else{
                    System.out.println("Good Bye!");
                }

            }

        }

        scan.close();

    }

}
