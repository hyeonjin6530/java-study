package ch12.sec03.exam03;

public record Member(String id, String name, int age) {

    /*
    * recode 컴파일러가 자동으로 생성해준다. (DTO 만들 때 사용)
    *
    * private final 필드 (final 붙어서 수정 못함 -> setter도 없음, private -> 상속 못함)
    * 모든 필드를 받는 생성자
    * getter() -> 필드명으로 생성
    * toString()
    * hashCode()
    * equals()
    * */
}
