public class ParameterizedCons {
    String str;
    int num;
    //A constructor is a special method that is used to initialize an object//
    //It automatically creates when object is called//
    //Same name as class//
    //There is no return type for constructor//
    ParameterizedCons(){
        //default constructor
        str="bharath";
        num=7897589;
    }//
    ParameterizedCons(String a,int b){
        str= a;
        num=b;
    }
    void show(){
        System.out.println(str+"  "+num);
    }
    public static void main(String[] args){
        ParameterizedCons obj=new ParameterizedCons();
        ParameterizedCons obj1=new ParameterizedCons("suma",135);
        System.out.println(obj);
        obj.show();
        obj1.show();
    }
}
 
    

