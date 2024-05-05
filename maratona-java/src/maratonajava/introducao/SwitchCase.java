package maratonajava.introducao;

//Prints the day of the week, considering 1 as Sunday.
public class SwitchCase {
    public static void main(String[] args) {
        byte day = 5;

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid option!");
        }

/*
        char sex = 'M';
        switch (sex) {
            case 'W':
                System.out.println("Woman");
                break;
            case 'M':
                System.out.println("Man");
                break;
            default:
                System.out.println("Invalid!!");
                break;
        }
*/
    }
}
