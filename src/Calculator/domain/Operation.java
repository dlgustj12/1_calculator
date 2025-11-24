package calculator.domain;

import Calculator.validator.InputValidator;

//실제 사칙연산 수행
public enum Operation {

    PLUS("+") {
        @Override
        public double calculate(double a, double b) {
            return  a + b;
        }
    },
    MINUS("-") {
        @Override
        public double calculate(double a, double b) {
            return  a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double calculate(double a, double b) {
            // 0으로 나누는 예외 처리는 apply()에서 처리합니다.
            return a / b;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    //추상 메서드 정의 (abstract)
    //추상메서드가 없으면 PLUS,MINUS 같은 Operation Enum 상수는 각각의 고유한 계산 로직을 오버라이딩(구현)할수가 없음
    public abstract double calculate(double a, double b);

    public double apply(double a, double b){
        if(this == DIVIDE){
            InputValidator.checkDivByZero(b);
        }
        return calculate(a,b);
    }

    public static Operation fromSymbol(String symbol){

        Operation[] allOperations = Operation.values();

        for (Operation op : allOperations) {
            if (op.symbol.equals(symbol)) {
                return op;
            }
        }
        throw new IllegalArgumentException("error: 연산기호 오류(fromSymbol)");
    }
}
