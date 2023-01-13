public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    public static void task1(){
        System.out.println("задача 1");
        int salary = 15000;
        float total = 0;
        float percent = 0.1f;
        int i = 1;
        while (total < 2459000){
            i++;
            total = ( total + salary) * (1+ percent);

            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2(){
        System.out.println("задача 2");
        for (int i = 0 ;i < 10 ;i ++){

            System.out.printf("%3d",i);

    }
        System.out.println();


        for (int j = 10; j > 0 ;j--){
            System.out.printf("%3d",j);
        }
        System.out.println();

    }
    public static void task3(){
        System.out.println("задача 3");
        int y = 12000000;
        int year = 0;
        int peopleBorn = 17;
        int peopleDied = 8;
        int peopleDifference = 9;
        while (year <10){
            year++;
            y = y + (y * peopleDifference) / 1000;

            System.out.println("Год " + year + " численность населения составляет " + y);
        }

    }
    public static void task4(){
        System.out.println("задача 4");
        int salary = 15000;
        int month = 0;
        int total = 0;
        while (total < 12000000){
            total = total + total/100*7;
            total = total + salary;
            month++;
            System.out.println("Месяц " + month + " накоплений " + total);
        }
    }
    public static void task5(){
        System.out.println("задача 5");
        int salary = 15000;
        int month = 0;
        int total = 0;
        while (total < 12000000) {
            total = total + total /100*7;
            total = total + salary;
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + " накоплений " + total);}

            }
        }
    public static void task6(){
        System.out.println("задача 6");
        int salary = 15000;
        int month = 0;
        int total = 0;
        while (month < 108) {
            total = total + total /100*7;
            total = total + salary;
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + " накоплений " + total);}

        }

    }
    public static void task7(){
        System.out.println("задача 7");
        int friday = 6;
        while (friday < 31) {
            System.out.println("Сегодня пятница," + friday + "е число. Необходимо подготовить отчет");
            friday = friday + 7;
        }
    }
    public static void task8(){
        System.out.println("задача 8");
        int l = 2096;
        int m = l - 200;
        int j = l + 100;
        while (m<j){
            m++;
            if (m % 79 == 0) {
                System.out.println(m);
            }
        }

    }
}
