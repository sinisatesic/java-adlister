package models;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;


public class JDBCLecture {

    public static void main(String[] args) throws SQLException {
        // Instantiate a Config object
        Config config = new Config();

        // Set up our database driver, and make a connection
        DriverManager.registerDriver(new Driver());

        // Get a connection object
        Connection conn = DriverManager.getConnection(
                config.getUrl(),
                config.getUsername(),
                config.getPassword() //no pw in plain text
        ); // we now have a connection to our MySQL DB

        //******* Create a Statement Object *******
        Statement stmt = conn.createStatement();

        //******* Create some sort of Query *******
        // create a query string to get everything in the contacts table
        String contactsQuery = "SELECT * FROM contacts";

        ResultSet rs = stmt.executeQuery(contactsQuery);

        // display what's actually in the result set (rs) above
        while (rs.next()) {
            System.out.println(rs.getString("first_name") + " " + rs.getString("last_name") + " " + rs.getString("phone_number"));
        }

        // If we want to add a row to our database, we'll:
            // 1: Create a contact object (Bean)
            // 2: Use our DAO to add our new contact using the saveContact() method, and get the resulting ID
            // 2: Create an SQL Query to insert that Contact object into our database as a new row
            // 3: To add to our Dao - instantiate ContactListDao, and use the saveContact() method

        // this will allow us to to use the methods defined in our DAO
        Contacts clDao = DaoFactory.getContactsDao(); // this data-access-object allows us to interact with all the contacts

        // Instantiate a new Contact Object
        Contact casey = new Contact(
                "Casey",
                "Friday",
                "12344567899"
        );

        long newContactId = clDao.saveContact(casey); // id (for use in DB) of new contact
        Contact newlyCreatedContact = clDao.getContactyById(newContactId);

        // INSERT INTO contacts (first_name, last_name, phone_number) VALUES ('casey', 'friday', '1234567899');

        String addContactQuery = String.format("INSERT INTO contacts (first_name, last_name, phone_number) VALUES ('%s', '%s', '%s'",
                newlyCreatedContact.getFirstName(),
                newlyCreatedContact.getLastName(),
                newlyCreatedContact.getPhoneNumber(),
                newlyCreatedContact.getId()
        );

        System.out.println("This is the query string we'll be sending to MySQL:\n");
        System.out.println(addContactQuery);

        // NOW let's actually execute this SQL query to add th enew contact to our database
        stmt.executeUpdate(addContactQuery, Statement.RETURN_GENERATED_KEYS);

        // if we add Statement.RETURN_GENERATED_KEYS,
        // those ID's to our Contact objects here in our Java code
        long insertedRowId = 0;
        ResultSet ks = stmt.getGeneratedKeys();
        if(ks.next()) {
            insertedRowId = ks.getLong(1); // This will save the MySQL row ID to a variable
            System.out.println("The ID of the newly inserted row is: " + ks.getLong(1));
        }
        System.out.println("Before doing the MySQL id check, " + newlyCreatedContact.getFirstName() + "'s id was: " + newlyCreatedContact.getId());

        // check to see if the id was returned, or if insertedRowId is still at its default of '0'
        if(insertedRowId != 0) {
            newlyCreatedContact.setId(insertedRowId);
        }


    }
}
