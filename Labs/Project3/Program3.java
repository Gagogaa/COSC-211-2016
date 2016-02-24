/**
 * Gregory Mann
 * E01457245
 * COSC 211
 * Section: 0
 * Winter 2016
 * Lab 3
 * This class take an input of 5 students with corresponding names, ids, and test scores
 *
 */

import java.util.Scanner;
public class Program3 {
    //initialize variables
    String[] names = new String[5];
    int[] id = new int[5];
    int[] test1 = new int[5];
    int[] test2 = new int[5];
    static Student[] students;
    Scanner keyboard = new Scanner(System.in);
    int i, min_index;
    Student temp;

    //main
    public static void main(String[] args){
        Program3 program3 = new Program3();
        System.out.println("Enter the name id and test scores of each student.");
        program3.getKeyboardInputs();
        program3.createStudents();
        program3.divLine();
        program3.sort(students);
        program3.printStudents();
    }

    //creates the student objects for each index of Students
    void createStudents(){
        students = new Student[names.length];
        for(i=0;i<students.length;i++){
            students[i] = new Student();
            set(i);
        }
    }

    //A line used for easier reading of the output of the program
    void divLine(){
        System.out.println("------------------------------------------------");
    }

    //prompts and gets the input from the user
    void getKeyboardInputs(){
        for(i=0;i<5;i++){
            System.out.println("Student: " + (i+1));
            System.out.print("Name:");
            names[i]=keyboard.next();
            System.out.print("Id:");
            id[i]=keyboard.nextInt();
            System.out.print("Test1:");
            test1[i]=keyboard.nextInt();
            System.out.print("Test2:");
            test2[i]=keyboard.nextInt();
            System.out.println();
        }
    }

    //prints the students names ids test scores averages and the final letter grades
    void printStudents(){
        //TODO:
        for(i=0;i<students.length;i++){
            System.out.print("Name: ");
            System.out.print(students[i].getName());
            System.out.println();
            System.out.print("Id: ");
            System.out.print(students[i].getId());
            System.out.println();
            System.out.print("Test1: ");
            System.out.print(students[i].getTest1());
            System.out.println();
            System.out.print("Test2: ");
            System.out.print(students[i].getTest2());
            System.out.println();
            System.out.print("Average: ");
            System.out.print(students[i].getAverage());
            System.out.println();
            System.out.print("Grade: ");
            System.out.print(students[i].getGrade());
            System.out.println();
            System.out.println();
            divLine();
        }
    }

    //sets the values in the student objects to the corrisponding value of the
    //input methods
    void set(int index){
        students[index].setName(names[index]);
        students[index].setId(id[index]);
        students[index].setTest1(test1[index]);
        students[index].setTest2(test2[index]);
    }

    //sorts the student array from lowest grade to best grade based on average
    void sort(Student[] s){
        //TODO:
        for(int i=0;i<s.length-1;i++){
            min_index=i;
            for(int j=min_index+1;j<s.length;j++){
                if(s[j].getAverage()<s[min_index].getAverage()){
                    min_index=j;
                }
            }
            temp=s[min_index];
            s[min_index]=s[i];
            s[i]=temp;
        }
    }
}
//Output 
/*
Enter the name id and test scores of each student.
Student: 1
Name:aa
Id:1
Test1:98
Test2:97

Student: 2
Name:b
Id:2
Test1:86
Test2:85

Student: 3
Name:c
Id:3
Test1:77
Test2:76

Student: 4
Name:d
Id:4
Test1:42
Test2:45

Student: 5
Name:e
Id:5
Test1:69
Test2:67

------------------------------------------------
Name: d
Id: 4
Test1: 42
Test2: 45
Average: 43.5
Grade: E

------------------------------------------------
Name: e
Id: 5
Test1: 69
Test2: 67
Average: 68.0
Grade: D

------------------------------------------------
Name: c
Id: 3
Test1: 77
Test2: 76
Average: 76.5
Grade: C

------------------------------------------------
Name: b
Id: 2
Test1: 86
Test2: 85
Average: 85.5
Grade: B

------------------------------------------------
Name: aa
Id: 1
Test1: 98
Test2: 97
Average: 97.5
Grade: A

------------------------------------------------
PH-520-17:Project3 student$
*/
