package udovenko.practice.shop;

/**
 * Created by gladi on 05.09.2016.
 */
public class Shop {
    public static final int MAX_LIST = 100;
    private String nameShop;
    private Adress adress;
    private Goods[] listOfGoods = new Goods[MAX_LIST];
    private Storage storage = new Storage(MAX_LIST);

    public Shop(String nameShop, int index, String city, String street, int home){
        this.nameShop = nameShop;
        this.adress = new Adress(index, city, street, home);
    }

    @Override
    public String toString(){
        return "\"" + nameShop + "\", " + adress;
    }

    void addGoods(String nameGood, String typeGood, double priceGood) throws ExceptionListOfGoods{
        int indNull = Service.findNull(listOfGoods);
        if (indNull == MAX_LIST) {
            throw new ExceptionListOfGoods("List of goods is full. Delete unused goods");
        } else {
            Goods g = new Goods(nameGood, typeGood, priceGood);
            listOfGoods[indNull] = g;
        }
    }
}