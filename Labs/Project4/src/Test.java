/**
 * Gregory Mann
 * E01457245
 * COSC 211
 * Section: 0
 * Winter 2016
 * Lab 4
 * This Program converts 24-hour time format to 12-hour format
 *
 */
import java.util.*;
public class Test {
    public static final boolean FOREVER = true;
    static Scanner keyboard = new Scanner(System.in);
    int hours, mins;
    String time,ampm;

    public static void main(String[] args){
        keyboard.useDelimiter("\\&|:|\\r|\\n");
        Test test = new Test();
        while(FOREVER){
            System.out.println();
            test.menu();
            test.again();
        }
    }

    //Prompts the user to continue or exit the program
    void again(){
        System.out.println();
        System.out.println("Again? (y/n)");
        keyboard.nextLine();
        if((keyboard.next().equalsIgnoreCase("n"))){
            System.out.println("End of program");
            System.exit(0);
        }
    }

    //Grabs the imput form the keyboard Object and sets hours and mins values
    void input(){
        hours=keyboard.nextInt();
        mins=keyboard.nextInt();
    }

    //Is the main menu for the program it also handles the InputMismatchException
    void menu(){
        System.out.println("Enter time in 24-hour notation:");
        try{
            input();
            print12HourTime();
        }
        catch(InputMismatchException e){
            System.out.println("Sorry that is not a valid number");
        }
    }

    //Converts 24-hour time format to 12-hour format
    void print12HourTime(){
        try{
            if((hours>24) || (hours<0) || (mins>60) || (mins<0)){
                throw new TimeFormatException();
            }

            if(hours<13){
                ampm="AM";
            }else{
                hours= hours-12;
                ampm="PM";
            }

            System.out.println("That is the same as ");
            if(mins<10){
                System.out.println(hours + ":" + "0" + mins + " " + ampm);
            }else{
                System.out.println(hours + ":" + mins + " " + ampm);
            }

        }
        catch(TimeFormatException e){
            System.out.println(e.getMessage());
            if(mins<10){
                System.out.println("Sorry " + hours + ":" + "0" + mins + " is not a valid time" );
            }else{
                System.out.println("Sorry " + hours + ":" + mins + " is not a valid time" );
            }
        }
    }

}
/*
Enter time in 24-hour notation:
jnfs,jhfsd
Sorry that is not a valid number

Again? (y/n)
y

Enter time in 24-hour notation:
23:10
That is the same as
11:10 PM

Again? (y/n)
y

Enter time in 24-hour notation:
63:10
Time Format Exception
Sorry 63:10 is not a valid time

Again? (y/n)
y

Enter time in 24-hour notation:
10:63
Time Format Exception
Sorry 10:63 is not a valid time

Again? (y/n)
y

Enter time in 24-hour notation:
8:7
That is the same as
8:07 AM

Again? (y/n)
n
End of program
*/
