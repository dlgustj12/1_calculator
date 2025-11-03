package Calculator;

import Calculator.validator.InputValidator;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        new CalculatorApplication().run();
    }

    public void run(){
        try(Scanner scanner = new Scanner(System.in)){
            InputValidator validator = new InputValidator();

            System.out.print("계산할 입력 문자열 입력 : ");
            String input = scanner.nextLine();

            validator.checkNullOrEmpty(input);
            validator.checkOnlyOneOperator(input);

            System.out.println("유효성 checked.");
        }

    }
}
