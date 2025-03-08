package Tuan7;

import Test.InputData;

import java.util.ArrayList;
import java.util.List;

public class Management {
    List<Fruit> fl = new ArrayList<>();
    List<Customer> cl = new ArrayList<>();
    InputData input = new InputData();
    public boolean add(Fruit fruit) {
        for (Fruit f : fl) {
            if(f.getName().equals(fruit.getName()) && f.getId().equals(fruit.getId()) && f.getPrice() == (fruit.getPrice()) && f.getOrigin().equals(fruit.getOrigin())) {
                f.setQuantity(f.getQuantity() + fruit.getQuantity());
                return true;
            }
            else if(!f.getName().equals(fruit.getName()) && f.getId().equals(fruit.getId())) {
                return false;
            }
        }
        fl.add(fruit);
        return true;
    }
    public void displayFruit() {
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ | ++ Quantity ++ |");
        for(Fruit f : fl) {
            System.out.println(f.getId() + " " + f.getName() + " " + f.getOrigin() + " " + f.getPrice() + "$ " + f.getQuantity());
        }
    }

    public void viewOrder() {
        if(cl.isEmpty()) {
            System.out.println("No order");
            return;
        }
        for(Customer c : cl) {
            System.out.println("Customer: " + c.getName());
            System.out.println("Product | Quantity | Price | Amount");
            double total = 0;
            for(Order o : c.getOrders()) {
                System.out.println( o.getProductName()+ " "  + o.getQuantity()+ " "  + o.getPrice()+ "$ " + o.getQuantity() * o.getPrice());
                total+=o.getQuantity() * o.getPrice();
            }
            System.out.println("Total: " + total);
            System.out.println();
        }


    }

    public void addOrder() {
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for(Fruit f : fl) {
            System.out.println(f.getId() + " " + f.getName() + " " + f.getOrigin() + " " + f.getPrice() +"$");

        }

            List<Order> ol = new ArrayList<>();
        while (true) {
            System.out.println("Enter product name: ");
            String productName = input.getString();
            System.out.println("Enter quantity: ");
            int quantity = input.getInt();
            boolean found = false;

            for (Fruit f : fl) {
                if (f.getName().contains(productName)) {
                    found = true;
                    if (f.getQuantity() < quantity) {
                        System.out.println("Not enough quantity");
                        break;
                    }

                    boolean orderExists = false;
                    for (Order o : ol) {
                        if (o.getProductName().contains(productName)) {
                            o.setQuantity(o.getQuantity() + quantity);
                            f.setQuantity(f.getQuantity() - quantity);
                            orderExists = true;
                            break;
                        }
                    }

                    if (!orderExists) {
                        ol.add(new Order(f.getName(), quantity, f.getPrice()));
                        f.setQuantity(f.getQuantity() - quantity);
                    }

                    break;
                }
            }

            if (!found) {
                System.out.println("Invalid product");
            }

            System.out.println("Do you want to order now? (Y/N)");
            String c = input.getString();
            if (c.equalsIgnoreCase("n")) {
                break;
            } else if (!c.equalsIgnoreCase("y")) {
                System.out.println("Invalid input");
            }
        }
        System.out.println("Product | Quantity | Price | Amount");
            for(Order o : ol) {
                System.out.println(o.getProductName() + " " + o.getQuantity() + " " + o.getPrice() + "$ " + o.getPrice()*o.getQuantity());
            }
            System.out.println("Enter customer name: ");
            String name = input.getString();
            Customer c = new Customer(name);
            c.setOrders(ol);
            cl.add(c);


    }






}
