package Calculator;

import Calculator.domain.Calculator;
import Calculator.domain.Operation;
import Calculator.parser.InputParser;
import Calculator.validator.InputValidator;

import java.util.List;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        new CalculatorApplication().run();
    }

    public void run(){

        InputValidator validator = new InputValidator();
        InputParser parser = new InputParser(validator);
        Calculator calculator = new Calculator();

        try(Scanner scanner = new Scanner(System.in)){

            System.out.print("계산할 입력 문자열 입력 : ");
            String input = scanner.nextLine();

            //1. 유효성 검사
            validator.checkNullOrEmpty(input);
            validator.checkOnlyOneOperator(input);


            //2. 숫자집합과 연산자 분리
            List<Integer> numList = parser.parseNumbers(input);
            Operation op = parser.parseOperator(input);

            //3.연산
            double result = calculator.calculate(numList, op);
            System.out.println(result);


        }

    }
}
