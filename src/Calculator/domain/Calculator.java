package calculator.domain;


import java.util.List;

//연산 수행 지시
public class Calculator {


    public double calculate(List<Integer> numList, Operation op){

        double result = numList.get(0); //첫번째 숫자 -> 초기값

        for (int i = 1; i < numList.size(); i++) {
            int nextNum = numList.get(i);

            result = op.apply(result, nextNum);
        }

        result = Math.round( result * 10) / 10.0;
        return result;

    }
}
