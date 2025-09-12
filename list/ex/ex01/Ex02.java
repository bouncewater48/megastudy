package list.ex.ex01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        // 리스트 반복문

        List<String> fruitList = new ArrayList<>();
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("grape");

        // index 기반 반복문
        for(int i = 0; i < fruitList.size(); i++) {
//            System.out.print(fruitList.get(i) + " ");
            String fruit = fruitList.get(i);

//            if(fruit.eqauls("banana")) {
//                fruitList.remove(i);
//            }
//            System.out.println(fruit + " ");
        }
        System.out.println(fruitList);
        // apple banana grape

        // 향상된 for문 - foreach, each 반복문이라고도 부름
        // 기존 for문보다 직관적이고 편리하게 만든 반복문, : 뒷부분에서 반복을 실행하고, 변수타입 뒤의 객체에 결과를 저장함
        System.out.print("향상된 for문 - ");
        for(String fruit : fruitList) {
//            System.out.print(fruit + " ");
            if(fruit.equals("banana")) {
                fruitList.remove(fruit);
            }
        }
        System.out.println();

        // Iterator - 반복과정에서 리스트의 값을 삭제 할 때 필수적으로 사용해야함
        // 리스트를 직접 다루는게 아닌 Iterator라는 관찰자를 통해 관리하는 명령어
        // 리스트에 다음 값이 있는지를 확인하는 명령어, 있으면 다음 값을 지정하고 없으면 반복문을 종료
        Iterator<String> iter = fruitList.iterator();

        while(iter.hasNext()) {
            String fruit = iter.next(); // 다음 값을 가르켜줘
//            System.out.print(fruit + " ");
            if(fruit.equals("banana")) {
                iter.remove();
            }
        }                     // grape까지만 있으므로 grape까지 반복해서 출력 후 종료
//        System.out.println(); // apple banana grape
        System.out.println(fruitList);
        

    }
}
