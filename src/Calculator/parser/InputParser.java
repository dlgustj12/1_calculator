package Calculator.parser;

import Calculator.validator.InputValidator;

//문자열을 유요한 데이터로 변환
public class InputParser {
    private  final InputValidator validator;

    public InputParser(InputValidator validator) {
        this.validator = validator;
    }


}
