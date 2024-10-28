import libraries.In;
import libraries.Out;

public class ue02_2 {
    public static void main(String[] args) {
        
        Out.println("Enter a year: ");
        int year = In.readInt();

        if (year < 0) {
            Out.println("The year must be bigger than 0!");
            year = In.readInt();
        }

        Out.println("Enter a month: (number between 1-12)");
        int month = In.readInt();

        if (month < 1 || month > 12) {
            Out.println("The month must be >= 1 and <= 12!");
            month = In.readInt();
        }

        int days = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                days = 31;
                break;
            case 4, 6, 9, 11:
                days = 30;
                break;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    days = 29;
                } else {
                    days = 28;
                }
                break;
            default:
                break;
        }

        Out.println("The number of days in your month is: " + days);
    }   
}
