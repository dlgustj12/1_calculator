package Calculator.validator;

//데이터 유효성 검증
public class InputValidator {

    public void CheckNullOrEmpty(String input){

        if(input == null){
            throw new IllegalArgumentException("문자열이 null 입니다.");
        }

        //input.trim() -> input의 양쪽에 있는 공백(탭,줄바꿈 포함)을 제거함->
        if(input.trim().isEmpty()){
            throw new IllegalArgumentException("문자열에 허용되지 않는 공백이 존재합니다.");
        }
    }
}
