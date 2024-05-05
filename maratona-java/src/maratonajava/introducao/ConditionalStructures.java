package maratonajava.introducao;

public class ConditionalStructures {
    public static void main(String[] args) {
        int age = 15;
        boolean isAuthorized = age >= 18;

        if (isAuthorized) {
            System.out.println("Authorized to purchase alcoholic beverages.");

        } else {
            System.out.println("Not authorized to buy alcoholic beverages.");
        }

/*
        boolean c = false;
        if (c == true) {
            System.out.println("Inside something that should never be done.");
        }

        // if else with more than one condition
        int years = 12;

        if (years < 15) {
            System.out.println("Children's category.");
        } else if (years >= 15 && years < 18) {
            System.out.println("Youth category.");
        }
        if (years > 18) {
            System.out.println("Adult category.");
        }
*/

    }
}
