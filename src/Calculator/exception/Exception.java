package calculator.exception;

public class Exception extends IllegalArgumentException{

    private static final String EP = "[ERROR]";

    private final ErrorMessage errorMessage;

    public Exception(ErrorMessage message){
        super(EP + message.getMassage());
        this.errorMessage = message;
    }
}
