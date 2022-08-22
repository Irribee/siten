package exceptions;

public class TaskAlreadyException extends Exception{
    public TaskAlreadyException(String message) {
        super(message);
    }
}
