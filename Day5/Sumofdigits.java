public class Sumofdigits {
    public static int Sumdigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+Sumdigits(n/10);
    }
    public static void main(String[] args){
        int num=1561;
        int result=Sumdigits(num);
        System.out.println("Sum of digits is"+result);
    }
}
