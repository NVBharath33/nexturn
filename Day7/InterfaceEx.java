//public
interface Student{
    //automatically public static final
    int num=10;
    //take it as final int
    void speak();
    //abstract method
}
class Trainer implements Student{
    public void speak(){
        System.out.println("Yes they are public speakers");
    }
}
public class InterfaceEx {
    public static void main(String[]args){
        Trainer obj=new Trainer();
        obj.speak();
        System.out.println("number: "+Student.num);
    }
}
