package models;

import java.util.ArrayList;
import java.util.List;

public class ContactListDao implements Contacts{

    // We need a List variable to hold all the models.Contacts
    private List<Contact> contacts = new ArrayList<>();

    // List all the contacts (List<models.Contact>)
    @Override
    public List<Contact> getContacts() {
        return contacts;
    };

    // method for saving contacts
    // will essentially get the length of List<models.Contact> and +1
    @Override
    public long saveContact(Contact contact){
        // check to see if this is the first contact, and if so, add 1 (mysql index starts with 1)
        if(contact.getId() == 0){
            // if we are setting up a contact that hasn't been assigned an ID (so it must have been constructed
            //using just 'first', 'last', and 'phone' - NO id, then we want to generate an ID and
            //set it for this contact.
            contact.setId(contacts.size() + 1);
            contacts.add(contact);
        } else {
            // we already have the correct id coming from the mysql table
            // the ArrayList (contacts) with the ID that was passed in
            contacts.set((int) contact.getId(), contact);
        }
        // return the ID of the newly saved contact
        return contact.getId();
    }

    // method for deleting contacts
    @Override
    public void deleteContactById(long id){
        //void - don't need return value
            // [1] -> John Smith
            // [2] -> Dax Smith
            // [3] -> Webb Smith
            // [4] -> 1337 Smith
        // do a .remove on the passed in ID to remove that contact from ArrayList
        contacts.remove((int) id - 1); // sending the index for the ARRAY LIST

    }

    // method for getting a contact by their ID
    @Override
    public Contact getContactyById(long id){
        return contacts.get((int) id - 1);
    }

    // Let us test out our DAO to ensure everything is working properly
    public static void main(String[] args) {

        Contacts contactDao = new ContactListDao();
    }
}
