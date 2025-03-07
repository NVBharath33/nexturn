package Day3;
import java.io.Console;
public class ConsoleEx{
    public static void main(String[] args){
        Console console=System.console();
        if(console==null){
            System.out.println("No console is available");
            return;
        }
        String username=console.readLine("Enter your username:");
        char[]
passwordChars = console.readPassword("Enter your password:");
        String password=new String(passwordChars);
        System.out.println("username:"+username);
        System.out.println("password entered securely!");
    }
}