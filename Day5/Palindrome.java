import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        if(isPalindromeString(str)){
            System.out.println("String is a palindrome");
        }else{
            System.out.println("String is not  Palindrome");
        }
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
}
