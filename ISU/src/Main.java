/**
 * Victor Galut
 * 06/08/2023
 * ISU
 * This program will provide information to the user then quizzes them
 */

// answer key: Q1: 2, Q2: 1, Q3: 1, Q4: 3, Q5: 2, Q6: 4, Q7: 1, Q8: 3, Q9: 2, Q10: 4, Q11: 2, Q12: 1
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // quiz variables
        int menuSelect = 1, numQuesCorrect, points = 0, ansCorrect, ansIncorr1, ansIncorr2, ansIncorr3, countdownNum, currHighscore = 0;
        boolean checkIfLearn = false;
        final int NUM_OF_QUESTIONS = 12;

        // guess the number variables
        int playerChoiceGTM, programChoice, timesGuessed;

        // blackjack variables
        int playerChoiceBJ, playerCardSum = 0, programCardSum = 0, futureProgramCardSum;
        boolean stand, overshot;

        // shop variables
        int chocolate = 0, sticker = 0, cards = 0, nerfGun = 0, bike = 0, aStick = 0;
        final int CHOCOLATE_PRICE = 10, STICKER_PRICE = 25, CARDS_PRICE = 50, NERF_GUN_PRICE = 100, BIKE_PRICE = 500, A_STICK_PRICE = 1000;

        // time variables
        long elapsedTime, currentTime;



        System.out.println(" ____      ____  ________  _____       ______    ___   ____    ____  ________  ");
        System.out.println("|_  _|    |_  _||_   __  ||_   _|    .' ___  | .'   `.|_   \\  /   _||_   __  | ");
        System.out.println("  \\ \\  ||  / /    | |_ \\_|  | |     / .'   \\_|/  .-.  \\ |   \\/   |    | |_ \\_| ");
        System.out.println("   \\ \\/  \\/ /     |  _| _   | |   _ | |       | |   | | | |\\  /| |    |  _| _  ");
        System.out.println("    \\  ||  /     _| |__/ | _| |__/ |\\ `.___.'\\\\  `-'  /_| |_\\/_| |_  _| |__/ | ");
        System.out.println("     \\/  \\/     |________||________| `.____ .' `.___.'|_____||_____||________| ");
        System.out.println("                                                                               ");

        currentTime = System.currentTimeMillis();

        // create a timer that displays welcome for 3 seconds before entering the program
        do {
            elapsedTime = (System.currentTimeMillis() - currentTime) / 1000;
        } while (elapsedTime <= 3);

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
                    System.out.println("* 3. Point Shop            *");
                    System.out.println("* 4. More Games            *");
                    System.out.println("* 5. Inventory             *");
                    System.out.println("* 6. Back                  *");
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
                                    System.out.println("********************************************************************************************\n");
                                    System.out.println("Hey! I noticed that you haven't accessed the learning centre! Would you like to go back?\n");
                                    System.out.println("1. Yes, go back  ||  2. No, let me quiz myself");
                                    System.out.print("Enter input here: ");
                                    do {
                                        menuSelect = input.nextInt();
                                        if (menuSelect < 1 || menuSelect > 2){
                                            System.out.print("Please enter a valid number: ");
                                        }
                                    } while(menuSelect < 1 || menuSelect > 2);

                                    if(menuSelect == 2){
                                        checkIfLearn = true;
                                        menuSelect = 1; // escape the do while loop
                                    }

                                } while(menuSelect != 1);
                            }

                            // break them out of the while loop to go back if they would like to go back, otherwise continue quiz
                            // will not check expression if user already learned "something"
                            if(checkIfLearn == false){
                                System.out.println("\n");
                                break;
                            }

                            // reset variables
                            numQuesCorrect = 0;

                            System.out.println("\n");

                            // Question 1
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n"); // show score at beginning of every question
                            System.out.println("Question 1: What type of RAM is typically desired?\n");
                            System.out.format("%-16s %-16s", "1. High Amounts", "3. RGB Lighting\n");
                            System.out.format("%-16s %-16s", "2. Fast", "4. Hard Drives\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 2; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! The desired type of RAM is fast RAM.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 2
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 2: What does the RAM do?\n");
                            System.out.format("%-40s %-23s", "1. Serves as a temporary storage area", "3. Turns on the monitor\n");
                            System.out.format("%-40s %-21s", "2. Accesses the BIOS", "4. Controls the CPU\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 1; // set correct answer here
                            ansIncorr1 = 2; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! The purpose of the RAM is to serve as a temporary storage area.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 3
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 3: What is a major benefit of using a hard disk?\n");
                            System.out.format("%-40s %-27s", "1. Rewriting and removing information", "3. Matches speed of the CPU\n");
                            System.out.format("%-40s %-34s", "2. Easy to clean", "4. Ability to be downloaded online\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 1; // set correct answer here
                            ansIncorr1 = 2; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! A major benefit of using a hard disk is the ability to rewrite and remove information on it.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 4
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 4: What is found inside of a hard disk?\n");
                            System.out.format("%-25s %-16s", "1. Hands and Arm", "3. Platters and Arm\n");
                            System.out.format("%-25s %-18s", "2. PCB and Transistors", "4. Lasers and Sensors\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 3; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 2; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! A platter(s) and an arm can be found inside of a hard disk.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 5
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 5: How is data represented in a CD?\n");
                            System.out.format("%-23s %-15s", "1. Colours and Paint", "3. Ink and Opacity\n");
                            System.out.format("%-23s %-18s", "2. Bumps and Pits", "4. Light and Darkness\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 2; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! Bumps and pits represent data in a CD as they represent ones and zeroes.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 6
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 6: What material in a CD is engraved with the little bumps?\n");
                            System.out.format("%-16s %-8s", "1. Plastic", "3. Label\n");
                            System.out.format("%-16s %-10s", "2. Aluminum", "4. Acrylic\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 4; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 2; ansIncorr3 = 3; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! Acrylic is the material that is engraved with little bumps in a CD.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 7
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 7: What is the most important role of the BIOS?\n");
                            System.out.format("%-21s %-14s", "1. Load the OS", "3. Check the CMOS\n");
                            System.out.format("%-21s %-23s", "2. Turn on the GPU", "4. Switch the system clock\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 1; // set correct answer here
                            ansIncorr1 = 2; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! The most important job of the BIOS is to load in the operating system.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 8
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 8: The BIOS checks on the _________ first on boot up.\n");
                            System.out.format("%-9s %-7s", "1. CPU", "3. CMOS\n");
                            System.out.format("%-9s %-6s", "2. CD", "4. CNC\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 3; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 2; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! The BIOS always checks on the CMOS first.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 9
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 9: How are bumps and pits created on a CD?\n");
                            System.out.format("%-47s %-36s", "1. Using a high-powered laser", "3. A CD does not have bumps and pits\n");
                            System.out.format("%-47s %-20s", "2. Engraved glass plate pressed onto acrylic", "4. Dye is sprayed on\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 2; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! Bumps and pits are formed when an already engraved glass plate is pressed onto acrylic material.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 10
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 10: How are CDs and CD-Rs different?\n");
                            System.out.format("%-33s %-29s", "1. CDs are not made of plastic", "3. CDs spin faster than CD-Rs\n");
                            System.out.format("%-33s %-27s", "2. CD-Rs have bumps and pits", "4. CD-Rs use a dye material\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 4; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 2; ansIncorr3 = 3; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! CD-Rs use a dye material compared to CDs which use bumps and pits.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 11
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 11: Why do some games lack in quality?\n");
                            System.out.format("%-31s %-31s", "1. Player-bases are children", "3. Companies fire their workers\n");
                            System.out.format("%-31s %-40s", "2. Companies rush their work", "4. Games are sold on the wrong platforms\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 2; // set correct answer here
                            ansIncorr1 = 1; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! Gaming companies tend to rush their work to publish a game as soon as possible.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // Question 12
                            System.out.println("***********************************************************************");
                            System.out.println("Current Score: " + points + "\n");
                            System.out.println("Question 12: What game is expected to do well on release?\n");
                            System.out.format("%-22s %-21s", "1. Counter-Strike 2", "3. Call of Duty: MWII\n");
                            System.out.format("%-22s %-19s", "2. Overwatch 2", "4. Battlefield 2042\n\n");
                            System.out.print("Enter your answer here: ");
                            ansCorrect = 1; // set correct answer here
                            ansIncorr1 = 2; ansIncorr2 = 3; ansIncorr3 = 4; // set incorrect answers here
                            do {
                                menuSelect = input.nextInt();

                                if (menuSelect == ansCorrect) { // is answer right? if so, increase score and output that they got it correct
                                    numQuesCorrect++;
                                    points += 10;
                                    System.out.println("Correct!\n");
                                } else if (menuSelect == ansIncorr1 || menuSelect == ansIncorr2 || menuSelect == ansIncorr3) { // is answer wrong? if so, output they are wrong and display correct answer
                                    System.out.println("Incorrect! Counter-Strike 2, yet to be released, has high hopes amongst fans.\n");
                                } else {
                                    System.out.print("Please input a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 4);
                            menuSelect = -1;

                            // countdown to reveal highscore OR show perfect score
                            countdownNum = 3;
                            currentTime = System.currentTimeMillis();
                            if(numQuesCorrect > currHighscore) {
                                do {
                                    elapsedTime = (System.currentTimeMillis() - currentTime) / 1000;
                                    if (elapsedTime == 1) {
                                        System.out.println(countdownNum);
                                        countdownNum--;
                                        currentTime = System.currentTimeMillis();
                                    }
                                } while (countdownNum > -1);

                                currHighscore = numQuesCorrect; // ensure we have a new highscore saved so the next person can try to take over highscore
                                System.out.println(" ____  _____  ________  ____      ____   ____  ____  _____   ______  ____  ____   ______     ______    ___   _______     ________  ");
                                System.out.println("|_   \\|_   _||_   __  ||_  _|    |_  _| |_   ||   _||_   _|.' ___  ||_   ||   _|.' ____ \\  .' ___  | .'   `.|_   __ \\   |_   __  | ");
                                System.out.println("  |   \\ | |    | |_ \\_|  \\ \\  /\\  / /     | |__| |    | | / .'   \\_|  | |__| |  | (___ \\_|/ .'   \\_|/  .-.  \\ | |__) |    | |_ \\_| ");
                                System.out.println("  | |\\ \\| |    |  _| _    \\ \\/  \\/ /      |  __  |    | | | |   ____  |  __  |   _.____`. | |       | |   | | |  __ /     |  _| _  ");
                                System.out.println(" _| |_\\   |_  _| |__/ |    \\  /\\  /      _| |  | |_  _| |_\\ `.___]  |_| |  | |_ | \\____) |\\ `.___.'\\\\  `-'  /_| |  \\ \\_  _| |__/ | ");
                                System.out.println("|_____|\\____||________|     \\/  \\/      |____||____||_____|`._____.'|____||____| \\______.' `.____ .' `.___.'|____| |___||________| \n");

                                // if player got a perfect score, reward them with a trophy
                                if(numQuesCorrect == NUM_OF_QUESTIONS){
                                    System.out.println("  ___________");
                                    System.out.println(" '._==_==_=_.'");
                                    System.out.println(" .-\\:      /-.");
                                    System.out.println("| (|:.     |) |");
                                    System.out.println(" '-|:.  1  |-'");
                                    System.out.println("   \\::.    /");
                                    System.out.println("    '::. .'");
                                    System.out.println("      ) (");
                                    System.out.println("    _.' '._");
                                    System.out.println("   `\"\"\"\"\"\"\"`");
                                    System.out.println("Congratulations on a perfect score!\n");
                                }
                            }

                            System.out.println("Your score is: " + points + "!");
                            System.out.println("You got " + numQuesCorrect + "/" + NUM_OF_QUESTIONS + "!\n");
                            System.out.println("Would you like to test your knowledge again?");
                            System.out.println("1. No thank you, go back  ||  2. Yes, please!\n");
                            System.out.print("Enter your input here: ");

                            // if they do not enter a 1 or 2, continuing prompting them.
                            do {
                                menuSelect = input.nextInt();
                                if(menuSelect < 1 || menuSelect > 2){
                                    System.out.print("Please enter a valid number: ");
                                }
                            } while(menuSelect < 1 || menuSelect > 2);
                            System.out.println("\n\n");

                        } while(menuSelect != 1);
                        menuSelect = -1;

                    } else if (menuSelect == 3){
                        // point shop
                        System.out.println("*************************************************************************************************");
                        System.out.println("Welcome to the point shop! Feel free to purchase anything! (If you have the points to do so...)\n");
                        System.out.format("%-14s %-12s %-5s", "Item Select", "Item", "Price\n");
                        System.out.format("%-14s %-12s %-2s", "1", "Chocolate", "10\n");
                        System.out.format("%-14s %-12s %-2s", "2", "Sticker", "25\n");
                        System.out.format("%-14s %-12s %-2s", "3", "Cards", "50\n");
                        System.out.format("%-14s %-12s %-3s", "4", "Nerf Gun", "100\n");
                        System.out.format("%-14s %-12s %-3s", "5", "Bike", "500\n");
                        System.out.format("%-14s %-12s %-4s", "6", "A stick", "1000\n\n");
                        System.out.println("You have " + points + " points to spend!");

                        do {
                            System.out.print("What would you like to purchase? (Enter 7 to exit): ");
                            menuSelect = input.nextInt();
                            if(menuSelect == 1){
                                if(points >= CHOCOLATE_PRICE){
                                    points = points - CHOCOLATE_PRICE;
                                    chocolate++;
                                    System.out.println(" ");
                                    System.out.println("Successful purchase!");
                                    System.out.println("You now have " + points + " points remaining!\n");
                                } else {
                                    System.out.println(" ");
                                    System.out.println("Insufficient points!\n");
                                }
                            } else if(menuSelect == 2){
                                if(points >= STICKER_PRICE){
                                    points = points - STICKER_PRICE;
                                    sticker++;
                                    System.out.println(" ");
                                    System.out.println("Successful purchase!");
                                    System.out.println("You now have " + points + " points remaining!\n");
                                } else {
                                    System.out.println(" ");
                                    System.out.println("Insufficient points!\n");
                                }
                            } else if(menuSelect == 3){
                                if(points >= CARDS_PRICE){
                                    points = points - CARDS_PRICE;
                                    cards++;
                                    System.out.println(" ");
                                    System.out.println("Successful purchase!");
                                    System.out.println("You now have " + points + " points remaining!\n");
                                } else {
                                    System.out.println(" ");
                                    System.out.println("Insufficient points!\n");
                                }
                            } else if(menuSelect == 4){
                                if(points >= NERF_GUN_PRICE){
                                    points = points - NERF_GUN_PRICE;
                                    nerfGun++;
                                    System.out.println(" ");
                                    System.out.println("Successful purchase!");
                                    System.out.println("You now have " + points + " points remaining!\n");
                                } else {
                                    System.out.println(" ");
                                    System.out.println("Insufficient points!\n");
                                }
                            } else if(menuSelect == 5){
                                if(points >= BIKE_PRICE){
                                    points = points - BIKE_PRICE;
                                    bike++;
                                    System.out.println(" ");
                                    System.out.println("Successful purchase!");
                                    System.out.println("You now have " + points + " points remaining!\n");
                                } else {
                                    System.out.println(" ");
                                    System.out.println("Insufficient points!\n");
                                }
                            } else if(menuSelect == 6){
                                if(points >= A_STICK_PRICE){
                                    points = points - A_STICK_PRICE;
                                    aStick++;
                                    System.out.println(" ");
                                    System.out.println("Successful purchase!");
                                    System.out.println("You now have " + points + " points remaining!\n");
                                    System.out.println("FYI: I think you've been playing too long.\n");
                                } else {
                                    System.out.println(" ");
                                    System.out.println("Insufficient points!\n");
                                }
                            }
                        } while (menuSelect != 7);
                        menuSelect = -1;

                        System.out.println("\n\n");

                    } else if(menuSelect == 4){
                        // more games menu
                        do{
                            System.out.println("************************************");
                            System.out.println("* 1. Guess my number!              *");
                            System.out.println("* 2. Blackjack                     *");
                            System.out.println("* 3. Back                          *");
                            System.out.println("************************************\n");

                            System.out.print("What would you like to do? (Select number): ");
                            menuSelect = input.nextInt();
                            System.out.println("\n\n");
                            if (menuSelect == 1) {
                                do {
                                    // play guess the number
                                    System.out.println("***************************************************************************************");
                                    System.out.println("How to play: The computer picks a number between 1-20. The user must guess its number ");
                                    System.out.println("in 5 tries. Hints will be provided each time.");
                                    System.out.println("WIN: Points are doubled. LOSE: Points cut in half.\n");
                                    System.out.println("1. Go back || 2. Let's play!");
                                    System.out.print("Enter your input here: ");
                                    do {
                                        menuSelect = input.nextInt();
                                        if (menuSelect < 1 || menuSelect > 2) {
                                            System.out.print("Please enter a valid number: ");
                                        }
                                    } while (menuSelect < 1 || menuSelect > 2);
                                    if (menuSelect == 1) {
                                        System.out.println("\n");
                                        break; // get out of while loop
                                    }

                                    System.out.println("\n\n");

                                    programChoice = (int) ((20 - 1 + 1) * Math.random() + 1); // randomize number
                                    timesGuessed = 5; // reset times guessed

                                    do {
                                        System.out.println("***************************************************************************************");
                                        System.out.println("Guesses remaining: " + timesGuessed);
                                        System.out.print("Enter your number: ");
                                        playerChoiceGTM = input.nextInt();

                                        if (playerChoiceGTM > programChoice) {
                                            System.out.println("Too high!\n");
                                            timesGuessed--;
                                        } else if (playerChoiceGTM < programChoice) {
                                            System.out.println("Too low!\n");
                                            timesGuessed--;
                                        } else {
                                            System.out.println("You got it!");
                                            points *= 2;
                                        }

                                        if (timesGuessed == 0) {
                                            System.out.println("You're out of guesses!");
                                            points /= 2;
                                            break;
                                        }
                                    } while (playerChoiceGTM != programChoice);

                                    System.out.println("\n");
                                    System.out.println("***************************************************************************************");
                                    System.out.println("The number was " + programChoice + "!");
                                    System.out.println("You have " + points + " points!\n");

                                    System.out.println("Would you like to play again?");
                                    System.out.println("1. No || 2. Yes");
                                    System.out.print("Enter your input here: ");
                                    do {
                                        menuSelect = input.nextInt();
                                        if (menuSelect < 1 || menuSelect > 2) {
                                            System.out.print("Please enter a valid number: ");
                                        }
                                    } while (menuSelect < 1 || menuSelect > 2);

                                    System.out.println("\n");
                                } while (menuSelect != 1);
                                menuSelect = -1;

                            } else if (menuSelect == 2){
                                do {
                                    // play blackjack
                                    System.out.println("***************************************************************************************");
                                    System.out.println("How to play: The user has two options, to HIT or STAND. The hit action gives a card");
                                    System.out.println("between 1-10. The stand option means to decline any further given cards. The user must");
                                    System.out.println("try to reach a sum of 21, or have a higher sum than the program after the stand action.");
                                    System.out.println("WIN: Points are doubled. LOSE: Points cut in half.\n");
                                    System.out.println("1. Go back || 2. Let's play!");
                                    System.out.print("Enter your input here: ");
                                    do {
                                        menuSelect = input.nextInt();
                                        if (menuSelect < 1 || menuSelect > 2) {
                                            System.out.print("Please enter a valid number: ");
                                        }
                                    } while (menuSelect < 1 || menuSelect > 2);
                                    if (menuSelect == 1) {
                                        System.out.println("\n");
                                        break; // get out of while loop
                                    }

                                    // grab two random variables and sum them to find card sum for player at the beginning
                                    playerCardSum = (int)((10 - 1 + 1) * Math.random() + 1);
                                    playerCardSum += (int)((10 - 1 + 1) * Math.random() + 1);

                                    // grab two random variables and sum them to find card sum for program at the beginning
                                    programCardSum = (int)((10 - 1 + 1) * Math.random() + 1);
                                    programCardSum += (int)((10 - 1 + 1) * Math.random() + 1);

                                    // reset variables
                                    overshot = false;
                                    stand = false;

                                    System.out.println("\n\n");

                                    do {
                                        System.out.println("***************************************************************************************");
                                        System.out.println("Your cards total up to " + playerCardSum + ".");
                                        System.out.println("Would you like to hit or stand?");
                                        System.out.println("1. HIT || 2. STAND");
                                        System.out.print("Enter your input here: ");
                                        playerChoiceBJ = input.nextInt();

                                        if(playerChoiceBJ < 1 || playerChoiceBJ > 2) {
                                            do {
                                                System.out.print("Please input a valid number: ");
                                                playerChoiceBJ = input.nextInt();
                                            } while (playerChoiceBJ < 1 || playerChoiceBJ > 2);
                                        }

                                        if(playerChoiceBJ == 1){
                                            // if player wants to hit
                                            playerCardSum += (int)((10 - 1 + 1) * Math.random() + 1);
                                            System.out.println("You have chosen to hit.");
                                        } else {
                                            // if player wants to stand
                                            stand = true;
                                            System.out.println("You have chosen to stand.");
                                        }

                                        futureProgramCardSum = (int)((10 - 1 + 1) * Math.random() + 1);

                                        // prevent dealer from overshooting, guarantees he never loses by overshooting (almost a cheat...)
                                        if(programCardSum + futureProgramCardSum < 21){
                                            programCardSum += futureProgramCardSum;
                                        }

                                        // did player overshoot? if so, end game (tell them after the game for consistency reasons)
                                        if(playerCardSum > 21){
                                            overshot = true;
                                            break;
                                        }

                                        // did player hit 21? if so, end game (won't allow this expression in the while expression, so making separate break
                                        // theoretically, player did not overshoot so he did the "stand" action
                                        if(playerCardSum == 21){
                                            stand = true;
                                            break;
                                        }

                                        System.out.println("\n\n");

                                    } while(playerChoiceBJ != 2);

                                    System.out.println("***************************************************************************************");
                                    // did he stand? do this
                                    if(stand == true){
                                        if(playerCardSum > programCardSum) {
                                            System.out.println("You win!");
                                            points *= 2;
                                        }else if(playerCardSum == programCardSum){
                                            System.out.println("A tie! No points gained.");
                                        } else {
                                            System.out.println("Unfortunately, the dealer had a higher sum.");
                                            points /= 2;
                                        }
                                    }

                                    // did he hit over 21? do this
                                    if(overshot == true){
                                        System.out.println("You got higher than 21, so you lost.");
                                        points /= 2;
                                    }

                                    // tell user how much they and dealer had
                                    System.out.println("You had a sum of " + playerCardSum + " while the dealer had " + programCardSum + ".\n");

                                    System.out.println("You have " + points + " points!\n");
                                    System.out.println("Would you like to play again?");
                                    System.out.println("1. No || 2. Yes");
                                    System.out.print("Enter your input here: ");
                                    do {
                                        menuSelect = input.nextInt();
                                        if (menuSelect < 1 || menuSelect > 2) {
                                            System.out.print("Please enter a valid number: ");
                                        }
                                    } while (menuSelect < 1 || menuSelect > 2);

                                    System.out.println("\n");

                                } while(menuSelect != 1);
                                menuSelect = -1;
                            }

                        } while(menuSelect != 3);
                        menuSelect = -1;

                    } else if(menuSelect == 5){
                        // inventory menu
                        System.out.println("***************************************************************************************");
                        System.out.println("Welcome to your inventory! Check out how much cool stuff you have!");
                        System.out.println("Input an item's number to inspect it up close.\n");
                        System.out.format("%-15s %-7s %-6s", "Item", "Item Name", "Amount\n");
                        System.out.format("%-1s %-15s %-1s %-1s", "1", "Chocolate(s)", chocolate, "\n");
                        System.out.format("%-1s %-15s %-1s %-1s", "2", "Sticker(s)", sticker, "\n");
                        System.out.format("%-1s %-15s %-1s %-1s", "3", "Cards", cards, "\n");
                        System.out.format("%-1s %-15s %-1s %-1s", "4", "Nerf Gun(s)", nerfGun, "\n");
                        System.out.format("%-1s %-15s %-1s %-1s", "5", "Bike(s)", bike, "\n");
                        System.out.format("%-1s %-15s %-1s %-1s", "6", "Stick(s)", aStick, "\n\n");

                        do {
                            System.out.print("Enter input here (7 to go back): ");
                            menuSelect = input.nextInt();

                            if(menuSelect == 1){
                                System.out.println("    __________________,.............,");
                                System.out.println("   /_/_/_/_/_/_/_/_/,-',  ,. -,-,--/|");
                                System.out.println("  /_/_/_/_/_/_/_/,-' //  /-| / /--/ /");
                                System.out.println(" /_/_/_/_/_/_/,-' `-''--'  `' '--/ /");
                                System.out.println("/_/_/_/_/_/_,:................../ /");
                                System.out.println("|________,'                   hh|/");
                                System.out.println("         \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"'\n");

                                do {
                                    System.out.print("Enter 1 to go back: ");
                                    menuSelect = input.nextInt();
                                } while(menuSelect != 1);

                            } else if(menuSelect == 2){
                                System.out.println("_______________________________");
                                System.out.println("| _._     _,-'\"\"`-._        |");
                                System.out.println("|(,-.`._,'(       |\\`-/|     |");
                                System.out.println("|    `-.-' \\ )-`( , o o)     |");
                                System.out.println("|          `-    \\`_`\"'-    |");
                                System.out.println("\\_____________________________/");

                                do{
                                    System.out.print("Enter 1 to go back: ");
                                    menuSelect = input.nextInt();
                                } while(menuSelect != 1);

                            } else if(menuSelect == 3){
                                System.out.println("          _____");
                                System.out.println("         |A .  | _____");
                                System.out.println("         | /.\\ ||A ^  | _____");
                                System.out.println("         |(_._)|| / \\ ||A _  | _____");
                                System.out.println("         |  |  || \\ / || ( ) ||A_ _ |");
                                System.out.println("         |____V||  .  ||(_'_)||( v )|");
                                System.out.println("                |____V||  |  || \\ / |");
                                System.out.println("                       |____V||  .  |");
                                System.out.println("                              |____V|");

                                do{
                                    System.out.print("Enter 1 to go back: ");
                                    menuSelect = input.nextInt();
                                } while(menuSelect != 1);

                            } else if(menuSelect == 4){
                                System.out.println("      __,_____");
                                System.out.println("     / __.==--\"");
                                System.out.println("    /#(-'");
                                System.out.println("    `-'");

                                do{
                                    System.out.print("Enter 1 to go back: ");
                                    menuSelect = input.nextInt();
                                } while(menuSelect != 1);

                            } else if(menuSelect == 5){
                                System.out.println("                                          $\"   *.      ");
                                System.out.println("              d$$$$$$$P\"                  $    J");
                                System.out.println("                  ^$.                     4r  \"");
                                System.out.println("                  d\"b                    .db");
                                System.out.println("                 P   $                  e\" $");
                                System.out.println("        ..ec.. .\"     *.              zP   $.zec..");
                                System.out.println("    .^        3*b.     *.           .P\" .@\"4F      \"4");
                                System.out.println("  .\"         d\"  ^b.    *c        .$\"  d\"   $         %");
                                System.out.println(" /          P      $.    \"c      d\"   @     3r         3");
                                System.out.println("4        .eE........$r===e$$$$eeP    J       *..        b");
                                System.out.println("$       $$$$$       $   4$$$$$$$     F       d$$$.      4");
                                System.out.println("$       $$$$$       $   4$$$$$$$     L       *$$$\"      4");
                                System.out.println("4         \"      \"\"3P ===$$$$$$\"     3                  P");
                                System.out.println(" *                 $       \"\"\"        b                J");
                                System.out.println("  \".             .P                    %.             @");
                                System.out.println("    %.         z*\"                      ^%.        .r\"");
                                System.out.println("       \"*==*\"\"                             ^\"*==*\"\"   ");

                                do{
                                    System.out.print("Enter 1 to go back: ");
                                    menuSelect = input.nextInt();
                                } while(menuSelect != 1);

                            } else if(menuSelect == 6){
                                System.out.println("                        ████");
                                System.out.println("                      ██  ██");
                                System.out.println("                    ██  ██  ");
                                System.out.println("                  ██  ██    ");
                                System.out.println("                ██  ██      ");
                                System.out.println("              ██  ██        ");
                                System.out.println("            ██  ██          ");
                                System.out.println("          ██  ██            ");
                                System.out.println("        ██  ██              ");
                                System.out.println("      ██  ██                ");
                                System.out.println("    ██  ██                  ");
                                System.out.println("  ██  ██                    ");
                                System.out.println("██  ██                      ");
                                System.out.println("████                        ");

                                do{
                                    System.out.print("Enter 1 to go back: ");
                                    menuSelect = input.nextInt();
                                } while(menuSelect != 1);
                            }

                        } while(menuSelect != 7);
                        menuSelect = -1;

                        System.out.println("\n\n");
                    }

                } while(menuSelect != 6);
                menuSelect = -1;

            } else if(menuSelect == 2){
                // menu to learn how to use program
                do {
                    System.out.println("Welcome to the tutorial!\n");
                    System.out.println("This program is very simple. First, try to learn all the content found in the learning centre.");
                    System.out.println("[Enter Program > Learn Something]\n");
                    System.out.println("Once you are finished, access the quiz to test your knowledge! The quiz will be multiple choice.");
                    System.out.println("There will be 12 questions, and every right gives you 10 points, but every wrong removes 5.");
                    System.out.println("[Enter Program > Quiz Yourself]\n");
                    System.out.println("With the points you won, you can purchase items in the point shop!");
                    System.out.println("[Enter Program > Point Shop]\n");
                    System.out.println("If you want to earn points a quicker way, try some of the games!");
                    System.out.println("Instructions will be provided before every game.\n");
                    System.out.println("[Enter Program > More Games]\n");
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