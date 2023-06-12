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
        boolean checkIfLearn = false, newHighscore = false;

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
                    System.out.println("* 3. Back                  *");
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
                            System.out.println("* 6. Gaming                *");
                            System.out.println("* 7. Back                  *");
                            System.out.println("****************************\n");

                            System.out.print("What would you like to do? (Select number): ");
                            menuSelect = input.nextInt();
                            System.out.println("\n\n");

                            if(menuSelect == 1){
                                checkIfLearn = true; // checks if person learned something
                                do {
                                    System.out.println("Computer memory is known to be quick and accessible forms of storage. All storage types of ");
                                    System.out.println("the computer are placed in “tiers” for accessibility, the lowest being inexpensive and quantitative");
                                    System.out.println("memory and the highest being expensive and small amounts of memory. Higher amounts of ");
                                    System.out.println("storage can be desired, but typically, the faster the memory, the better.\n");
                                    System.out.println("The RAM (Random Access Memory) is the computer’s most commonly known temporary ");
                                    System.out.println("storage area where running applications are placed, as it is easy for the CPU to access their ");
                                    System.out.println("information. Typically, the speed of RAM is not fast enough to match the speed of the computer’s ");
                                    System.out.println("CPU, hence why the faster the RAM, the better.\n");
                                    System.out.println("Another form of computer memory is the hard drive, one of the lower tiers of computer memory. ");
                                    System.out.println("Despite the large amount of memory available when purchased, hard drives require some time");
                                    System.out.println("for the CPU to access information.\n");
                                    System.out.print("Enter 1 to go back. ");
                                    menuSelect = input.nextInt();
                                    System.out.println("\n\n");
                                } while(menuSelect != 1);
                                menuSelect = -1;

                            } else if(menuSelect == 2){
                                checkIfLearn = true;
                                do {
                                    System.out.println("Hard disks, or hard drives, are a form of computer memory that take on the physical form of ");
                                    System.out.println("using spinning platters and magnetic mediums. A major benefit of a hard disk is that the");
                                    System.out.println("magnetic medium allows for rewriting and removing information.\n");
                                    System.out.println("Inside a hard disk can be found a platter(s) and the arm. The platters usually spin at 3600 or ");
                                    System.out.println("7200 revolutions per minute, and are manufactured to have amazing tolerances. The arm ");
                                    System.out.println("contains the read and write heads and are extremely light and fast.\n");
                                    System.out.println("Data is stored on the surface of a platter, dividing into tracks and further dividing into sectors. ");
                                    System.out.println("One sector contains a fixed amount of data, like 256 or 512 bytes of data.\n");
                                    System.out.print("Enter 1 to go back. ");
                                    menuSelect = input.nextInt();
                                    System.out.println("\n\n");
                                } while(menuSelect != 1);
                                menuSelect = -1;

                            } else if(menuSelect == 3){
                                checkIfLearn = true;
                                do {
                                    System.out.println("CDs are another form of computer memory, known for distributing large amounts of information ");
                                    System.out.println("in a reliable package. \n");
                                    System.out.println("The materials found in a CD are polycarbonate plastic, aluminum and acrylic. The acrylic is");
                                    System.out.println("engraved with little bumps which are then covered by the aluminum and then plastic to protect it ");
                                    System.out.println("from scratches and damages.\n");
                                    System.out.println("Those little bumps store data. How? Every bump and non-bump perform like binary code; ones ");
                                    System.out.println("and zeros are represented by bumps and pits. A laser travels over the CD which detects if light ");
                                    System.out.println("is reflected back from a pit. \n");
                                    System.out.print("Enter 1 to go back. ");
                                    menuSelect = input.nextInt();
                                    System.out.println("\n\n");
                                } while(menuSelect != 1);
                                menuSelect = -1;

                            } else if(menuSelect == 4){
                                checkIfLearn = true;
                                do {
                                    System.out.println("The BIOS (Basic input/output system) is a form of flash memory. The purpose of the BIOS is to ");
                                    System.out.println("ensure that all the other chips, hard drives, ports and CPU are functioning altogether.\n");
                                    System.out.println("The most important role of the BIOS is to load the OS (Operating system). Since the ");
                                    System.out.println("microprocessor on the computer does not have instructions from the OS and it cannot obtain ");
                                    System.out.println("instructions from something if it doesn’t know how to obtain anything at all, the BIOS delivers the ");
                                    System.out.println("instructions itself.\n");
                                    System.out.println("The first thing the BIOS does when the user boots up the computer is to check the information ");
                                    System.out.println("on a CMOS (Complementary metal oxide semiconductor). The CMOS provides detailed ");
                                    System.out.println("information to the system and can be altered to the user’s liking. Some system changes include");
                                    System.out.println("changing the system clock, password and power management.\n");
                                    System.out.print("Enter 1 to go back. ");
                                    menuSelect = input.nextInt();
                                    System.out.println("\n\n");
                                } while(menuSelect != 1);
                                menuSelect = -1;

                            } else if(menuSelect == 5){
                                checkIfLearn = true;
                                do {
                                    System.out.println("CDs that are typically mass produced are known as read-only memory. The bumps and pits on ");
                                    System.out.println("a CD are created through a process using a high-powered laser to etch the bumps onto a glass ");
                                    System.out.println("plate, which is then pressed onto the acrylic material. \n");
                                    System.out.println("CD-Rs and CD-Burners were created to allow information to be constructed on a blank CD. This ");
                                    System.out.println("is done by replacing the “bump-pit” concept with a dye layer that functions just the same.\n");
                                    System.out.println("CD-Burners alter the dye layer by using a laser writer. The laser writer burns the dye layer to ");
                                    System.out.println("CD-Burners alter the dye layer by using a laser writer. The laser writer burns the dye layer to ");
                                    System.out.println("Unfortunately, the information on the CD-R cannot be removed, so it cannot be reused.\n");
                                    System.out.print("Enter 1 to go back. ");
                                    menuSelect = input.nextInt();
                                    System.out.println("\n\n");
                                } while(menuSelect != 1);
                                menuSelect = -1;

                            } else if(menuSelect == 6){
                                checkIfLearn = true;
                                do {
                                    System.out.println("Multiplayer FPS games have been on the market and on the rise in popularity for the past several ");
                                    System.out.println("years. Games like Call of Duty and Battlefield have been debuting games every year. New ");
                                    System.out.println("games like Valorant have already kicked many games off the charts.\n");
                                    System.out.println("Despite the amount of FPS games released, it does not mean they have been getting better. ");
                                    System.out.println("Redfall, Overwatch 2 and Call of Duty: MWII have been flopping. Lack of content, horrible ");
                                    System.out.println("graphics and money-taking schemes have caused player-bases to decrease. All due to the fact");
                                    System.out.println("that game-production companies rush their work to release as soon as possible.\n");
                                    System.out.println("All is not lost, as Counter-Strike 2, Payday 3 and GTA VI are expected to make debuts soon with ");
                                    System.out.println("many promises considering the time it took to make a sequel from its former. Will games like ");
                                    System.out.println("these finally show companies like Activision how it’s done?\n");
                                    System.out.print("Enter 1 to go back. ");
                                    menuSelect = input.nextInt();
                                    System.out.println("\n\n");
                                } while(menuSelect != 1);
                                menuSelect = -1;

                            }
                        } while(menuSelect != 7);
                        menuSelect = -1;

                    } else if(menuSelect == 2){
                        // access the quiz
                        do {
                            // did they access the learning centre? if not, provide a prompt
                            if(checkIfLearn == false){
                                do {
                                    System.out.println("Hey! I noticed that you haven't accessed the learning centre! Would you like to go back?");
                                    System.out.println("1. Yes, go back  ||  2. No, let me quiz myself");
                                    menuSelect = input.nextInt();

                                    if(menuSelect == 2){
                                        checkIfLearn = true;
                                        menuSelect = 1; // escape the do while loop
                                    }

                                } while(menuSelect != 1);
                                menuSelect = -1;
                            }

                            // break them out of the while loop to go back if they would like to go back, otherwise continue quiz
                            // will not check expression if user already learned "something"
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
                    System.out.println("Welcome to the tutorial!\n");
                    System.out.println("This program is very simple. First, try to learn all the content found in the learning centre.");
                    System.out.println("[Enter Program > Learn Something]\n");
                    System.out.println("Once you are finished, access the quiz to test your knowledge! The quiz will be multiple choice.");
                    System.out.println("[Enter Program > Quiz Yourself]\n");
                    System.out.print("Enter 1 to exit. ");
                    menuSelect = input.nextInt();
                    System.out.println("\n\n");
                } while(menuSelect != 1);
                menuSelect = -1;

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
                    System.out.print("Enter 1 to exit. ");
                    menuSelect = input.nextInt();
                    System.out.println("\n\n");
                } while(menuSelect != 1);
                menuSelect = -1;
            }
        } while(menuSelect != 4);
    }
}