package list.test.test01;
// 재고 관리 클래스
public class Inventory {

    // 제품명, 가격, 재고
    private String name;
    private int price;
    private int inventory;

    public Inventory(String name, int price, int inventory) {
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getInventory() {
        return inventory;
    }

    public int setInventory(int inventory) {
        this.inventory = inventory;
        return inventory;
    }

    @Override
    public String toString() {
        return "(" + "제품명 : " + name + " / 가격 : " + price + " / 재고 : " + inventory + ")";
    }

}
