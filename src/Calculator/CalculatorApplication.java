package calculator;
import calculator.IOP.Input;
import calculator.IOP.Output;
import calculator.controller.CalculatorController;


public class CalculatorApplication {
    public static void main(String[] args) {

        Input input = new Input();
        Output output = new Output();
        CalculatorController controller = new CalculatorController();

        while(true){

            try{
                //input
                String inputData = input.nextLine();
                //controller
                String[] result = controller.controller(inputData);
                //output
                output.printResult(result);

            } catch(IllegalArgumentException e){
                System.err.println(e.getMessage());
            }
        }
    }
}

