public class Main {
    public static void main(String[] args) {
        System.out.println(goodDay(18, 30));
        System.out.println(goodDay(44, 0));
        System.out.println(goodDay(6, 24));
        System.out.println(goodDay(22, 30));
        System.out.println(goodDay(16, 15));
    }


    public static String goodDay(int age, int temperature) {
        if (age >= 20 && age >= 45 && temperature >= -20 && temperature >= 30) {
            return "Можно идти гулять";
        } else if (age <= 20 && temperature <= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age >= 45 && temperature >= -10 && temperature >= 25) {
            return "Можно идти гулять";
        } else {
            return "Оствайся дома";
        }
    }
}
