package creationaldesignpatterns.singleton.synchronizedway;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
    }
}
