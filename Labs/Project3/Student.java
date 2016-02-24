//This class extends the Person class
public class Student extends Person{
    int test1;
    int test2;
    double average;
    char grade;

    //constructor
    public Student(){
        super();
        test1 = 0;
        test2 = 0;
        average = 0;
        grade = 'E';
    }

    //constructor
    public Student(String name, int id, int test1, int test2){
        super(name, id);
        this.test1 = test1;
        this.test2 = test2;
        compAverage();
        grade(average);
    }

    //computes the average of the two test scores
    private void compAverage(){
        average = ((double)test1 + test2) / 2;
        grade(average);
    }

    //compares the ids of the two objects
    public boolean equals(Student otherStudent) {
        if (getId()==otherStudent.getId()){
            return true;
        } else {
            return false;
        }
    }

    //returns the score of test one
    public int getTest1(){
        return test1;
    }

    //returns the score of test two
    public int getTest2(){
        return test2;
    }

    //returns teh average of the two the test scores
    public double getAverage(){
        return average;
    }

    //returns the letter grade based on the average of the two test scores
    public char getGrade(){
        return grade;
    }

    //assigns the correct letter grade to the student based on the average
    private void grade(double numberGrade){
        if (numberGrade>=90.0){
            grade = 'A';
        } else if (numberGrade>=80.0){
            grade = 'B';
        } else if (numberGrade>=70.0){
            grade = 'C';
        } else if (numberGrade>=60.0){
            grade = 'D';
        } else if (numberGrade>=60.0){
            grade = 'E';
        }
    }

    //allows the user to input the score of test one
    public void setTest1(int test1){
        this.test1 = test1;
        compAverage();
    }

    //allows the user to input the score of test two
    public void setTest2(int test2){
        this.test2 = test2;
        compAverage();
    }

    //returns a string consisting of the name Id test scores and the final letter grade
    public String toString(){
        return "Name: " + getName() + "ID: " + getId() + "Test1: " + test1 + "Test2: " + test2 + "Grade: " + grade;
    }
}
