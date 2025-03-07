public class BankAccount {
    String Accountholder;
    int Accountnumber;
    double balance;
    BankAccount(String a,int b,double c){
        Accountholder=a;
        Accountnumber=b;
        balance=c;
    }
    void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Depositing $"+amount+"....");
            System.out.println("New Balance: $"+balance);
        }else{
            System.out.println("Invalid Deposit!");
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount <=balance){
            balance-=amount;
            System.out.println("Withdrawn $"+amount+"....");
            System.out.println("New Balance:$"+balance);
        }else{
            System.out.println("Invalid amount");
        }
    }
    void show(){
        System.out.println("Accountholder:"+Accountholder);
        System.out.println("Accountnumber:"+Accountnumber);
        System.out.println("balance: $ "+balance);
        System.out.println();
    }
    public static void main(String[] args){
        BankAccount obj=new BankAccount("Sharmila",123,5000.0);
        obj.show();
        obj.deposit(1500);
        System.out.println();
        obj.withdraw(2000);
        System.out.println();
        obj.show();
    }
}
