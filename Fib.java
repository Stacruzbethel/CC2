package CC2Fin;
import java.util.Scanner;
public class Yoyoyo {
    
    
    
    public static void main(String[] args) {
        userInput();
    }
    
    
    static long fact(int a){
        if(a <= 1){
            return a;
        }
        else{
            return a * fact(a -1);
        }
    }

    static int fib(int a){
        if(a <= 1){
            return 1;
        }
        else{
            return fib(a-1)+fib(a-2);
        }
    }

    static void factIn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arsize = sc.nextInt();
        int ar[] = new int[arsize];
        for(int a = 0; a < arsize; a++){
            System.out.println("Enter elements:");
            System.out.print("Index [" + a + "]: ");
            ar[a] = sc.nextInt();
        }
       for(int a = 0; a < arsize; a++){
            System.out.print("f("+ar[a]+")\t");
            }
            System.out.print("\n");
            System.out.println("Calculated values:");
       for(int a = 0; a < arsize; a++){
            System.out.print(fact(ar[a]) + "\t");
        }
        System.out.print("\n");
    }

    static void fibIn(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int arsize = sc.nextInt();
        
        int ar[] = new int [arsize];
        
        for(int a = 0; a < ar.length; a++){
            System.out.println("Enter elements:");
            System.out.print("Index [" + a + "]: ");
            ar[a] = sc.nextInt();
        }
        for(int a = 0; a < ar.length; a++){
            System.out.print("f(" + ar[a]+")\t");
        }
        System.out.print("\n");
        System.out.println("Calculated values:");
        for(int a = 0; a < ar.length; a++){
            System.out.print(fib(ar[a])+"\t");
        }
        System.out.print("\n");
        }


    static void userInput(){
        Scanner sc = new Scanner(System.in);
        String choice;
        do{
            System.out.println("What do you wanna get? Factorial/Fibonacci?");
            choice = sc.next();
            if(("Factorial").equalsIgnoreCase(choice)){
                factIn();
                break;
            }
            if(("Fibonacci").equalsIgnoreCase(choice)){
                fibIn();
                break;
            }
        }while(!(("Factorial").equalsIgnoreCase(choice))||(!(("Fibonacci").equalsIgnoreCase(choice))));
    }
  
}

