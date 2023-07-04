public class Main {
    public static void main(String[] args) {

        int clientAccount = 100; //деньги на счету клиента
        int refill = 2300; //пополнение счета
        int bonus; //бонус за пополнение счета

        if (refill > 1000) {
            bonus = (refill) / 100;
        } else {
            bonus = 0;
        }

        int newClientAccount = clientAccount + refill + bonus; //деньги на счету клиента после пополнения

        System.out.println("Было на счету: " + clientAccount);
        System.out.println("Внесено денег: " + refill);
        System.out.println("Получено бонусов: " + bonus);
        System.out.println("Теперь у Вас на счету: " + newClientAccount);
    }
}