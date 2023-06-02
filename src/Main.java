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
    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15_000;
        int total = 0;
        int month = 0;
        int totalMoney = 2_459_000;
        while (total < totalMoney) {
            total = total + salary;
            month = month + 1;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int total = 0;
        while (total < 10) {
            total = total + 1;
            System.out.print(" " + total + " ");
        }
        System.out.println();
        for (int i = 10; i > 0; i = i - 1) {
            System.out.print(" " + i + " ");
        }
        System.out.println();
    }
    public static void task3() {
        System.out.println("Задача 3");
        int totalPopulation = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        for (int year = 0; year < 10; year++) {
            int birthDead = birthRate - mortality;
            int birthDeadTotal = totalPopulation / 1000 * birthDead;
            totalPopulation = totalPopulation + birthDeadTotal;
            System.out.println("Год " + (year + 1) + ", численность населения составляет " + totalPopulation);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        double money = 15_000.0;
        double moneyTotal = 12_000_000.0;
        int months = 0;
        double percent = 7;
        while (money < moneyTotal) {
            months++;
            money = money * (percent/100 + 1);
            System.out.printf("Месяц " + months + " сумма накоплений составляет %.2f рублей%n", money);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        double money = 15_000.0;
        double moneyTotal = 12_000_000.0;
        int months = 0;
        double percent = 7;
        while (money < moneyTotal) {
            months++;
            money = money * (percent/100 + 1);
            if (months % 6 == 0)
                System.out.printf("Месяц " + months + " сумма накоплений составляет %.2f рублей%n", money);
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        double money = 15_000.0;
        int months = 0;
        int monthTotal = 9 * 12;
        double percent = 7;
        for (int i = 0; i <= monthTotal; i++) {
            months++;
            money = money * (percent/100 + 1);
            if (months % 6 == 0)
                System.out.printf("Месяц " + months + " сумма накоплений составляет %.2f рублей%n", money);
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        int dayInMonth = 31;
        for (; friday <= dayInMonth; friday += 7) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int year = 0;
        int currentYear = 2023;
        int yearNew = currentYear + 100;
        int yearOld = currentYear - 200;
        int comet = 79;
        for (; year <= yearNew; year += comet) {
            if (year >= yearOld)
                System.out.println(year);
        }
    }
}