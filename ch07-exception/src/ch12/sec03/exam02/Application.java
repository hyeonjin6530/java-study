package ch12.sec03.exam02;

public class Application {
    public static void main(String[] args) {
        Student student = new Student();

        Student student2 = new Student(0, "hj");

        System.out.println(student); // ToString 확인
        System.out.println(student.getNo()); // Getter 확인
    }
}
