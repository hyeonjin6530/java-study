package basic.ch14.lecture.syncronization;

public class Application {
    public static void main(String[] args) {

//        Account account = new Account();
        SafeAccount account = new SafeAccount(); // 동기화 적용

        // 작업 스레드 정의
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                account.withdraw(600);
//                System.out.println("Thread 1 출금 후 잔액" + account.getBalance());
            }
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                account.withdraw(600);
//                System.out.println("Thread 2 출금 후 잔액" + account.getBalance());
            }
        });

        t1.start();  // 작업 스레드 동작
        t2.start();

        // 메인 스레드 실행
//        System.out.println("안녕");
    }
}
