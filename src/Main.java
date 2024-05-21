import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Aici am facut si cu scanner sa citeasca datele pt. Person si Product, ca si alternativa.

        /*     Scanner scanner = new Scanner(System.in);
        Person[] persons = new Person[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            Integer age = scanner.nextInt();

            System.out.print("Married (true/false): ");
            boolean married = scanner.nextBoolean();
            System.out.println();

            scanner.nextLine();
            persons[i] = new Person(name, age, married);
        }

        for (Person person : persons) {
            System.out.println(person);
        }

        System.out.print("How many product objects do you want to create? ");
        int length = scanner.nextInt();
        Product[] products = new Product[length];

        scanner.nextLine();

        for (int i = 0; i < length; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Category: ");
            String category = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();

            System.out.print("Quantity: ");
            Integer quantity = scanner.nextInt();
            System.out.println();

            scanner.nextLine();
            products[i] = new Product(name, category, price, quantity);
        }

        for (Product product : products) {
            System.out.println(product);
        }
    */
//        Person person1 = new Person("Matei", 20, true);
//        Person person2 = new Person("Andrei", 33, false);
//        Person person3 = new Person("Mircea", 55, true);
//
//        System.out.println("-------------- --------------------------");
//
//        Product product1 = new Product("Snickers", "sweet snack", 4.49,10);
//        Product product2 = new Product("Coca-Cola", "soda", 3.45,0);
//        Product product3 = new Product("Chips", "snack", 8.99,142);
//
//        System.out.println(product1.getName());
//        System.out.println(product1.getCategory());
//        System.out.println(product1.getPrice());
//        System.out.println(product1.getQuantity());
//        System.out.println(product2.hasStock());
//        System.out.println(product3.isCategory("snack"));
//        System.out.println("----------------------------------------");

        Bottle bottle = new Bottle(1500, 1000, false);
        System.out.println(bottle.getAvailableLiquid() + "ml");
        System.out.println(bottle.getCapacity() + "ml");

        System.out.println(bottle.openBottle());
        System.out.println(bottle.closeBottle());
        System.out.println(bottle.openBottle());

        System.out.println(bottle.drinkLiquid(2000));
        System.out.println(bottle.hasLiquid());
        System.out.println(bottle.drinkLiquid(560));
        System.out.println(bottle.hasLiquid());
        System.out.println(bottle.drinkLiquid(400));
    }
}