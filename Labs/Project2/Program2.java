/**
 * Gregory Mann
 * E01457245
 * COSC 211
 * Section: 0
 * Winter 2016
 * Lab 2
 *
 * This program simulates an airplane seat selection system
 */

import java.util.Scanner;

public class Program2 {
    //create vars
    char[][] seats = new char[7][4];
    static boolean forever = true;
    static Scanner keyboard = new Scanner(System.in);
    int i = 0;
    int counter;

    //main
    public static void main(String[] args){
        Program2 program = new Program2();
        program.setup();
        while(forever){
            program.menu();
            program.selectSeat(keyboard.next());
        }
    }

    //prints the seats to the terminal
    void displaySeats(){
        for (i=0; i < seats.length; i++){
            System.out.println((i+1)
                                + "  "
                                + seats[i][0]
                                + " "
                                + seats[i][1]
                                + "  "
                                + seats[i][2]
                                + " "
                                + seats[i][3]);
        }
    }

    //returns true if all the seats are full
    boolean full(){
        if (seats.length * seats[0].length == counter){
            System.out.println("Sorry all seats are occupied.");
            return true;
        } else {
            return false;
        }
    }

    //returns an int var equal to the letter value ('a' and 'A' == 0 )
    int getCol(char letter){
        if((int)letter < 97){
            return ((int)letter)-65;
        } else {
            return ((int)letter)-97;
        }
    }

    //returns an accurate chat to int value ('0' == 0)
    int getRow(char letter){
        return ((int)letter)-49;
    }

    //prints out a goodbye statment and exits the program
    void goodbye(){
        System.out.println("Thank you and have a nice day!");
        System.exit(0);
    }

    //prints out the menu for the program
    void menu(){
        System.out.println("Seat Select");
        displaySeats();
        System.out.println("press q to exit");
    }

    //takes the string input and assigns 'X' to the value of specified seat
    void selectSeat(String input){
        if((input.charAt(0) == 'q') || (input.charAt(0) == 'Q') || (full())){
            goodbye();
        } else if (seats[getRow(input.charAt(0))][getCol(input.charAt(1))] == 'X') {
            System.out.println("Sorry that seat is already taken please select another one");
        } else {
            seats[getRow(input.charAt(0))][getCol(input.charAt(1))] = 'X';
            counter++;
        }
    }

    //prints a welcome messege and creates the values of the array
    void setup(){
        System.out.println("Welcome to the seat selction system!");
        System.out.println("Plese select a seat. (example: 6A)");
        counter = 0;
        for(i=0; i < seats.length; i++){
            seats[i][0] = 'A';
            seats[i][1] = 'B';
            seats[i][2] = 'C';
            seats[i][3] = 'D';
        }
    }
}

/** Example output:
Welcome to the seat selction system!
Plese select a seat. (example: 6A)
Seat Select
1  A B  C D
2  A B  C D
3  A B  C D
4  A B  C D
5  A B  C D
6  A B  C D
7  A B  C D
press q to exit
1a
Seat Select
1  X B  C D
2  A B  C D
3  A B  C D
4  A B  C D
5  A B  C D
6  A B  C D
7  A B  C D
press q to exit
4c
Seat Select
1  X B  C D
2  A B  C D
3  A B  C D
4  A B  X D
5  A B  C D
6  A B  C D
7  A B  C D
press q to exit
4c
Sorry that seat is already taken please select another one
Seat Select
1  X B  C D
2  A B  C D
3  A B  C D
4  A B  X D
5  A B  C D
6  A B  C D
7  A B  C D
press q to exit
7a
Seat Select
1  X B  C D
2  A B  C D
3  A B  C D
4  A B  X D
5  A B  C D
6  A B  C D
7  X B  C D
press q to exit
q
Thank you and have a nice day!
 */
