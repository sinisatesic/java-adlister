public interface Ads {
    //returns object of type "Ad"
    //searched by "id"
    Ad findById(long id);

    //below will add "Ad" into table
    long createAd(Ad ad);
}
