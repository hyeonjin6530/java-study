package basic.ch06.sec00.book;

public class Application {
    public static void main(String[] args) {
        // 객체 만들기

        Book myBook = new Book();
        myBook.title = "와 어떻게 이렇게 잠을 잘 수가";
        myBook.author = "황현진";
        myBook.coverType = "하드 커버";
        myBook.pageCount = 320;

        System.out.println(myBook.title);

        Book myBook2 = new Book("황현진", "와 나 방금 꿈까지 꿨다", "소프트 커버", 320);
//        myBook2.title = "와 나 방금 꿈까지 꿨다";
//        myBook2.author = "황현진";
//        myBook2.coverType = "소프트 커버";
//        myBook2.pageCount = 320;

        myBook2.introduce();

        System.out.println(myBook2);
        // basic.ch06.sec00.book.Book@668bc3d5 -> 맨뒤는 주소값
        // override를 통해 toString 써서 이제 문자 그대로 나와용
    }
}
