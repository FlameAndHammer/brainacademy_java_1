package shevchenko.homework_jdbc;

/**
 * Created by ПК on 04.11.2016.
 */
class Main {
    public static void main(String[] argv){
        String password = "????";
        ConectDataBase.getInstConectDB().connectToDataBase(password); //Enter password for conect DataBase
        UserGI.getInstUserGI().mainMenu();
    }
}
