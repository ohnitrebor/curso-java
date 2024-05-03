package maratonajava.introducao;
/*
 Create variables for the fields described below between <> and print the following message:
 I <name>, living at address <>, confirm that I received the <salary> on the date <date>
*/

public class PrimitiveTypesExercise {
    public static void main(String[] args) {

        String name = "Charlie";
        String address = "Road Wall Street";
        double salary = 5466.78;
        String date = "02/05/2024";
        String report = "I "+name+", living at address "+address+", confirm that I received "+salary+", on the date "+date+".";

        System.out.println(report);

    }
}
