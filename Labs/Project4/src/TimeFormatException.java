//This is a basic Exception class
public class TimeFormatException extends Exception {

    public TimeFormatException(){
        super("Time Format Exception");
    }

    public TimeFormatException(String message){
        super(message);
    }
}
