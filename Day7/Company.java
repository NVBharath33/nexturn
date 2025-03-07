abstract class Employee{
    String Employeename;
    int Employeeid;
    Employee(String Employeename,int Employeeid){
        this.Employeename=Employeename;
        this.Employeeid=Employeeid;
    }
    abstract void calculateSalary();
    void showDetails(){
        System.out.println("Employeeid:"+Employeeid);
        System.out.println("Name:"+Employeename);
    }
}
class FulltimeEmployee extends Employee{
    FulltimeEmployee(String Employeename,int Employeeid){
        super(Employeename,Employeeid);
    }
    void calculateSalary(){
        System.out.println("Salary: 50000\n");
    }
}
class ParttimeEmployee extends Employee{
    int hoursworked;
    ParttimeEmployee(String Employeename,int Employeeid,int hoursworked){
        super(Employeename, Employeeid);
        this.hoursworked=hoursworked;
    }
    void calculateSalary(){
        int salary=hoursworked*500;
        System.out.println("Salary:"+salary+"\n");
    }
}
public class Company {
    public static void main(String[] args){
        FulltimeEmployee obj1=new FulltimeEmployee("Ramya", 101);
        obj1.showDetails();
        obj1.calculateSalary();
        ParttimeEmployee obj2=new ParttimeEmployee("sharmi", 102,20);
        obj2.showDetails();
        obj2.calculateSalary();
    }
    
}
