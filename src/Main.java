public class Main {
    public static void main(String[] args) {

        System.out.println("homework7!");

    //1
        int total = 0;
        int month = 0;
        while (total <= 2_459_000) {
            total = total + total/100;
            total = total + 15000;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рубдей.");
        }

        //2

        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        for (int j = 10; j > 0; j--) {
            System.out.print(j);
        }
        System.out.println();

        //3

        int population = 12_000_000;
        int birthRate = 17;
        int mortalitiRate = 8;


        for (int year = 1; year <= 10; year++) {
            int births = birthRate * population / 1000;
            int deaths = mortalitiRate * population / 1000;
            int growth = births - deaths;
            population += growth;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        //4

        double initialDeposit = 15000.0;
        double targetAmout = 12000000.0;
        double currentAmount = initialDeposit;
        int months = 0;

        while (currentAmount < targetAmout) {
            months++;
            currentAmount *= 1.07;
            System.out.printf("Месяц %d: сумма накоплений составляет %.2f рублей%n", months, currentAmount);
        }
        System.out.printf("Через %d месяцев Василий накопит %.2f рублей", months, currentAmount);

        //5

        double initialDeposit1 = 15000.0;
        double targetAmout1 = 12000000.0;
        double currentAmount1 = initialDeposit1;
        int months1 = 0;

        while (currentAmount1 < targetAmout) {
            months1++;
            currentAmount1 *= 1.07;
            if (months1 % 6 == 0) {
                System.out.printf("Month %d: %.2f\n", months1, currentAmount1);
            }
        }

        //6

        double budget = 15_000;
        int yearsToSaveMoney = 9;
        int monthsToSaveMoney = yearsToSaveMoney * 12;
        for (int counter = 1; counter <= monthsToSaveMoney; counter++) {
            budget *= 1.07;
            if (counter % 6 == 0) {
                System.out.printf("Месяц номер %d, текущая сумма накоплений равна %.2f\n", counter, budget);
            }
        }

        //7
        {
            int firstFriday = 5;
            int daysInMonth = 31;
            for (int c = firstFriday; c <= daysInMonth; c += 7) {
                System.out.println("Сегодня пятница, " + c + "-e число. Необходимо подготовить отчет");
            }
        }

        //8

        int ourYear = 2024;
        int twoHundredYearBefore = ourYear - 200;
        int oneHundredYearAfter = ourYear + 100;
        int cometAppearance = 0;
        int cometAppearanceRate = 79;
        while (cometAppearance < oneHundredYearAfter) {
            if (cometAppearance > twoHundredYearBefore) {
                System.out.println(cometAppearance);
            }
            cometAppearance += cometAppearanceRate;
        }
    }
}