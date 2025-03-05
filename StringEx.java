package Day3;

public class StringEx {
    public static void main(String[] args){
        StringBuilder name=new StringBuilder("Bharath");
        name.append("  "+"Welcome!");
        System.out.println(name);
        StringBuffer name1=new StringBuffer("hello welcome");
        name1.append("  "+"bharath");
        System.out.println(name1);
    }
    
}
