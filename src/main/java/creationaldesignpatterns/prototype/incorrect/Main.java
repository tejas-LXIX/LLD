package creationaldesignpatterns.prototype.incorrect;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student(20,76,"Tejas");

        //creating clone of obj
        Student cloneObj = new Student();
        cloneObj.name = obj.name;
        cloneObj.age = obj.age;
//        cloneObj.rollnumber = obj.rollnumber;   //won't work because rollnumber is private.
    }
}
