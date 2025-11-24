package calculator;
import calculator.input.Input;


public class CalculatorApplication {
    public static void main(String[] args) {
        Input input = new Input();
        String inputData = input.nextLine();

        //연산 calculate(inputData);

        input.close();
    }
}