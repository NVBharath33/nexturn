public class RecursionEx {
    public static int Factorial(int n){
        if(n==0||n==1){
            return 1;
        }else{
            return n*Factorial(n-1);
        }
    }
    public static void main(String[] args){
        int n=5;
        int result=Factorial(n);
        System.out.println("The factorial is :"+result);
    }
    
}
