package lesson_2.ITC_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Beverage drink1 = new Beverage("Sprite", 55, 0.33f);
        Beverage drink2 = new Beverage("Coca-cola", 50, 0.33f);
        Beverage drink3 = new Beverage("Fanta", 65, 0.5f);
        Beverage drink4 = new Beverage("7UP", 55, 0.33f);
        Beverage drink5 = new Beverage("Moutain Dew", 55, 0.5f);
        Beverage drink6 = new Beverage("Sprite", 55, 0.33f);
        Beverage drink7 = new Beverage("Pepsi", 75, 0.5f);
        Beverage drink8 = new Beverage("Burn", 87, 0.33f);
        Beverage drink9 = new Beverage("Red Bull", 105, 0.5f);
        Beverage drink10 = new Beverage("BonAqua", 40, 0.5f);

        Beverage[] beverages = new Beverage[]{drink1, drink2, drink3, drink4, drink5, drink6, drink7, drink8, drink9, drink10};

        int balance = 0;
        while (true) {
            if (balance != 0) {
                System.out.println("Ваш баланс: " + balance + " руб. Чтобы забрать сдачу, введите 1, либо любое число, чтобы продолжить");
                int answer = scanner.nextInt();
                if (answer == 1) {
                    System.out.println("Заберите сдачу");
                    System.out.println(balance + " рубчиков");
                    break;
                }
            }
            for (int i = 0; i < beverages.length; i++) {
                System.out.println("№ " + (i + 1) + ". Напиток: " + beverages[i].getName() + " Цена: " + beverages[i].getPrice() + " руб. Объем: " + beverages[i].getVolume() + " л " + "Остаток " + beverages[i].getCount());
            }
            System.out.print("\nВведите номер напитка или введите 0 для выхода из программы: ");
            int number = scanner.nextInt();

            if (number == 0) break;

            if (number > beverages.length || number < 1) {
                System.out.println("Такого номера напитка нет\n");
                continue;
            } else
                System.out.println("Вы выбрали напиток " + number + ", его цена: " + beverages[number - 1].getPrice() + " руб");

            if (beverages[number - 1].getCount() <= 0) {
                System.out.println("Напиток закончился\n");
                continue;
            }

            System.out.print("Ваш баланс равен: " + balance + " руб. Пополните баланс: ");
            balance += scanner.nextInt();

            if (balance >= beverages[number - 1].getPrice()) {
                System.out.println("Возьмите ваш напиток\n");
                beverages[number - 1].setCount(beverages[number - 1].getCount() - 1);
                balance -= beverages[number - 1].getPrice();
            } else {
                System.out.println("Недостаточно средств\n");
                continue;
            }
        }
    }
}
