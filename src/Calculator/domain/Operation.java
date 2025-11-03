package Calculator.domain;
import java.util.Scanner;
import java.util.function.BiFunction;

//실제 사칙연산 수행
public enum Operation {

    PLUS("+") {
        @Override
        public double calculate(int a, int b) {
            return (double) a + b;
        }
    },
    MINUS("-") {
        @Override
        public double calculate(int a, int b) {
            return (double) a - b;
        }
    },
    MULTIPLY("*") {
        @Override
        public double calculate(int a, int b) {
            return (double) a * b;
        }
    },
    DIVIDE("/") {
        @Override
        public double calculate(int a, int b) {
            // 0으로 나누는 예외 처리는 apply()에서 처리합니다.
            return (double) a / b;
        }
    };

    private final String symbol;

    Operation(String symbol) {
        this.symbol = symbol;
    }

    //추상 메서드 정의 (abstract)
    //추상메서드가 없으면 PLUS,MINUS 같은 Operation Enum 상수는 각각의 고유한 계산 로직을 오버라이딩(구현)할수가 없음
    public abstract double calculate(int a, int b);

    public double apply(int a, int b){
        return calculate(a,b);
    }

    public static Operation fromSymbol(String symbol){

        Operation[] allOperations = Operation.values();

        for (int i = 0; i < allOperations.length; i++) {
            Operation op = allOperations[i];

            if(op.symbol.equals(symbol)){
                return op;
            }
        }
        throw new IllegalArgumentException("error: 연산기호 오류(fromSymbol)");
    }
}
