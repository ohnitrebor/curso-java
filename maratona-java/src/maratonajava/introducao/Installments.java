package maratonajava.introducao;

public class Installments {
    public static void main(String[] args) {

        double value = 30000;

        for (int portion = 1; portion <= value; portion++) {
            double valuePortion = value / portion;
            if (valuePortion < 1000){
                break;
            }
            System.out.println("Portion "+portion+ " U$ "+valuePortion);
        }
    }
}
