class Item {
    private int value1;

    public void setValue(int value) {
        // System.out.println(value);
        value1 = value + 0;
    }

    public int getValue() {
        // System.out.println(value1);
        return value1;
    }
}

public class ThisDemo {
    public static void main(String[] args) {
        Item myItem = new Item();
        System.out.print(myItem.getValue() + " | ");
        myItem.setValue(13);
        System.out.println(myItem.getValue());
    }
}
