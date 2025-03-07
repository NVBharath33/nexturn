package Day3;
import java.util.Scanner;
public class Whileloop {
    public static void main(String[] args){
       int correctpin=1234;
       int attempts=3;
       Scanner sc=new Scanner(System.in);
       while(attempts>0){
        System.out.println("Enter the pin:");
        int enteredpin=sc.nextInt();
        if(enteredpin==correctpin){
            System.out.println("Access granted,Welcome!");
            return;
        }else{
            attempts--;
            if(attempts>0){
                System.out.println("Incorrect pin,Attempts left:"+attempts);
            }else{
                System.out.println("Too many attempts,account locked!");
            }

        }
        
      }
    }
}
