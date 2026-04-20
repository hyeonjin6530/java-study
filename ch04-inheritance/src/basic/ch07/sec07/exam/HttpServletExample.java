package basic.ch07.sec07.exam;

public class HttpServletExample {
    public static void main(String[] args) {
        //         O                      X
        // HttpServlet servlet = new HttpServlet();
        // -> HttpServlet'은(는) abstract이며, 인스턴스화할 수 없습니다

        method(new LoginServlet());
        method(new FileDownloadServlet());
    }

    public static void method( HttpServlet servlet ) { // 매개변수의 다형성
        servlet.service( ); // 동적 바인딩
    }
}
