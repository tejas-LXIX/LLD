package creationaldesignpatterns.singleton.doublelocking;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
    }
}
