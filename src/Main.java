import shop.Customer;
import shop.VIPCustomer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello " + args[0] + " " + args[1]);

        VIPCustomer customer = new VIPCustomer();
//    customer.Customer customer1 = new customer.Customer();
        customer.setName("Steven");
        customer.setInterests(Arrays.asList("Food", "Music", "Dancing"));
        customer.setBase("London");

        System.out.println(customer.getName() + " loves " + customer.getInterests().get(1) + " at " + customer.getBase());
    }
}