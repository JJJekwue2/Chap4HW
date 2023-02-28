import java.util.Scanner;
public class AverageGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepLooping = true;

            int count = 1;
            double sum = 0;

            System.out.println("Enter a grade");
            double Firstgrade = input.nextDouble();

            while (keepLooping)
            {
                System.out.println("Do you want to continue entering grades? Type Y for yes and N for no");
                char ans = input.next().charAt(0);

                if (ans == 'Y') {
                    if(sum>0){
                        System.out.println("Enter a grade");
                        double SecondGrade = input.nextDouble();
                        sum += SecondGrade;
                        count++;
                    }
                    else {
                        System.out.println("Enter a grade");
                        double grade = input.nextDouble();
                        sum = Firstgrade + grade;
                        count++;
                    }
                }
                 else if (ans == 'N') {
                    keepLooping = false;
                 double UltimateAvg = sum/ count;
                   System.out.println(UltimateAvg);
                    }

                }
            }
}




