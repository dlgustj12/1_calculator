프로젝트 목표 : 사용자의 문자열 입력에 따른 사칙연산 수행 -> 계산기 구현

기능 요구사항 :

1. 연산자의 경우 하나만 입력 받는다. 사칙 연산만 포함한다.
2. 입력 문자열의 숫자와 사칙 연산 기호 사이에는 공백이 포함되어야 한다.
3. 숫자는 쉼표(,) 또는 콜론(:)을 구분자로 가지는 문자열을 전달 할 경우 구분자를 기준으로 분리한 각 숫자와, 마지
막에 하나의 공백을 가지고 전달된 연산자의 계산 결과를 반환.
 - 예시-
 - 입력: 6:10,2:3 *
 - 출력: 6 * 10 * 2 * 3 = 360

4. 소숫점은 첫째짜리까지만 표시
5. 사용자가 잘못된 값을 입력할 경우 IllegalArgumentException을 발생 시킨다.

클래스 설계 : 
- CalculatorApplication : main 및 사용자 입출력 -> main(), run()
- InputValidator : 문자열 유효성 검증 -> checkNull(String), checkEmpty(String), checkOperator(String)
- InputParser : 문자열 분리 -> splitNum(String), splitOperator(String)
- Calculator : 사칙연산 수행 지시 -> calculate(Operation, List<Int>), 
- Opration : 실제 사칙연산 수행 -> Operate(int, int)

예외처리 : 
1. 문자열이 null인경우
2. (,),(;) 이외의 구분자를 입력받았을 경우
3. 마지막 문자가 사칙연산 기호가 아닌경우
4. 0으로 나누는 경우

순서 :
1. 유호성 검증 로직 구현
2. 문자열 분리 로직 구현
3. 사칙연산 로직 구현
4. 리펙터링
