package maratonajava.introducao;

// I want to know how much I have to pay in the Netherlands 2020 based on my annual salary.
public class ExerciseAnnualTax {
    public static void main(String[] args) {
        double salary = 70000;
        double value = 0;

        if (salary <= 34712) {
            value = salary * 0.097;
        }else if (salary >= 34713 && salary <= 68507) {
            value = salary * 0.3735;
        }else if (salary >= 68508) {
            value = salary * 0.4950;
        }
        System.out.println(value);

    }
}
