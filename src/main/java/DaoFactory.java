//This DAO class will provide access to our Model data, but
// will not require accessing the ListProductsDao class directly
// Instead, we will reference the interface
public class DaoFactory {
    //references JUST the interface
    private static Products productsDao; //Interface

    public static Products getProductsDao() {
        if(productsDao == null) {
            productsDao = new ListProductsDao(); //this is ONLY reference to the ListProductsDao class
        }
        //if it is not null, it will return the productsDao that already exists
        //this is an instance of the ListProductsDao class
        return productsDao;
    }
}
