import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 3.5);
        Item item2 = new Item("latte", 4.2);
        Item item3 = new Item("drip coffee", 2);
        Item item4 = new Item("cappuccino", 5.43);
    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order();
        Order order4 = new Order();

        order1.name = "Cinhuri";
        order2.name = "Jimmy";
        order3.name = "Noah";
        order4.name = "Sam";

        order2.items.add(item1);
        order2.total += item1.price;

        order3.items.add(item4);
        order3.total += item4.price;

        order4.items.add(item2);
        order4.total += item2.price;

        order1.ready = true;

        for (int i = 0; i < 2; i++){
            order4.items.add(item2);
            order4.total += item2.price;
        }

        order2.ready = true;

        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order1.name);
        System.out.printf("Total: %s\n", order1.total);
        System.out.printf("Ready: %s\n", order1.ready);
    }
}
