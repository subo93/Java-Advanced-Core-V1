package record;

// data carrier class
//data immutable
//facts about record classes
//1. record class is final by default
//2. record class is implicitly final

public record DemoR(int id, String name) {

    //all arguments constructor
    public DemoR(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        DemoR d1 = new DemoR(1, "A");
        DemoR d2 = new DemoR(1, "A");
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d1.equals(d2));
    }

}

