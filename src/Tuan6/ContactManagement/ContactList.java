package Tuan6.ContactManagement;

import java.util.ArrayList;
import java.util.List;

public class ContactList {
    List<Contact> contacts = new ArrayList<>();

    public boolean addContact(Contact contact)
    {
        contact.setId(contacts.size()+1);
        contacts.add(contact);
        return true;
    }

    public Contact findByID(int id)
    {
        for(Contact c : contacts)
        {
            if(c.getId()==id)
            {
                return c;
            }
        }
        return null;
    }

    public boolean deleteContact(int id)
    {

        for(Contact c : contacts)
        {
            if(c.getId()==id)
            {
                contacts.remove(c);
                return true;
            }
        }
        return false;
    }

    public List<Contact> getContacts()
    {
        return contacts;
    }


}
