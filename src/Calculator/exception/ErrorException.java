package calculator.exception;

public class ErrorException extends IllegalArgumentException{

    private static final String EP = "[ERROR]";

    private final ErrorMessage errorMessage;

    public ErrorException(ErrorMessage message){
        super(EP + message.getMassage());
        this.errorMessage = message;
    }
}
