package goldblatt_j_8_dostuffwithstrings;

/**
 *
 * @author root
 */
import java.util.Scanner;

public class Goldblatt_J_8_Dostuffwithstrings {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
//created new scanner

        System.out.println("_____________________________________________________________________________");
        System.out.println("Hi there! This program was created to perform actions based off of your name.");
        System.out.println("Type in your name below.");
        System.out.println("However, if you don't want to type your name, all letters are accepted.");
        String name = sc.nextLine();
//string is set to user input
        if (name.contains("bad word")) {
            System.out.println("Thats a bad word. Try again.");
            name = sc.nextLine();
        }
//bad word method

        if (name.startsWith("D") || name.startsWith("d")) {
            System.out.println("Hi person. Your name starts with D.");
//Startswith method
        }
//handles upper and lowercase
        if (name.contains("J") || name.contains("j")) {
            System.out.println(name.toLowerCase());
        }
//to lowercase method
        if (name.contains("Dr.")) {
            System.out.println("Hello! Congrats on the Doctorates");
        }
//contains method
        if (name.length() > 8) {
            System.out.println(name.trim());

        }
//length and trim method
        if (name.contains("-")) {
            name.split("-", 2);
        }
//split method (doesnt work)

        for (int zz = 0; zz < 50; zz++) {
            System.out.print(name + " ");
        }
//repeats your name a lot.
        System.out.println(" ");
        System.out.println("Thanks for playing? Would you like to take a survey?");
        System.out.println("Answer 'Yes' or 'No'");
        String answer = sc.nextLine();
        if (answer.contains("Yes") || answer.contains("yes")) {
            System.out.println("Did you like the game?");
            String answer2 = sc.nextLine();
            if (answer2.contains("Yes") || answer2.contains("yes")) {
                System.out.println("I'm glad you liked it.");
            } else {
                System.out.println("Aw, I hope that it wasn't that bad.");
            }
            System.out.println("Would you like me to draw a picture?");
            String answer3 = sc.nextLine();
            if (answer3.contains("Yes") || answer3.contains("yes")) {
                System.out.println("_____________________________¶¶___________________\n"
                        + "__________________________¶¶¶¶¶___________________\n"
                        + "_________________________¶¶¶¶¶¶¶__________________\n"
                        + "_______________________¶¶¶¶¶¶¶¶¶__________________\n"
                        + "_______________________¶¶¶¶¶¶¶¶¶¶_________________\n"
                        + "________________________¶¶¶¶¶¶¶¶¶¶________________\n"
                        + "________________________¶¶¶¶¶¶¶¶¶¶________________\n"
                        + "_____________________¶___¶¶¶¶¶¶¶¶¶¶_______________\n"
                        + "___________________¶¶¶___¶¶¶¶¶¶¶¶¶¶_______________\n"
                        + "__________________¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶______________\n"
                        + "________________¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶______________\n"
                        + "______________¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶_____________\n"
                        + "______________¶¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶____________\n"
                        + "_______________¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶____________\n"
                        + "________________¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶___________\n"
                        + "____________¶___¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶___________\n"
                        + "___________¶¶¶___¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶__________\n"
                        + "_________¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶__________\n"
                        + "_______¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶_________\n"
                        + "______¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶¶¶_________\n"
                        + "______¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶________\n"
                        + "_______¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶___¶¶¶¶¶¶¶¶¶¶_______\n"
                        + "__________________________________________________\n"
                        + "_________________¶¶_¶¶________¶¶__________________\n"
                        + "_________________¶¶_¶¶________¶¶__________________\n"
                        + "_________________¶¶___________¶¶__________________\n"
                        + "___¶¶¶¶¶¶___¶¶¶¶¶¶¶_¶¶___¶¶¶¶¶¶¶___¶¶¶¶¶¶¶__¶¶¶¶__\n"
                        + "__¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶_¶¶__¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶_¶¶¶¶¶¶_\n"
                        + "_¶¶¶__¶¶¶__¶¶___¶¶¶_¶¶__¶¶___¶¶¶_¶¶¶__¶¶¶¶_¶¶___¶¶\n"
                        + "¶¶¶____¶¶_¶¶_____¶¶_¶¶_¶¶_____¶¶_¶¶____¶¶¶_¶¶¶¶___\n"
                        + "¶¶_____¶¶_¶¶_____¶¶_¶¶_¶¶_____¶¶_¶¶_____¶¶_¶¶¶¶¶¶_\n"
                        + "¶¶¶____¶¶_¶¶_____¶¶_¶¶_¶¶_____¶¶_¶¶____¶¶¶____¶¶¶¶\n"
                        + "_¶¶¶__¶¶¶__¶¶___¶¶¶_¶¶__¶¶___¶¶¶_¶¶¶__¶¶¶¶_¶¶___¶¶\n"
                        + "_¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶_¶¶__¶¶¶¶¶¶¶¶__¶¶¶¶¶¶¶¶_¶¶¶¶¶¶¶\n"
                        + "__¶¶¶¶_¶¶____¶¶¶¶¶¶_¶¶___¶¶¶¶_¶¶___¶¶¶¶_¶¶__¶¶¶¶¶_");
            } else {
                System.out.println("K");
            }
            System.out.println("Would you like the computer to do math?");
            String answer4 = sc.nextLine();
            if (answer4.contains("Yes") || answer4.contains("yes")) {
                System.out.println("The computer will now perform f(x) = n^e");
                System.out.println("Type in the value for n.");
                int num = sc.nextInt();
                
                System.out.println("Now, type in the value for e.");
                int exponent = sc.nextInt();
                int Wow = (int) Math.pow(num, exponent);
                System.out.println("f(x) = " + Wow);
                System.out.println("Tada! It's " + num + " to the " + exponent + " power!");
            } else {
                System.out.println("Guess you're more of a fine arts person. Thats cool.");
            }
            System.out.println("To make sure you're not a robot, you will now complete a captcha.");
            System.out.println("Press the enter key to continue.");
            String adsf = sc.nextLine();
            

            System.out.println("|               |           ");
            System.out.println("|___     ___    |__         ");
            System.out.println("|   |   |___|   |  |  |  |  ");
            System.out.println("|___|   |____   |  |  |__|  ");
            System.out.println(" ");
            System.out.println("Please type the letters above.");
            String userc = sc.nextLine();
            boolean notRobot;
            if(userc.contains("behu")){
                notRobot = true;
            } else{
                notRobot = false;
            }
            //boolean is here.
            if(notRobot == true){
                System.out.println("You aren't a robot! Yay!");
                System.out.println("The survey is over now.");
            } else if(notRobot == false){
                System.out.println("ROBOT ALERT! BE GONE!");
                System.exit(0);
                
            }
        }
        System.out.println("Good bye!");
        //survey
    }

}


