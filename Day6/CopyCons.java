public class CopyCons {
    String title;
    String author;
    double price;
    CopyCons(String a,String b,double c){
        title=a;
        author=b;
        price=c;
    }
    CopyCons(CopyCons obj){
        this.title=obj.title;
        this.author=obj.author;
        this.price=obj.price;
    }
    void show(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Price:"+price);
    }
    public static void main(String[] args){
        CopyCons obj=new CopyCons("Java Programming","James Gosling",30.5);
        CopyCons obj1=new CopyCons(obj);
        obj.show();
        obj1.show();

    }
    
}
