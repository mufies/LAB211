package Tuan6.ContactManagement;

import Test.InputData;

import java.util.List;

public class ContactView {
    public Contact inputContact()
    {
        InputData input = new InputData();
        System.out.println("Contact Information");
        System.out.println("First Name: ");
        String firstName = input.getString();
        System.out.println("Last Name: ");
        String lastName = input.getString();
        System.out.println("Group: ");
        String group = input.getString();
        System.out.println("Address: ");
        String address = input.getString();
        System.out.println("Phone: ");
        System.out.println("Please input Phone flow");
        System.out.println("• 1234567890");
        System.out.println("• 123-456-7890");
        System.out.println("• 123-456-7890 x1234");
        System.out.println("• 123-456-7890 ext1234");
        System.out.println("• 123.456.7890");
        System.out.println("• 123 456 7890");
        String phone = input.getString();
       while (!phone.matches("^(\\d{10}|\\d{3}[-.\\s]\\d{3}[-.\\s]\\d{4})(?:\\s*(?:x|ext)\\d{1,5})?$")) {
           System.out.println("Invalid phone number");
           phone = input.getString();
       }
        return new Contact(firstName, lastName, group, address, phone);
    }

    public void printContact(List<Contact> contacts)
    {
        System.out.println("Contact Information");
        System.out.println("ID - Name -First Name - Last Name - Group - Address - Phone");
        for(Contact c : contacts)
        {
            System.out.println(c.getId() + " - " + c.getFirstName() + " "+c.getLastName()    + " - "   +c.getFirstName() + " - " + c.getLastName() + " - " + c.getGroup() + " - " + c.getAddress() + " - " + c.getPhone());
        }
    }
}
