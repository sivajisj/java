import java.nio.channels.NonWritableChannelException;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println("enter num of iterations: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        for ( int i = 0; i< number; i++){
            System.out.println("Being SJ is not EASY",i);
            System.out.println();
        }

    }
    
}
