package calculator.validator;

import calculator.exception.ErrorException;
import calculator.exception.ErrorMessage;

//데이터 유효성 검증
public class InputValidator {

    public static void validateAll(String input){
        checkNull(input);
        checkEmpty(input);
        checkOnlyOneOperator(input);
        checkSeparator(input);
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
            throw new ErrorException(ErrorMessage.DIV_ZERO);
        }
    }

    //어떻게 쓰지... (,),(:) 이외의 구분자를 입력받았을 경우
    public static void checkSeparator(String input){
        String numPartWithSeparators = input.substring(0, input.length() - 1).trim();
        if (numPartWithSeparators.matches(".*[^0-9,:].*")) {
            // 허용되지 않은 문자(예: 세미콜론 ';', 문자 'a' 등)가 발견되면 예외 발생
            throw new ErrorException(ErrorMessage.NA_SPECTOR);
        }
    }
}
