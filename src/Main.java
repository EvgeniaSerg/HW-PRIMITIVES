public class Main {
    public static void main(String[] args) {

        int amount = 5653; // стоимость билета
        int condition = 20; // количество рублей для одной бонусной мили
        int mili = amount / condition; // 

        System.out.println("Начислится миль: " + mili);

    }
}
