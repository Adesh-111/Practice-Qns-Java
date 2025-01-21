import java.util.Scanner;

public class CountInteger {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number : ");
        int n = scan.nextInt();
        int temp;
        while(n >0){
            temp = n%10;
            n /= 10;
            count++;
        }
        System.out.println("The count of the digits in the number is "+ count);
    }
}