public class Main {
    public static void main(String[] args) {
        //Задание 1

        byte clientOs = 0;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для iOs по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2

        byte clientOs2 = 1;
        int clientDeviceYear = 2022;
        if (clientOs2 == 0) {
            System.out.println("Установите версию приложения для iOs по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для iOs по ссылке");
            } else {
                System.out.println("Установите приложение для iOs по ссылке");
            }
        } else if (clientOs2 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите приложение для Android по ссылке");
            }
        }

        //Задание 3

        int year = 1904;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        //Задание 4

        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Доставка вашей карты произойдет через 1 день");
        } else if (deliveryDistance <= 60) {
            System.out.println("Доставка вашей карты произойдет через 2 дня");
        } else if (deliveryDistance <= 100) {
            System.out.println("Доставка вашей карты произойдет через 3 дня");
        } else {
            System.out.println("Доставку в ваш регион мы не производим");
        }

        //Задание 5

        byte monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("Январь - это зима");
                break;
            case 2:
                System.out.println("Февраль - это зима");
                break;
            case 3:
                System.out.println("Март - это весна");
                break;
            case 4:
                System.out.println("Апрель - это весна");
                break;
            case 5:
                System.out.println("Май - это весна");
                break;
            case 6:
                System.out.println("Июнь - это лето");
                break;
            case 7:
                System.out.println("Июль - это лето");
                break;
            case 8:
                System.out.println("Август - это лето");
                break;
            case 9:
                System.out.println("Сентябрь - это осень");
                break;
            case 10:
                System.out.println("Октябрь - это осень");
                break;
            case 11:
                System.out.println("Ноябрь - это осень");
                break;
            case 12:
                System.out.println("Декабрь - это зима");
                break;
            default:
                System.out.println("Такого месяца не сущетсвует");
        }
    }
}