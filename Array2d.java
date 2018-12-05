package array2d;
import java.util.Scanner;
public class Array2d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = sc.nextInt();
        System.out.print("Enter column size: ");
        int column = sc.nextInt();
        
        String names[][] = new String[row][column];
        
        for(int a = 0; a < row; a++){
            for(int b = 0; b < column; b++){
                System.out.print("Row " + a + " Column " + b + ": ");
                String c = sc.next();
                names[a][b] = c;
            }
        }
        
        System.out.print("\n");
        System.out.println("Entered Elements:");
        
        for(int d = 0; d < names.length; d++){
            System.out.print("Row " + d + ": " + "\t");
            for(int e = 0; e < names[d].length; e++){
                System.out.print(names[d][e] + "\t");
            }System.out.print("\n");
        }
    }
    
}
