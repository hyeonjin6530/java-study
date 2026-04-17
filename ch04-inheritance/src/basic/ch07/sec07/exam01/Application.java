package basic.ch07.sec07.exam01;

public class Application {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        E e = new E();

        // 업캐스팅
        // 타입을 자식 -> 부모로 변경 가능
        // type 변수명 = new(heap 영역에 올라가는 거) 인스턴스
        A a1 = new B();  // B 인스턴스는 A 타입이 될 수 있다
        A a2 = new C();
        A a3 = new D();

        // 다운캐스팅
        // 부모 -> 자식으로 변경하는 건 안됨
        A a4 = new B(); // 업캐스팅

        // 실제 객체가 B이기 때문에 B로 다운캐스팅이 가능
        B b2 = (B) a4;
    }
}
