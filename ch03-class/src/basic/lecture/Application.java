package basic.lecture;

public class Application {
    public static void main(String[] args) {
        Student student = new Student("왕연진", Grade.A);

        System.out.println(student.grade.getDescription());
    }
}
