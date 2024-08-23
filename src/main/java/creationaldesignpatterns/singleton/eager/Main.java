package creationaldesignpatterns.singleton.eager;

public class Main {
    public static void main(String[] args) {
        DBConnection connObject = DBConnection.getInstance();
    }
}
