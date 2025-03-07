public class ConstructEx{
    String str;
    int num;
    //A constructor is a special method that is used to initialize an object//
    //It automatically creates when object is called//
    //Same name as class//
    //There is no return type for constructor//
    ConstructEx(){
        //default constructor
        str="bharath";
        num=7897589;
    }
    void show(){
        System.out.println(str+"  "+num);
    }
    public static void main(String[] args){
        ConstructEx obj=new ConstructEx();
        System.out.println(obj);
        obj.show();
    }
} 