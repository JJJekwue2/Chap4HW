import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number that is not a decimal");
        int ans = input.nextInt();
        if (ans == 3 || ans == 2) {
            System.out.println(ans + "is a prime number");
        } else if (ans <= 1) {
            System.out.println(ans + "is not a prime number");
        } else if (0 == ans % 2 || 0 == ans % 5) {
            System.out.println(ans + "is not a prime number");
        } else if (ans % 7 == 0) {
            int SevenAns = ans;
            while (SevenAns % 7 == 0) {
                int NewAns = SevenAns / 10;
                SevenAns -= NewAns * NewAns;
            }
            System.out.println(ans + "is not a prime number");
        } else if(ans % 3==0){
            int ThreeAns = ans;
            int TotalAns = 0;
            while(ThreeAns > 0)
            {
              ThreeAns = ThreeAns %10;
              ThreeAns = ThreeAns / 10;
              TotalAns += ThreeAns;
            }
            System.out.println(ans + "is not a prime number");

        } else if
            (ans % 11 == 0 || ans % 13 == 0) {
            System.out.println(ans + "is not a prime number");
        }
        else if (ans == 13 || ans ==11){
            System.out.println(ans + "is a prime number");

        }
        else{
            System.out.println(ans + "is a prime number");
        }
    }
}



