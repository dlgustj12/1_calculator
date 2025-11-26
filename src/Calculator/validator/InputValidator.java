package calculator.validator;

import calculator.exception.ErrorException;
import calculator.exception.ErrorMessage;

//데이터 유효성 검증
public class InputValidator {

    public static void validateAll(String input){
        checkNull(input);
        checkEmpty(input);
        checkOnlyOneOperator(input);
        
    }

    // 1. 문자열이 null 경우 
    private static void checkNull(String input){
        if(input == null){
            throw new ErrorException(ErrorMessage.INPUT_NULL);
        }
    }
    // 2. 허용되지 않은 Empty 인경우
    private static void checkEmpty(String input){
        if(input.trim().isEmpty()){
            throw new ErrorException(ErrorMessage.INPUT_EMPTY);
        }
    }

    //3. 마지막 문자가 사칙연산 기호가 아닌 경우
    private static void checkOnlyOneOperator(String input){
        String lastChar = input.substring(input.length() - 1);

        checkOperator(lastChar);
    }
    private static void checkOperator(String input){

        boolean isOperator = input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
        if(!isOperator){
            throw new ErrorException(ErrorMessage.NA_OPERATOR);
        }
    }

    //4. 0으로 나누는 경우
    public static void checkDivByZero(double num){
        if(num == 0.0){
            throw new IllegalArgumentException("error : can't divide by 0");
        }
    }

    //어떻게 쓰지... (,),(:) 이외의 구분자를 입력받았을 경우
    public static void checkSeparator(char ch){
        boolean flag = ch == ',' || ch == ':';
        if(!flag){
            throw new IllegalArgumentException("error : Allowed Separators are only (,),(:)");
        }
    }
}
