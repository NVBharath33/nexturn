package Day3;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        if(isPalindromeString(str)){
            System.out.println("The string is a palindrome");
        }else{
            System.out.println("the string is not a palindrome");
        }
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isPalindromeNumber(num)){
            System.out.println("the number is palindrome");
        }else{
            System.out.println("the number is not palindrome");
        }
        sc.close();
    }
    public static boolean isPalindromeString(String str){
        str=str.toLowerCase();
        char[] charArray=str.toCharArray();
        int left=0;int right=charArray.length-1;
        while(left<right){
            if(charArray[left]!=charArray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static boolean isPalindromeNumber(int num){
        String str=Integer.toString(num);
        char[]numArray=str.toCharArray();
        int left=0;int right=numArray.length-1;
        while(left<right){
            if(numArray[left]!=numArray[right]){
                return false;
            }
            left++;
            right--;
            }
            return true;
        }
    }
    

