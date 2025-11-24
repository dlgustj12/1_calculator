package calculator.validator;

import Calculator.domain.Operation;

//데이터 유효성 검증
public class Validator {

    //1. 문자열이 null 경우 or 2. 허용되지 않은 Empty 인경우
    public void checkNullOrEmpty(String input){

        if(input == null){
            throw new IllegalArgumentException("error : input -> null");
        }

        if(input.trim().isEmpty()){
            throw new IllegalArgumentException("error : input -> empty");
        }
    }

    //3. 마지막 문자가 사칙연산 기호가 아닌 경우
    public void checkOnlyOneOperator(String input){
        String lastChar = input.substring(input.length() - 1);

        checkOperator(lastChar);
    }
    public void checkOperator(String input){

        boolean isOperator = input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
        if(!isOperator){
            throw new IllegalArgumentException("error : Not allowed Symbol: " + input);
        }
    }

    //4. 0으로 나누는 경우
    public static void checkDivByZero(double num){
        if(num == 0.0){
            throw new IllegalArgumentException("error : can't divide by 0");
        }
    }

    //어떻게 쓰지... (,),(:) 이외의 구분자를 입력받았을 경우
    public void checkSeparator(char ch){
        boolean flag = ch == ',' || ch == ':';
        if(!flag){
            throw new IllegalArgumentException("error : Allowed Separators are only (,),(:)");
        }
    }
}
