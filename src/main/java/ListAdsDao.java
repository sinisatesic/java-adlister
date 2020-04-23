import java.util.ArrayList;
import java.util.List;

public class ListAdsDao implements Ad {

    private List<Ad> ads;

    //constructor for this DAO:
    public ListAdsDao() {
        this.ads = new ArrayList<>();

//        Ads hammer = new Ads();
//        hammer.setId(1);
//        hammer.setTitle("A Bad Hammer");
//        hammer.setPriceInCents(3000);
//        hammer.setDescription(" A hammer");
//
//        ads.add(hammer);
    }

    @Override
    public Ad findById(long id){
        return ads.get((int)id - 1);
    }

    @Override
    public long createAd(Ad ad){
        ad.setId(ads.size()+1);

        ads.add(ad);

        return ad.getId();
    }
}
