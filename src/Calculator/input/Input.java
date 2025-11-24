package calculator.input;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);

    // 인스턴스 생성 막음
    private Input(){}

    public static String nextLine(){

        //이미 생성된 scanner 사용
        String input = scanner.nextLine();

        Validator.validateAll(input);
    }

    public static void close(){
        if(scanner != null){
            scanner.close();
        }
    }
}
