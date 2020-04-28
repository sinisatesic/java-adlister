import java.util.List;

// INTERFACE FOR OUR CONTACT BEAN (to be implemented by DAO)
public interface Contacts {
    // List all the contacts (List<Contact>)
    List<Contact> getContacts();

    // method for saving contacts
    // will essentially get the length of List<Contact> and +1
    long saveContact(Contact contact);

    // method for deleting contacts
    void deleteContactById(long id);

    // method for getting a contact by their ID
    Contact getContactyById(long id);
}
