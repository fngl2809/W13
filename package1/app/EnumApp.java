package package1.app;

import package1.data.Customer;
import package1.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("fulan");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //enum ke string
        String levelString = Level.STANDARD.name();
        System.out.println(levelString);
        // string ke enum
        Level level = Level.valueOf ("PREMIUM");
        System.out.println(level);
        // get available semua enum
        Level[] levels = Level.values();
        System.out.println(levels);
        //print available semua enum
        System.err.println("print level");
        for (var value : Level.values()){
            System.out.println(value);
        }

    }
    
}
