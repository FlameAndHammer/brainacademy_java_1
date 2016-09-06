package udovenko.practice;

import java.util.Arrays;

/**
 * Created by gladi on 05.09.2016.
 */
public class Shop {
    private String nameShop;
    private Adress adress;
    private Goods[] listOfGoods;
    private Storage storage;

    public Shop(String nameShop, int index, String city, String street, int home, int quantityGoods){
        this.nameShop = nameShop;
        this.adress = new Adress(index, city, street, home);
        this.listOfGoods = new Goods[quantityGoods];
        this.storage = new Storage(quantityGoods);
    }

    public void createGood(String nameGood, String typeGood, double priceGood){
        try {
            if (searchListOfGoods(nameGood).length != 0){
                throw new ExceptionListOfGoods("Goods list already contains this item");
            }
            if (Goods.getCounterGoods() >= listOfGoods.length){
                throw new ExceptionListOfGoods("List of goods is fool");
            }
            Goods good = new Goods(nameGood, typeGood, priceGood);
            listOfGoods[good.getIdGood()] = good;
        }catch (ExceptionListOfGoods elg){
            elg.getMessage();
        }
    }

    //Search goods by name
   private int[] searchGoods(String name, Object[] array) throws IllegalArgumentException{
       int[] foundIndex;
       if (name.matches("\\p{Alpha}{2}\\p{Alpha}+")){
           int lengthArray = array.length;
           String[] arNameGoods = new String[lengthArray];
           if (array instanceof Goods[]){
               Goods[] goods = new Goods[lengthArray];
               for (int i = 0; i < lengthArray; i++){
                   goods[i] = (Goods) array[i];
                   arNameGoods[i] = goods[i].getNameGood();
               }
           }
           if (array instanceof CountGoods[]){
               CountGoods[] goods = new CountGoods[lengthArray];
               for (int i = 0; i < lengthArray; i++){
                   goods[i] = (CountGoods)array[i];
                   arNameGoods[i] = goods[i].getGoods().getNameGood();
               }
           }
           String nameLow = name.toLowerCase();
           int countFind = 0;
           for (String e: arNameGoods){
               if (e.toLowerCase().contains(nameLow)){
                   countFind++;
               }
           }
           foundIndex = new int[countFind];
           int index = 0;
           for (int i = 0; i < lengthArray; i++){
               if (arNameGoods[i].toLowerCase().contains(nameLow)){
                   foundIndex[index] = i;
                   index++;
               }
           }
       }else {
           throw new IllegalArgumentException("The request must have minimum of three letters");
       }
       return foundIndex;
   }

    //Search in the list of goods
    private Goods[] searchListOfGoods(String name) throws IllegalArgumentException{
        int[] found = searchGoods(name, listOfGoods);
        Goods[] foundGoods = new Goods[found.length];
        int index = 0;
        for (int e: found){
            foundGoods[index] = listOfGoods[e];
            index++;
        }
        return foundGoods;
    }

    //search in the Storage
    private FoundCountGoods[] searchInStorage(String name) throws IllegalArgumentException{
        int[] found = searchGoods(name, storage.getListStorage());
        FoundCountGoods[] foundGoods = new FoundCountGoods[found.length];
        int index = 0;
        for (int e: found){
            foundGoods[index] = new FoundCountGoods(storage.getListStorage()[e], e);
            index++;
        }
        return foundGoods;
    }

    //take to the warehouse
    public void takeGoodsWarehouse(String nameGood, int count){
        Goods[] foundGoods;         //TODO: Displays a list on the screen and selecting the desired
        try {
            foundGoods = searchListOfGoods(nameGood);
            if (foundGoods.length == 0) {
                throw new ExceptionListOfGoods("Must create a product");
            }
        }catch (IllegalArgumentException | ExceptionListOfGoods ex) {
            ex.getMessage();
            return;
        }
        FoundCountGoods[] foundCountGoods = searchInStorage(nameGood);
        if (foundCountGoods.length != 0){
            int old = storage.getListStorage()[foundCountGoods[0].getIndex()].getCountOfGoods();
            storage.getListStorage()[foundCountGoods[0].getIndex()].setCountOfGoods(old + count);
        }else {
            CountGoods countGoods = new CountGoods(foundGoods[0], count);
            storage.addGoodsStorage(countGoods);
        }
    }

    //write off warehouse
    public void writeOffStorage(String nameGood, int count){
        FoundCountGoods[] foundCountGoodses;  //TODO: Displays a list on the screen and selecting the desired
        try {
            foundCountGoodses = searchInStorage(nameGood);
            if (foundCountGoodses.length == 0){
                throw new ExceptionListOfGoods("Good is not");
            }
            if (foundCountGoodses[0].getCountGoods().getCountOfGoods() < count){
                throw new ExceptionListOfGoods("Good out of stock");
            }
        }catch (IllegalArgumentException | ExceptionListOfGoods ex) {
            ex.getMessage();
            return;
        }
        int old = storage.getListStorage()[foundCountGoodses[0].getIndex()].getCountOfGoods();
        storage.getListStorage()[foundCountGoodses[0].getIndex()].setCountOfGoods(old - count);
    }
}