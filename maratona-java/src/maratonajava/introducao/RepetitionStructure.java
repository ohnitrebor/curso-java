package maratonajava.introducao;

// while, do while, for
public class RepetitionStructure {
    public static void main(String[] args) {
        int count = 0;

        while (count < 10) {
            System.out.println(++count);
        }

/*
        count = 0;
        do {
            System.out.println(++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
*/

    }
}
