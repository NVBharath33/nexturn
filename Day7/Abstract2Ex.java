abstract class DataBase{
    abstract void connect();
    void disconnect(){
        System.out.println("disconnected");
    }
}
class Mydata extends DataBase{
    void connect(){
        //code block for connecting
        System.out.println("connected");
    }
}
public class Abstract2Ex {
    public static void main(String[] args) {
        Mydata obj=new Mydata();
        obj.connect();
    }
    
}
