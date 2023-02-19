package oop;

public class oop {
/*
 객체지향 언어
 - 기존 프로그래밍 언어 + 객체지향개념(규칙)
 - 재사용성 , 유지보수 용이, 중복 코드 제거
 - 캡슐화 
 - 상속 
 - 추상화 
 - 다형성
 
 -하나의 소스파일에는 하나의 클래스만 작성
 -소스파일의 이름은 public class이름과 일치
 -하나의 소스파일에는 하나의 public class만 허용
 
 객체의 생성과 사용
  
 1. 객체의 생성
 
 Tv t;
 t = new Tv();
 
 객체배열 == 참조변수 배열
 
 클래스
 - 설계도
 - 데이터(왜묶어? 관련있으니까) + 함수의 결합
 - 사용자 정의 타입 > 원하는 타입을 직접 만들 수 있다.
 변수 > 배열 > 구조체 > 클래스(구조체 + 함수)
 
 선언위치에 따른 변수의 종류(영역은 두개뿐이다)
 1.클래스영역 - iv, cv (static iv)  
 - 선언문만 들어갈 수 있음, 순서 상관없음 일단적으로 변수선언
 - iv 
   > 개별속성
   > 인스턴스 생성되었을때 생성
 - cv 
   > 공통속성
   > 클래스가 메모리에 올라갈 때
 
  객체 == iv를 묶어놓은 것
 

 2.메소드 영역 - lv
 
 메소드 = 선언부 + 구현부
 - 중복코드제거, 관리용이, 재사용가능
 - 반복적으로 수행되는 여러문장을 메소드로 작성
 - 하나의 메소드는 한가지 기능만 수행하도록 작성
 - 입력(0 ~ n개) , 출력(0 ~ 1개)
 
  기본형 매개변수
  - 기본형 매개변수 > 변수의 값을 읽기만 할 수 있다.
  - 참조형 매개변수 > 변수의 값을 읽고 변경할 수 있다.
  
  
  같은 클래스내에서는 참조변수 생략하고 호출 가능
  
  static 메서드와 인스턴스 메서드 
  - iv사용여부가 가장 큰 차이
  - static은 iv사용 불가
  
  생성자(constructor) == iv 초기화 메서드
  - 이름이 클래스 이름과 같아야 한다.
  - 리턴값이 없다. 
  - 이름이 클래스 이름과 같아야 한다.
  - 모든 클래스는 반드시 생성자를 가져야 한다.
  
  this()
   
  변수의 초기화
  1. 명시적 초기화
  2. 초기화 블럭 > 복잡한 초기화
  - {}
  - static {}
  3. 생성자 > iv 초기화, 복잡한 초기화
  - iv에는 생성자, cv에는 초기화 블럭, iv 초기화블럭은 x
  
  자동 > 간단 > 복잡
  
  클래스의 관계 
  1. 상속
  2. 포함 : 클래스의 멤버로 참조변수를 선언하는 것
  
  상속 > 생성자, 초기화블럭은 상속x
  - 조상의 멤버는 조상의 생성자를 호출해서 초기화해야함.
  
  super()
  - 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.**** 
  - 생략하면 super() // object() 그래서 toString, hashcode가 나오는 구나
  - 
  
  
  클래스 패스(classpath)
  클래스 파일(*.class)의 위치를 알려주는 경로
  - 환경변수로 관리하며, 경로간의 구분자는 ';'를 사용
  classpath(환경변수)에 패키지의 루트를 등록해줘야함
  
  
    
  
  
  
  
  */
}

























