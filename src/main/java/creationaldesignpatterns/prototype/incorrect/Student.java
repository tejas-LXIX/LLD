package creationaldesignpatterns.prototype.incorrect;

public class Student {
    int age;
    private int rollnumber;
    String name;

    public Student() {
    }

    public Student(int age, int rollnumber, String name) {
        this.age = age;
        this.rollnumber = rollnumber;
        this.name = name;
    }
}
