package list.test.test01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        제품 재고 관리
//        아래 내용을 관리하는 클래스를 설계하고, 아래 주어진 문제를 푸세요.
//                재고 관리 Class
//        제품명, 가격, 재고
//
//        1. 제품 추가
//        아래 정보를 만든 클래스와 리스트를 이용해서 저장하고 출력하세요.
//        제품명 : 새우깡  가격 : 1200 재고 : 150
//        제품명 : 육개장  가격 : 850  재고 : 30
//        제품명 : 신라면  가격 : 800  재고 : 15
//        제품명 : 천마표팝콘  가격 : 1500 재고 : 0
//        출력 예시
//
//[(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 30), (제품명 : 신라면 가격 : 800 재고 : 15), (제품명 : 천마표팝콘 가격 : 1500 재고 : 0)]

        List<Inventory> inventoryList = new ArrayList<>();
        Inventory inven1 = new Inventory("새우깡", 1200, 150);
        inventoryList.add(inven1);
        Inventory inven2 = new Inventory("육개장", 850, 30);
        inventoryList.add(inven2);
        Inventory inven3 = new Inventory("신라면", 800, 15);
        inventoryList.add(inven3);
        Inventory inven4 = new Inventory("천마표팝콘", 1500, 0);
        inventoryList.add(inven4);

        System.out.println(inventoryList);


//        2. 제품 제거
//        재고가 없는 상품을 리스트에서 삭제하고, 전체 리스트를 출력하세요.
//        출력 예시
//
//[(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 30), (제품명 : 신라면 가격 : 800 재고 : 15)]

        Iterator<Inventory> iter = inventoryList.iterator();

//        for(int i = 0; i < inventoryList.size(); i++) {
//            int inventory = inventoryList.getInventory();
//            int inventory = inventoryList.get(i);
////            inventory = inventory.getInventory();
//            System.out.print(inventory + " ");
//        }
//        System.out.println();

        System.out.println("========================");
        while (iter.hasNext()) {
            Inventory inven = iter.next();
            if (inven.getInventory() == 0) {
                iter.remove();
            }
        }
        System.out.println(inventoryList);

//        3. 제품 판매
//        판매한 제품명과 개수를 입력받고, 가격을 계산하고, 재고 개수를 업데이트하세요.
//        계산된 가격과 제품 리스트를 출력하세요.
//                입력 예시
//
//        상품명 : 육개장
//        개수 : 7
//        출력 예시
//
//        가격 : 5950원
//                [(제품명 : 새우깡 가격 : 1200 재고 : 150), (제품명 : 육개장 가격 : 850 재고 : 23), (제품명 : 신라면 가격 : 800 재고 : 15)]

        System.out.println("========================");
        System.out.print("상품명 : ");
        String scanName = scan.nextLine();
        System.out.print("개수 : ");
        int scanItem = scan.nextInt();

        for (Inventory item : inventoryList) {
            if (item.getName().equals(scanName)) {
                item.setInventory(item.getInventory() - scanItem);
                int price = item.getPrice() * scanItem;
                System.out.println("가격 : " + price + "원");
            }
            scan.close();
        }
        System.out.println(inventoryList);


//        4. 재고 관리
//        재고가 적은 상품을 새롭게 수주하려고 한다.
//        재고가 30개 이하인 상품의 정보를 출력하세요.
//                출력 예시
//
//        (제품명 : 육개장 가격 : 850 재고 : 23)
//        (제품명 : 신라면 가격 : 800 재고 : 15)

        System.out.println("========================");
        System.out.print("재고가 30개 이하인 상품 : ");
        for (Inventory item : inventoryList) {
            if (item.getInventory() <= 30) {
                System.out.print(item);
            }
        }
    }
}
