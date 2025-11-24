package calculator;

import calculator.domain.Calculator;
import calculator.domain.Operation;
import calculator.parser.InputParser;
import calculator.validator.InputValidator;

import java.util.List;
import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        new CalculatorApplication().run();
    }

    public void run(){

        try(Scanner scanner = new Scanner(System.in)){

            InputValidator validator = new InputValidator();
            InputParser parser = new InputParser(validator);
            Calculator calculator = new Calculator();

            while(true){

                System.out.print("계산할 입력 문자열 입력(종료는 -1) : ");
                String input = scanner.nextLine();
                if(input.equals("-1"))
                    return;

<<<<<<< HEAD
                try {
                    //1. 숫자집합과 연산자 분리(그 과정에서 유효성 검사)
                    List<Integer> numList = parser.parseNumbers(input);
                    Operation op = parser.parseOperator(input);

                    //2.연산
                    double result = calculator.calculate(numList, op);
=======
                //1. 숫자집합과 연산자 분리(그 과정에서 유효성 검사)
                List<Integer> numList = parser.parseNumbers(input);
                Operation op = parser.parseOperator(input);
>>>>>>> 55b9d53a371fff5a9038a950f081bdeec6ff79e4

                    if (result % 1 == 0.0) {
                        System.out.println((int) result);
                    } else System.out.printf("%.1f\n", result);


                } catch (Exception e) {
                    System.err.println("알 수 없는 오류 발생 : " + e.getMessage());
                }
            }
        }
    }
}
//일레걸 인셉션
// 정적 메서드