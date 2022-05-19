public class Main {
    public static void main(String[] args) {
        int check = 500;
        int pay = 1000;
        int bonus = pay / 100;
        if (pay > 1000) {
            bonus = pay / 100;
        } else {
            bonus = 0;
        }
        int finalcheck = check + pay + bonus;
        System.out.println("Итого получено бонусов: " + bonus);
        System.out.println("Итого сумма на счете: " + finalcheck);
    }
}
