package creationaldesignpatterns.prototype.correct;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(20,76,"Tejas");

        //creating clone of obj. client doesn't need to know about all the fields. so, it's not tightly coupled.
        Student cloneObj = (Student) obj.clone();
    }
}
