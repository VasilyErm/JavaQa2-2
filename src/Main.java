public class Main {
    public static void main(String[] args) {
        int wallet = 460;
        int amount = 1500;
        int bonus;

        if (amount >= 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("На вашем счету было: " + wallet + " рублей.");
        System.out.println("Ваш счет пополнен на: " + amount +" рублей.");
        System.out.println("Вам зачисленно: " + bonus + " бонусных рублей");
        System.out.println("Ваш баланс: " + (wallet + amount + bonus) + " рублей.");
    }
}
