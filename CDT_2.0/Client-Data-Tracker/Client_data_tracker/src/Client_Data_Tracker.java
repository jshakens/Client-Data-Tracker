import java.util.Arrays;
import java.util.Scanner;

/**
 * Author- Jordan Shakespeare
 * Program tracks Client data.
 */

public class Client_Data_Tracker {
//Main method, user enters 1 2 3 or 4 depending on desired data to be tracked.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user = 0;
        System.out.println("Data Collection for John Doe");
        while (user != 1 && user != 2 && user !=3 && user !=4) {
            System.out.println("What data would you like to track?");
            System.out.println("\t1) Sleep Chart");
            System.out.println("\t2) Target behaviors behavior");
            System.out.println("\t3) Good behaviors");
            System.out.println("\t4) PRN Tracker");
            System.out.print("Choose a menu item: ");

            user = input.nextInt();
        }

        if (user == 1) {
            sleepChart();}
         else if(user == 2){
            targetBehaviors();}
        else if(user == 3){
                goodBehaviors();}
        else if(user== 4){
            PRN();}
    }
    //Method displays a sleep chart and user enters A for awake and S for sleeping.
    public static void sleepChart(){
    Scanner scanner = new Scanner(System.in);
        System.out.println("      [12am-1am][1-2am][2-3am][3-4am][4-5am][5-6am][6-7am][7-8am][8-10am][10-11am][11-12pm][12-1pm][1-2pm][2-3pm][3-4pm][4-5pm][5-6pm][6-7pm][7-8pm][8-9pm][9-10pm][10-11pm][11-12pm]");
        System.out.println("Sunday: ");
        System.out.println("Monday: ");
        System.out.println("Tuesday: ");
        System.out.println("Wednesday: ");
        System.out.println("Thursday: ");
        System.out.println("Friday: ");
        System.out.println("Saturday: ");
    String[][] sleep = new String[7][23];
        String Days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int r = 0; r < sleep.length; r++) {
            System.out.print("Enter sleep data for " + Days[r] + " (A = awake, S = asleep): ");
            for (int i = 0; i < 23; i++) {
                sleep[r][i] =  scanner.next();
            }
        }
        System.out.printf(Arrays.deepToString(sleep));
    }
    //Method tracks the number of target behaviors for each day of the week.
    public static void targetBehaviors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("       [Physical aggression][Angry Outbursts][Leaving supervision attempted][Leaving supervision actual][SOAR Restraint]");
        System.out.println("Sunday:____________________|________________|______________________________|___________________________|________________|");
        System.out.println("Monday:____________________|________________|______________________________|___________________________|________________|");
        System.out.println("Tuesday:___________________|________________|______________________________|___________________________|________________|");
        System.out.println("Wednesday:_________________|________________|______________________________|___________________________|________________|");
        System.out.println("Thursday:__________________|________________|______________________________|___________________________|________________|");
        System.out.println("Friday:____________________|________________|______________________________|___________________________|________________|");
        System.out.println("Saturday:__________________|________________|______________________________|___________________________|________________|");
        int[][]behaviors = new int[7][5];
        String Days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int r = 0; r < behaviors.length; r++) {
            System.out.print("Enter Numbers of target behaviors for " + Days[r] + "  ");
            for (int i = 0; i < 5; i++) {
                behaviors[r][i] = scanner.nextInt();
            }
        }
        System.out.printf(Arrays.deepToString(behaviors));

    }
    //Method tracks the number of positive behaviors completed each day
    public static void goodBehaviors(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("       [Completing Chore][Completing tasks independently][Going on an activity][Spontaneous behavior]");
        System.out.println("Sunday:__________________|_______________________________|_____________________|____________________|");
        System.out.println("Monday:__________________|_______________________________|_____________________|____________________|");
        System.out.println("Tuesday:_________________|_______________________________|_____________________|____________________|");
        System.out.println("Wednesday:_______________|_______________________________|_____________________|____________________|");
        System.out.println("Thursday:________________|_______________________________|_____________________|____________________|");
        System.out.println("Friday:__________________|_______________________________|_____________________|____________________|");
        System.out.println("Saturday:________________|_______________________________|_____________________|____________________|");
        int[][]behaviors = new int[7][4];
        String Days[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        for (int r = 0; r < behaviors.length; r++) {
            System.out.print("Enter Numbers of target behaviors for " + Days[r] + "  ");
            for (int i = 0; i < 4; i++) {
                behaviors[r][i] = scanner.nextInt();
            }
        }
        System.out.printf(Arrays.deepToString(behaviors));



    }
    //Method tracks if a PRN is offered.
    public static void PRN(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("PRN offered?");
        System.out.println("\tY=yes");
        System.out.println("\tN=No");
        String yesNo = scanner.nextLine();
        System.out.println(yesNo);
        if (yesNo.equals("Y")){
            System.out.println("What time was PRN offered & what was the result? ");
            String result = scanner.nextLine();
        }
        else;
    }



}

