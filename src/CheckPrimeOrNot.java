import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Please enter a number ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int count=0;
        for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count==2) {
                System.out.println("This is prime");

            }else{
                System.out.println("This is not Prime");
            }
        }
    }

