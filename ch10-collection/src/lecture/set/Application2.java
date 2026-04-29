package lecture.set;

import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        /*
        * TreeSet
        * - 이진 탐색 트리 기반의 set 구현체
        * - 요소들이 자동으로 오름차순 정렬됨
        * */
        
        TreeSet<Integer> test = new TreeSet<>();
        
        test.add(40);
        test.add(30);
        test.add(50);
        test.add(40); // 중복 -> 무시

        System.out.println("test = " + test); // 정렬됨

        System.out.println("test.first() = " + test.first()); // 가장 큰 요소
        System.out.println("test.last() = " + test.last()); // 가장 작은 요소

        /*
        ceiling(e) : e 이상인 요소 중 가장 작은 값
        higher(e) : e 초과인 요소 중 가장 작은 값
         */

        System.out.println("test.floor(25) = " + test.floor(25)); // 25 이하인 요소중 가장 큰 값
        System.out.println("test.lower(25) = " + test.lower(25)); // 25 미만인 요소중 가장 큰 값

        /*
        * headSet(e) : e 미만인 요소들로 구성된 set 반환
        * tailSet(e) : e 이상인 요소들로 구성된 set 반환
        * subSet(from, to) : from 이상 to 미만 요소들로 구성된 set 반환
        * */

        System.out.println("test.headSet(30) = " + test.headSet(30));
        System.out.println("test.tailSet(30) = " + test.tailSet(30));
        System.out.println("test.subSet(20, 40) = " + test.subSet(20, 40));
        
    }
}
