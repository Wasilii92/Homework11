import java.time.LocalDate;

public class Main {
    public static void checkLeafYear  (int year){
if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
    System.out.println(year+" год - високосный год");
}else{System.out.println(year+" год - не високосный год");
}
    }
    public static void checkPhone(char clientOS,int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOS == '1' && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию Android по ссылке");
        }
        if (clientOS == '0' && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию iOS по ссылке");
        }
        if (clientOS == '1' && clientDeviceYear >= currentYear) {
            System.out.println("Установите приложение Android по ссылке");
        }
        if (clientOS == '0' && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения iOS по ссылке");
        }
    }
public static int checkDeliveryCard(int deliveryDistance){
        int time=0;
    if (deliveryDistance < 20)
        System.out.println("Потребуется дней " + (time = 1));
    else if (deliveryDistance <= 60)
        System.out.println("Потребуется дней " + (time = time + 1));
    else if (deliveryDistance <= 100)
        System.out.println("Потребуется дней " + (time = time + 2));
    else if (deliveryDistance > 100) {
        System.out.println("Доставки нет");
    }
    return time;
}
    public static void main(String[] args) {
checkLeafYear(2024);
checkPhone('1',2025);
checkDeliveryCard(95);
    }
}