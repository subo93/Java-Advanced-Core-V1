package lambdaExp;

public class Agent {

    String name;
    String region;
    int customersHandled;

    public Agent(String name, String region, int customersHandled) {
        this.name = name;
        this.region = region;
        this.customersHandled = customersHandled;
    }

    @Override
    public String toString() {
        return name + " (" + region + ") - Customers: " + customersHandled;
    }
}
