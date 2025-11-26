package calculator;
import calculator.IOP.Input;
import calculator.IOP.Output;


public class CalculatorApplication {
    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();

        String inputData = input.nextLine();


        //output.printResult(result);

        input.close();
    }
}

