class Student{
    void speak(){
        System.out.println("yes students are public speakers");
    }
}
class Teacher extends Student{
    void teach(){
        System.out.println("yes they are teachers");
    }
}
public class InheritanceEx {
    public static void main(String[] args) {
        Teacher obj=new Teacher();
        obj.speak();
    }
}
