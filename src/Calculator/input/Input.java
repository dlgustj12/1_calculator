package calculator.input;

import calculator.validator.Validator;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String nextLine(){
        System.out.println("계산 내용 입력 : ");

        String input = this.scanner.nextLine();

        Validator.validateAll(input);

        return input;
    }

    public void close(){
        if(scanner != null){
            scanner.close();
        }
    }
}
