
public class Main {
    public static void checkYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - не високосный год");
        }
    }
    public static void checkPhone(char clientOS, int clientDeviceYear) {
        if (clientOS == '1' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию Android по ссылке");
        }
        if (clientOS == '0' && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию iOS по ссылке");
        }
        if (clientOS == '1' && clientDeviceYear >= 2015) {
            System.out.println("Установите приложение Android по ссылке");
        }
        if (clientOS == '0' && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения iOS по ссылке");
        }
    }

    public static void checkDeliveryCard(int deliveryDistance) {
        if (deliveryDistance < 20)
            System.out.println("Потребуется дней 1");
        else if (deliveryDistance <= 60)
            System.out.println("Потребуется дней 2");
        else if (deliveryDistance <= 100)
            System.out.println("Потребуется дней 3");
        else if (deliveryDistance > 100) {
            System.out.println("Доставки нет");
        }
    }

    public static void main(String[] args) {
        checkYear(2025);
        checkPhone('1', 2025);
        checkDeliveryCard(95);
    }
}