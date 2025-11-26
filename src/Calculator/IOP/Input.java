package calculator.IOP;

import calculator.validator.InputValidator;

import java.util.Scanner;

public class Input {
    private final Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String nextLine(){
        System.out.println("계산 내용 입력 : ");

        String input = this.scanner.nextLine();

        if((input.trim().equals("-1"))){
            close();
            System.exit(0);
        }


        return input;
    }

    public void close(){
        if(scanner != null){
            scanner.close();
        }
    }
}
