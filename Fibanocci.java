public class Fibanocci{  
    static int n1 = 0, n2 = 1, n3 = 0;      

    static void printFibo(int count) {      
        if (count > 0) {      
            n3 = n1 + n2;      
            n1 = n2;      
            n2 = n3;      
            System.out.print(" " + n3);     
            printFibo(count - 1);  // Recursive call (decrementing count by 1 each time)
        }      
    }        

    public static void main(String[] args) {  
        int count = 15;      
        System.out.print(n1 + " " + n2); // Printing the first two numbers (0 and 1)      
        printFibo(count - 2); // Calling function with count-2 because 2 numbers are already printed     
    }  
}
