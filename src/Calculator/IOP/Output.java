package calculator.IOP;

//책임 : 연산 결과를 전달받아서 출력만 담당
public class Output {

    public void printResult(String[] str){

        System.out.println(str[1] + " = " + str[0]);
    }

}
