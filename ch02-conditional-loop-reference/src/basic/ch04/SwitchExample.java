package basic.ch04;

public class SwitchExample {
    public static void main(String[] args) {
        // Switch 문
        // 특정 case 별로 코드를 분기하고 싶을 때 사용

        char grade = 'A';
        // char ''
        // String ""

//        switch (grade) {
//            case 'A':
//                System.out.println("A 입니다!");
//                break;
//            case 'B':
//                System.out.println("B 지롱");
//            default:
//                System.out.println("기본값입니둥");
//        }

        // 개선된 switch로
        // 화살표 문법
        // break를 안걸어도 해당하는 것에서만 실행이 된다.
//        switch (grade) {
//            case 'A', 'a' -> System.out.println("A 입니다!");
//            case 'B' -> System.out.println("B 지롱");
//            default -> System.out.println("기본값입니둥");
//        }

        String result = switch (grade) {
            case 'A', 'a' -> {
                System.out.println("실행됨");
                yield "A 입니다!"; // 반환값 지정(return 같은 거)
            }
            case 'B' -> "B 지롱";
            default -> "기본값입니둥";
        };

        System.out.println(result);
    }
}
