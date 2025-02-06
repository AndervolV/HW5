public class Main {
    public static void main(String[] args) {
//Задача 1
        int clientOS = 1;
        switch (clientOS) {
            case 0:
                System.out.println("iOS");
                break;
            case 1:
                System.out.println("Android");
                break;
            default:
                System.out.println("Unknown");
        }
//Задача 2 Чтобы не плодить переменные переменная clientOS взята из первой задачи
        int clientDeviceYear = 2012;
        if (clientOS == 0) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Устоновите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Устоновите версию приложения для iOS по ссылке");
            }
        }
//Задача 3
        System.out.println("Наставник это задача не про условные операторы, а про циклы, которые мы еще будем изучать. Подождем темы про циклы и тогда будем решать задачи с подобными условиями");
//Задача 4
        int deliveryDistance = 95;
        int day = 0;
        if (deliveryDistance <= 20) {
            day += 1;
            System.out.println("Потребуется дней: " + day + " доставки.");

        } else if (deliveryDistance <= 60) {
            day += 2;
            System.out.println("Потребуется дней: " + day + " доставки.");
        } else if (deliveryDistance <= 100) {
            day += 3;
            System.out.println("Потребуется дней: " + day + " доставки.");
        } else {
            System.out.println("Свыше 100 км доставки нет.");
        }
//Задача 5
        int month = 11;
        switch (month) {
            case 1:
                System.out.println("Зима");
                break;
            case 2:
                System.out.println("Зима");
                break;
            case 3:
                System.out.printf("Весна");
                break;
            case 4:
                System.out.printf("Весна");
                break;
            case 5:
                System.out.printf("Весна");
                break;
            case 6:
                System.out.printf("Лето");
                break;
            case 7:
                System.out.println("Лето");
                break;
            case 8:
                System.out.println("Лето");
                break;
            case 9:
                System.out.printf("Осень");
                break;
            case 10:
                System.out.printf("Осень");
                break;
            case 11:
                System.out.printf("Осень");
                break;
            case 12:
                System.out.printf("Зима");
                break;
            default:
        }
    }
}