package bibimbap.test.domain;

public class Item {
    private int itemId;
    private String itemName;
    private int price;
    private int quantity;

    // itemName, price, quantity : 생성자에서 초기화해주세요
    public Item(String itemName, int price, int quantity) {

    }

    // itemId, price, quantity 에 대한 getter/setter를 생성해주세요

    // item 정보를 출력해주세요
    // printItem을 사용하셔도 되고, toString을 사용하셔도 됩니다.
    public void printItem() {

    }

    // item 정보를 출력해주세요
    // printItem을 사용하셔도 되고, toString을 사용하셔도 됩니다.
    // toString 사용을 모른다면 구현하지 않아도 됩니다.
    @Override
    public String toString() {
        return super.toString();
    }
}
