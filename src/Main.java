import InnerClasses.CustomerAccount;
import InnerClasses.OuterClass;
import anonymouseInnerClassExample.BalanceNotifier;
import anonymouseInnerClassExample.Customer;
import eums.Laptop;
import eums.Status;
import lambdaExp.CustomerPlanCalculator;

import java.net.SocketOption;
import java.util.ArrayList;
import java.util.List;

//public class Main {
//    public static void main(String[] args) {
//        OuterClass outer = new OuterClass();
//        OuterClass.InnerClass inner = outer.new InnerClass();
//        inner.display();  // Output: Outer variable: 10
//    }
//}


public class Main {
    public static void main(String[] args) {
        System.out.println("=====Inner Class=====");

        CustomerAccount account = new CustomerAccount("Subodhi", 101, "GOLD Plan", 50.0);
        account.displayAccountDetails();

        System.out.println("=====Anonymouse Inner Class=====");
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Perera", 50.0));
        customers.add(new Customer("Munii", 5.0)); // Low balance
        customers.add(new Customer("Subo", 100.0));

        // Define and use an anonymous inner class to notify low-balance customers
        BalanceNotifier notifier = new BalanceNotifier() {
            @Override
            public void notifyCustomer(String customerName, double balance) {
                if (balance < 20.0) { // Low-balance threshold
                    System.out.println("Dear " + customerName + ", your balance is low: $" + balance);
                }
            }
        };

        // Check balances and notify customers
        for (Customer customer : customers) {
            notifier.notifyCustomer(customer.getName(), customer.getBalance());
        }


        System.out.println("=====Enum=====");

        int i = 5;
        Status s = Status.Running;
        System.out.println("Status: " + s);
        System.out.println("Status: " + s.ordinal());

        // print all
        Status[] ss = Status.values();
        for (Status status : ss) {
            System.out.println("Status: " + status);
        }


        //switch statments
        Status s2 = Status.Running;

        switch (s2) {
            case Running:
                System.out.println("Running");
                break;

            case Failed:
                System.out.println("Failed");
                break;

            case Pending:
                System.out.println("Pending");
                break;

            default:
                System.out.println("Done!");
                break;

        }

        System.out.println("=====Enum===== with constructor");
        for (Laptop laptop : Laptop.values()) {
            System.out.println(laptop + ": "+laptop.getValue());
        }

        System.out.println("=====Lambda Expression======");

        CustomerPlanCalculator calculator = (minutes, ratePerMinute) -> minutes * ratePerMinute;

        System.out.println("Call Cost: " + calculator.calculateCost(100, 0.5)); // Output: 50.0        };

    }


}

