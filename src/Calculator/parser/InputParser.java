package Calculator.parser;

import Calculator.domain.Operation;
import Calculator.validator.InputValidator;
import java.util.ArrayList;
import java.util.List;

//문자열을 유요한 데이터로 변환
public class InputParser {
    private  final InputValidator validator;

    public InputParser(InputValidator validator) {
        this.validator = validator;
    }

    //문자열에서 연산자 분리 -> Operation Enum 객체로 변환
    public Operation parseOperator(String input){
        String operatorSymbol = input.substring(input.length() - 1);

        validator.checkOperator(operatorSymbol);

        return Operation.fromSymbol(operatorSymbol);
    }

    //연산자 파트 제거한 numPart 추출
    private String getNumPart(String input){
        String numPart = input.substring(0,input.length()-1);

        return numPart.trim();
    }

    //문자열의 숫자부분 List<Integer>로 변환
    public List<Integer> parseNumbers(String input){
        validator.checkNullOrEmpty(input);
        validator.checkOnlyOneOperator(input); //input 마지막이 하나의 연산자로만 되어있는지

        String numPart = getNumPart(input);

        String[] tokens = numPart.split("[,:]"); // [,:] 기준으로 토큰화

        List<Integer> numbers = new ArrayList<>();

        for (String temp : tokens) {

            numbers.add(Integer.parseInt(temp));
        }

        return numbers;
    }
}
