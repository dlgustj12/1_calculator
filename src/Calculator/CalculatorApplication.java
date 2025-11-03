package Calculator;

import Calculator.domain.Calculator;
import Calculator.parser.InputParser;
import Calculator.validator.InputValidator;

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

            validator.checkNullOrEmpty(input);
            validator.checkOnlyOneOperator(input);

            System.out.println("유효성 checked.");
        }

    }
}
