package extra;

public class Test1 extends Animal implements Walkable {
    @Override
    public void walk() {
        System.out.println("The dog walks on four legs.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}
