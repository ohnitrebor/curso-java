package maratonajava.introducao;

// Given the values from 1 to 7, print whether it is a business day or a weekend considering 1 as Sunday.
public class BusinessDay {
    public static void main(String[] args) {
        byte day = 7;

        switch (day){
            case 1:
            case 7:
                System.out.println("Weekend");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Business day");
                break;
            default:
                System.out.println("Invalid option!");
                break;
        }
    }
}
