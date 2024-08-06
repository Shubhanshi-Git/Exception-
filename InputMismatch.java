import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        try{
            System.out.println("Enter an integer num :");
            int num = sc.nextInt();
        }
        catch( InputMismatchException e){
            System.out.println("You have entered invalid input .Please try again ");
        }

    }
}
