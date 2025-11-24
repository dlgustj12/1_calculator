package calculator.exception;

public enum ErrorMessage {

    //1. 문자열이 null이거나 허용되지 않은 empty
    INPUT_NULL("input : NULL."),
    INPUT_EMPTY("input : Empty."),
    //2. 허용된 연산자가 아닌 경우
    NA_OPERATOR("operator : not allowed."),
    //3. 허용된 구분자가 아닌 경우
    NA_SPECTOR("spector : not allowed."),
    //4. 0으로 나눌 경우
    DIV_ZERO("divide : not allowed divided by zero");


    private final String massage;

    ErrorMessage(String message){
        this.massage = message;
    }

    public String getMassage(){
        return getMassage();
    }
}
