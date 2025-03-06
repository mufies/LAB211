package Test;

import Tuan7.Fruit;
import Tuan7.Management;

public class TestTuan7 {
    public static void main(String[] args) {
        Management m = new Management();
        InputData input = new InputData();
        while (true)
        {
            System.out.println("FRUIT SHOP SYSTEM");
            System.out.println("1. Add fruit");
            System.out.println("2. View order");
            System.out.println("3. Shopping");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = input.getInt();
            switch (choice)
            {
                case 1 -> {
                    boolean flag = true;
                    while (flag) {
                        System.out.println("Enter fruit id: ");
                        String id = input.getString();
                        System.out.println("Enter fruit name: ");
                        String name = input.getString();
                        System.out.println("Enter fruit price: ");
                        double price = input.getDouble();
                        System.out.println("Enter fruit quantity: ");
                        int quantity = input.getInt();
                        System.out.println("Enter fruit origin: ");
                        String origin = input.getString();
                        if (!m.add(new Fruit(id, name, price, quantity, origin))) {
                            System.out.println("Invalid fruit");
                        }
                        System.out.println("Do you want to continue? (Y/N)");
                        while (true) {
                            String c = input.getString();
                            if (c.equalsIgnoreCase("Y")) {
                                break;
                            } else if (c.equalsIgnoreCase("N")) {
                                m.displayFruit();
                                flag = false;
                                break;
                            } else {
                                System.out.println("Invalid choice");
                            }
                        }
                    }
                }
                case 2 -> m.viewOrder();
                case 3 -> m.addOrder();
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice");
            }

        }
    }
}
