package maratonajava.introducao;

//Prints the first 25 numbers of 50.
public class PrintNumbers {
    public static void main(String[] args) {

        for (int i = 0; i <= 50; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
