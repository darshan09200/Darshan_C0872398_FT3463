import java.util.ArrayList;

public class Box extends Item {
    private int boxNo;


    public Box(int count, int boxNo) {
        this.boxNo = boxNo;
        items = new ArrayList<>(count);
    }

    public int getBoxNo() {
        return boxNo;
    }

    public void setBoxNo(int boxNo) {
        this.boxNo = boxNo;
    }


    public void addItem(SimpleItem item) {
        items.add(item);
    }

    public void addItem(Box box) {
        items.add(box);
    }

    public int findBoxNo(String itemName) {
        for (Item item : items) {
            int boxNo = item.findBoxNo(itemName);
            if (boxNo > -1) {
                return getBoxNo();
            }

        }
        return -1;
    }

    public void print() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}
