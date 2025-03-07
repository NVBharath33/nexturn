package Day3;

public class CommonEx {
    public static void main(String[] args){
        if(args.length<2){
            System.out.println("Enter provide your name and age:");
            return;
        }
        String name=args[0];
        int age=Integer.parseInt(args[1]);
        System.out.println("hello"+name+",you are"+age+"years old");
    }
    
}
