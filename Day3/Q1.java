package Day3;

public class Q1  {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {  // Outer loop for rows
            for (int j = 1; j <= i; j++) {  // Inner loop for numbers in each row
                System.out.print(j + " ");
            }
            System.out.println();  // Move to the next line after printing a row
        }
    }
}

    