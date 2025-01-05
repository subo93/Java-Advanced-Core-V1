package eums;

public enum Laptop {
    Macbook(1000),Lenovo(7000),Surface(5000 );

    private int value;
    Laptop(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
