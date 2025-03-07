package Day3;

public class Q2 {
        public static void main(String[] args) {
            int num = 1;  // Start from number 1
    
            for (int i = 1; i <= 3; i++) {  // Loop for rows
                // Print spaces for alignment
                for (int j = 3; j > i; j--) {
                    System.out.print("  ");  // Print spaces
                }
    
                // Print numbers
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print(num + " ");
                    num++;  // Increase the number
                }
    
                System.out.println();  // Move to the next line
            }
        }
    }
    
    
    

