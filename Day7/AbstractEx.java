abstract class Bharath{
    abstract void Study();
    //abstract dont have implementation details(methods)
}
class Student extends Bharath{
    //child class only having the implementation
    void Study(){
        System.out.println("Studying is going on");
    }
}
public class AbstractEx{
    public static void main(String[]args){
        Student obj=new Student();
        obj.Study();
    }
}