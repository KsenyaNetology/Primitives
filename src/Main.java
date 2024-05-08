public class Main {
    public static void main(String[] args) {

        int price = 8999; // стоимость билета
        int condition = 20; // количество рублей для одной бонусной милли
        int milli = price / condition; // количество начисленных миль за купленный билет

        System.out.println("Начислится милль: " + milli);
    }
}

