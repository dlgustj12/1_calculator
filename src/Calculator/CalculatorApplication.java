package calculator;
import calculator.input.Input;


public class CalculatorApplication {
    public static void main(String[] args) {
        new CalculatorApplication().run();
    }

    public void run(){
        String inputData = Input.nextLine();

        //연산 calculate(inputData);

        Input.close();
    }
}