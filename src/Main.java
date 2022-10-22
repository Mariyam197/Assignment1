import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int priceTicket = 5_890; // стоимость билета
        int milePerAmount = 20; // количество рублей для одной мили

        int miles = priceTicket / milePerAmount * 1; // расчет миль

        System.out.println("Количество миль: " + miles);

    }
}
