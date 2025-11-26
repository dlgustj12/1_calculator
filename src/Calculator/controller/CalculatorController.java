package calculator.controller;

import calculator.domain.Calculator;
import calculator.parser.InputParser;
import calculator.validator.InputValidator;

public class CalculatorController {

    private final InputValidator validator = new InputValidator();
    private final InputParser parser = new InputParser();
    private final Calculator calculator = new Calculator();

    public String[] controller(String input){


        //1. 검증
        validator.validateAll(input);

        //2. 분리
        parser.parse(input);

        //3. 계산
        double result = calculator.calculate(parser.getNumList(), parser.getOperation());

        //4. 결과 문자열 리턴

        StringBuilder numStr = new StringBuilder();
        for(int i = 0; i< parser.getNumList().size(); i++){
            if (i > 0) {
                // 첫 번째 요소 이후에만 " 연산자 "를 추가합니다.
                numStr.append(" ")
                        .append(parser.getOperation().getSymbol())
                        .append(" ");
            }
            numStr.append(parser.getNumList().get(i));
        }

        return new String[]{String.valueOf(result), numStr.toString()};
    }
}
