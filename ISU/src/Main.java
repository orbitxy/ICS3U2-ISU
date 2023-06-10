/**
 * Victor Galut
 * 06/08/2023
 * ISU
 * This program will provide information to the user then quizzes them
 */
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Timer;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int menuSelect = 1;
        long elapsedTime, currentTime;
        boolean checkIfLearn = false, quizAccess;

        System.out.println(" ____      ____  ________  _____       ______    ___   ____    ____  ________  ");
        System.out.println("|_  _|    |_  _||_   __  ||_   _|    .' ___  | .'   `.|_   \\  /   _||_   __  | ");
        System.out.println("  \\ \\  ||  / /    | |_ \\_|  | |     / .'   \\_|/  .-.  \\ |   \\/   |    | |_ \\_| ");
        System.out.println("   \\ \\/  \\/ /     |  _| _   | |   _ | |       | |   | | | |\\  /| |    |  _| _  ");
        System.out.println("    \\  ||  /     _| |__/ | _| |__/ |\\ `.___.'\\\\  `-'  /_| |_\\/_| |_  _| |__/ | ");
        System.out.println("     \\/  \\/     |________||________| `.____ .' `.___.'|_____||_____||________| ");
        System.out.println("                                                                               ");

        currentTime = System.currentTimeMillis();

        // create a timer that displays welcome for 3 seconds before entering the program
        while(true){
            elapsedTime = (System.currentTimeMillis() - currentTime) / 1000;
            if(elapsedTime > 3){
                break;
            }
        }

        // display default menu
        do {
            System.out.println("****************************");
            System.out.println("* 1. Enter Program         *");
            System.out.println("* 2. Instructions          *");
            System.out.println("* 3. About Program         *");
            System.out.println("* 4. Exit                  *");
            System.out.println("****************************\n");

            System.out.print("What would you like to do? (Select number): ");
            menuSelect = input.nextInt();
            System.out.println("\n\n");

            if(menuSelect == 1){
                // display menu to learn or quiz
                do {

                    System.out.println("****************************");
                    System.out.println("* 1. Learn some stuff      *");
                    System.out.println("* 2. Quiz yourself         *");
                    System.out.println("* 3. Exit                  *");
                    System.out.println("****************************\n");

                    System.out.print("What would you like to do? (Select number): ");
                    menuSelect = input.nextInt();
                    System.out.println("\n\n");

                    if(menuSelect == 1){
                        // access the learning centre
                        do {
                            System.out.println("****************************");
                            System.out.println("* 1. Computer Memory       *");
                            System.out.println("* 2. Hard Disk             *");
                            System.out.println("* 3. CDs                   *");
                            System.out.println("* 4. BIOS                  *");
                            System.out.println("* 5. CD-Burners            *");
                            System.out.println("* 6. Exit                  *");
                            System.out.println("****************************\n");

                            System.out.print("What would you like to do? (Select number): ");
                            menuSelect = input.nextInt();
                            System.out.println("\n\n");

                            if(menuSelect == 1){
                                checkIfLearn = true; // checks if person learned something
                            } else if(menuSelect == 2){
                                checkIfLearn = true;
                            } else if(menuSelect == 3){
                                checkIfLearn = true;
                            } else if(menuSelect == 4){
                                checkIfLearn = true;
                            } else if(menuSelect == 5){
                                checkIfLearn = true;
                            }
                        } while(menuSelect != 6);
                        menuSelect = -1;

                    } else if(menuSelect == 2){
                        // access the quiz
                        do {
                            if(checkIfLearn == false){
                                do {
                                    System.out.println("Hey! I noticed that you haven't accessed the learning centre! Would you like to go back?");
                                    System.out.println("1. Yes, go back  ||  2. No, let me quiz myself");
                                    menuSelect = input.nextInt();

                                    if(menuSelect == 2){
                                        quizAccess = true;
                                    }

                                } while(menuSelect != 1);
                            }

                            if(checkIfLearn == false){
                                break;
                            }

                            menuSelect = input.nextInt();
                        } while(menuSelect != 1);
                    }
                } while(menuSelect != 3);
                menuSelect = -1;

            } else if(menuSelect == 2){
                // menu to learn how to use program
                do {

                } while(menuSelect != 1);

            } else if(menuSelect == 3){
                // menu about the program
                do {
                    System.out.println("Hi! Welcome to my computer hardware quiz! In this program, you'll be taught the basics of ");
                    System.out.println("computer hardware and then testing your knowledge! Before we get into it, let me introduce you to ");
                    System.out.println("our sponsor of today, NordVPN!\n");
                    System.out.println("NordVPN, the ultimate solution for online security and privacy.");
                    System.out.println("With over 5,000 servers in 60 countries, you can access region-locked content and browse ");
                    System.out.println("securely. Their military-grade encryption keeps your data safe, and it works on all major ");
                    System.out.println("platforms. Plus, with CyberSec, you're protected from malware and intrusive ads. Stay safe ");
                    System.out.println("online with NordVPN!\n");
                    System.out.println("I hope you enjoy my program!\n");
                    System.out.print("Select 1 to exit. ");
                    menuSelect = input.nextInt();
                    System.out.println("\n\n");
                } while(menuSelect != 1);
                menuSelect = -1;
            }
        } while(menuSelect != 4);
    }
}