package lab;

import java.util.Scanner;

public class _12pattern {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows (half of the diamond): ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2*i -1; j++) {
                System.out.print("*");
                
            }
            
            System.out.println("");
        }
        for (int i = rows-1; i > 0; i--) {
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

}

