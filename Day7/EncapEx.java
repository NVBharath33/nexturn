class class1{
    private String nam;
    void setname(String name){
        this.nam=name;
    }
    String getname(){
        return nam;
    }
}
public class EncapEx {
    public static void main(String[] args) {
        class1 obj=new class1();
        obj.setname("Bharath");
        System.out.println(obj.getname());
    }
 }
