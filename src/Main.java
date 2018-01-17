
import java.util.*;

public class Main {

    public static int Rsv_fib(int x){

        if(x == 0 || x == 1) {
            return x;
        }
        else{

            return Rsv_fib(x-1) + Rsv_fib(x -2);
        }

    }
    public static int Itr_fib(int x){
        int result = 0;
        int prev = 0;
        int next=1;
        if( x == 1 ) {

            return 1;
        }

        for (int i = 1; i < x; i++){

            result=prev+next;
            prev=next;
            next=result;

        }
        return result;

    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.printf("Please enter a number: ");
        int input = in.nextInt();

        System.out.printf("%d\n", input);

        System.out.printf("Fibonacci\nRecursive version: %d\nIterative version: %d\n", Rsv_fib(input), Itr_fib(input));



    }
}
