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
        while (total < 2459000) {
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
            System.out.print( " " + total + " ");
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
        int birthDead = birthRate - mortality;
        int birthDeadTotal = totalPopulation / 1000 * birthDead;
        for (int i =0; i<10; i++) {
            totalPopulation = totalPopulation + birthDeadTotal;
            System.out.println("Год " + (i+1) + ", численность населения составляет " + totalPopulation);
        }
    }

        public static void task4 () {
            System.out.println("Задача 4");
            double money = 15_000.0;
            double moneyTotal = 12_000_000.0;
            int months = 0;
            while (money < moneyTotal) {
                months++;
                money = money * 1.07;
                System.out.printf("Месяц " + months + " сумма накоплений составляет %.2f рублей%n", money);
            }
        }

        public static void task5 () {
            System.out.println("Задача 5");
            double money = 15_000.0;
            double moneyTotal = 12_000_000.0;
            int months = 0;
            while (money < moneyTotal) {
                months++;
                money = money * 1.07;
                if (months % 6 == 0)
                    System.out.printf("Месяц " + months + " сумма накоплений составляет %.2f рублей%n", money);
            }
            System.out.println(money);
        }

        public static void task6 () {
            System.out.println("Задача 6");
            double money = 15_000.0;
            int months = 0;
            int monthTotal = 9 * 12;
            for (int i = 0; i <= monthTotal; i++) {
                months++;
                money = money * 1.07;
                if (months % 6 == 0)
                    System.out.printf("Месяц " + months + " сумма накоплений составляет %.2f рублей%n", money);
            }
        }

        public static void task7 () {
            System.out.println("Задача 7");
            int friday = 1;
            for (int day = 1; day <= 31; day++) {
            if (day == friday  || ( day - friday) % 7 == 0)
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }

        }
        public static void task8 () {
            System.out.println("Задача 8");
            int year = 0;
            int yearNew = 2123;
            int yearOld = 1823;
            for (int i = 0; i <= yearNew; i++) {
                year++;
                if (year % 79 == 0 && year >= yearOld && year <= yearNew)
                    System.out.println(year);
            }

            }
        }




