public class Main {
    public static void main(String[] args) {

    // Задание 1
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.6F;
        double f = 7.8;
        boolean g = 9 < 10;
        char h = 11;

   // Задание 2
        double firstBoxerWeight = 78.2;
        double secondBoxerWeight = 82.7;
            double bothBoxerWeight = firstBoxerWeight + secondBoxerWeight;
                System.out.println ("Вес двух бойцов " + bothBoxerWeight + " кг");
            double weightDifference = secondBoxerWeight % firstBoxerWeight;
                System.out.println ("Разница в весах двух бойцов " + weightDifference + " кг");

   // Задание 3
        double  bananaWeightG = 80;
        double  milk100WeightG = 105;
        double  iceCreamWeightG = 100;
        double  eggWeightG = 70;
            var breakfastWeightKG = ((bananaWeightG * 5) + (milk100WeightG * 2) + (iceCreamWeightG * 2) + (eggWeightG * 4)) / 1000;
                System.out.println ("Вес завтрака " + breakfastWeightKG + " кг");

    // Задание 4
        float  weightG = 7000;
        int  bestLoseSpeed = 500;
        int  worstLoseSpeed = 250;
            var weightLoseDay1 = weightG / bestLoseSpeed;
                System.out.println ("Сброс веса по 500г займет " + weightLoseDay1 + " дней");
            var  weightLoseDay2 = weightG / worstLoseSpeed;
                System.out.println ("Сброс веса 250г займет " + weightLoseDay2 + " дней");
            var averageLoseDay = weightG / ((bestLoseSpeed + worstLoseSpeed) / 2);
                System.out.println ("Средний сброс веса 500-250г займет " + averageLoseDay + " дней");

    // Задание 5
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        var salaryMashaNew = salaryMasha * 1.1;
        var salaryDenisNew = salaryDenis * 1.1;
        var salaryKristinaNew = salaryKristina * 1.1;

        System.out.println ("Маша теперь получает " + salaryMashaNew + " рублей. " + "Годовой доход вырос на " + ((salaryMashaNew * 12)-(salaryMasha * 12))+ " рублей.");
        System.out.println ("Денис теперь получает " + salaryDenisNew + " рублей. " + "Годовой доход вырос на " + ((salaryDenisNew * 12)-(salaryDenis * 12))+ " рублей.");
        System.out.println ("Кристина теперь получает " + salaryKristinaNew + " рублей. " + "Годовой доход вырос на " + ((salaryKristinaNew * 12)-(salaryKristina * 12))+ " рублей.");
    }
}