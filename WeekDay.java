import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number for weekend : ");
        int num = scan.nextInt();
        String dayName = new String();
        switch (num) {
            case 1:
                dayName = "Monday";
                break;
            
            case 2:
                dayName = "Tuesday";
                break;
            
            case 3:
                dayName = "Wednesday";
                break;
            
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                System.out.println("Invalid no b/w 1-7");
                break;
        }
        System.out.println(dayName);
        scan.close();
    }
}
