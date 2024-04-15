package OOP.basics.methods;

class DBConnection{

    private static DBConnection instance;
    private DBConnection(){
        System.out.println("Private constructor");
    }

    public static DBConnection getInstance(){
        if(instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
    public void getFromDB(){
        System.out.println("Dane z bazy:");
    }

}

public class Singleton {
    public static void main(String[] args) {
        DBConnection connection1 = DBConnection.getInstance();
        DBConnection connection2 = DBConnection.getInstance();

        connection2.getFromDB();

        System.out.println(connection1 == connection2);
    }
}
