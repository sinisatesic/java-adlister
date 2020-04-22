import java.util.ArrayList;
import java.util.List;

// This is our DAO (Data Access Object, or data access class)
public class ListProductsDao implements Products {
    // list all the products, find a product by ID, create a product
    private List<Product> products;

    // Constructor for this DAO class
    public ListProductsDao() {
        this.products = new ArrayList<>();
        // add some dummy data
        Product hammer = new Product();
        hammer.setId(1);
        hammer.setTitle("A Bad Hammer");
        hammer.setPriceInCents(3000);
        hammer.setDescription(" A hammer");

        products.add(hammer);

        Product xbox = new Product();
        xbox.setId(2);
        xbox.setTitle("Xboxzzzz");
        xbox.setPriceInCents(50000);
        xbox.setDescription("dis xbox");

        products.add(xbox);

        Product chiaPet = new Product();
        chiaPet.setId(3);
        chiaPet.setTitle("ChiaPetzzzz");
        chiaPet.setPriceInCents(10000);
        chiaPet.setDescription("Cha cha cha Chia!");

        products.add(chiaPet);
    }

    //Implement our interface requirements (from Products.java)
    @Override
    public Product findById(long id) {
        // We want to return the 'Product' object for the ID passed in
        // This will return the full row in the database
        //i.e. id | title | priceInCents | description (the full row in database)
        return products.get((int)id - 1); // subtracting 1 because of zero index in Java
    }

    @Override
    public long createProduct(Product product) {
        // Create a product and insert to tour ArrayList (eventually, the database)
        // assign an ID
        product.setId(products.size()+1); // same as auto_increment
        //this id will always be unique (creates new id when new product inserted)

        products.add(product); // when we call the createProduct method,
                                // we are sending in a 'Product' type object
                                // this will add that project to the ArrayList
        return product.getId();
    }

}
