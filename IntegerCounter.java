import java.util.Scanner;
public class IntegerCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        int total = 0;
        int Newtotal = 0;
        while (num >0) {
            total = num % 10;
            Newtotal += total;
            num = num / 10;
        }
        System.out.println(Newtotal);

    }
}