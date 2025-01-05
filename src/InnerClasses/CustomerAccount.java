package InnerClasses;

import java.net.SocketOption;

public class CustomerAccount {
    private String customerName;
    private int customerId;
    private Subscription subscription;  // Inner class instance

    class Subscription {
        private String planName;
        private double monthlyFee;

        Subscription(String planName, double monthlyFee) {
            this.planName = planName;
            this.monthlyFee = monthlyFee;
        }

        void displaySubscriptionDetails() {
            System.out.println("");

            System.out.println("inside the subscription details - inner class");
            System.out.println("Plan: " + planName + ", Fee: " + monthlyFee);
        }
    }

    public CustomerAccount(String name, int id, String plan, double fee) {
        this.customerName = name;
        this.customerId = id;
        this.subscription = new Subscription(plan, fee);
    }

    public void displayAccountDetails() {
        System.out.println("Customer: " + customerName + ", ID: " + customerId);
        subscription.displaySubscriptionDetails();
    }
}


