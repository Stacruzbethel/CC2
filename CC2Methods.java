
package cc2methods;
import java.util.Scanner;

public class CC2Methods {

    static long rec(int f){
        if(f == 0 || f == 1){
            return f;
        }
        else{
            return rec(f-1)+rec(f-2);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        
        for(int b = 0; b<=a; b++){
            System.out.print("f("+b+")" +"\t");
        }
        System.out.println("");
        
        for(int b=0; b<=a; b++){
            for(int c = 0; c<=b; c++){
                System.out.print(rec(c)+"\t");
            }
            System.out.println("");
        }
        
    }
    
    
}
