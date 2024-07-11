import java.util.*;

public class numberGame {
    public static void main(String args[]) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println(randomNumber);
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true) {
            
            System.out.println("Enter Your Guess (1-100) : ");
            int n = sc.nextInt();
            count++;
            if(n == randomNumber) {
                System.out.println("Correct");
                System.out.println("It took you "+count+" tries.");
                break;
            }
            else if (n > randomNumber) {
                System.out.println("Incorrect!, The Number is lower. Guess Again!");
            }
            else {
                System.out.println("Incorrect!, The Number is higher. Guess Again!");
            }
            
        }
    }
}