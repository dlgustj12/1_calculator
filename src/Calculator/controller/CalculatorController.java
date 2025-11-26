package calculator.controller;

import calculator.domain.Calculator;
import calculator.domain.Operation;
import calculator.parser.InputParser;
import calculator.validator.InputValidator;

import java.util.List;

//1 검증
//2 분리
//3 계산
//4 결과 반환
public class CalculatorController {

    private final InputValidator validator = new InputValidator();
    private final InputParser parser = new InputParser();
    private final Calculator calculator = new Calculator();

    public double calculation(String input){

        //1. 검증
        validator.validateAll(input);

        //2. 분리
        parser.parse(input);

        //3. 계산
        double result = calculator.calculate(parser.getNumList(), parser.getOperation());
        return result;
    }
}
