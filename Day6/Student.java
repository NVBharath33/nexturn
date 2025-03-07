public class Student {
    String name;
    char grade;
    int rollnumber;
    Student(String a,char b,int c){
        name=a;
        grade=b;
        rollnumber=c;
    }
    void show(){
        System.out.println("Name:"+name);
        System.out.println("Roll number:"+rollnumber);
        System.out.println("Grade:"+grade);
    }
    public static void main(String[] args){
        Student obj=new Student("Ramya ",'A',156);
        obj.show();
    }
}
