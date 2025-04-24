import java.util.Scanner;
public class SumofDigit {
    public static void main(String[] args) {
        int n, sum = 0; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number sum of its digits:");
        n = sc.nextInt();
        while (n > 0) {
            sum = sum + n % 10; 
            n = n / 10;         
        }
        System.out.println("Sum of digits: " + sum);
           
    }
}

