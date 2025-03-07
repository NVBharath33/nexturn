public class MethodEx{
    public static void main(String[] args){
        int num1=15;
        int num2=33;
        int Max=findMax(num1,num2);
        System.out.println("the max number is:"+Max);
    }
    public static int findMax(int a,int b){
        if(a>b){
            return a;
        }else{
            return b;
        }
    }
}