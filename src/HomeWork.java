public class HomeWork {
    public static void main(String[] args) {
        byte bananas = 100;
        System.out.println("Бананов " + bananas + " кг.");
        short bananas1 = 200;
        System.out.println("Бананов " + bananas1 + " кг.");

        int A = 55000;
        System.out.println("Значение переменной A с типом int, равно " + A );
        byte B = 55;
        System.out.println("Значение переменной B с типом byte, равно " + B );
        short C = 555;
        System.out.println("Значение переменной C с типом short, равно " + C );
        float D = 3.5F;
        System.out.println("Значение переменной D с типом float, равно " + D );
        double E = 5.5;
        System.out.println("Значение переменной E с типом double, равно " + E );

        double A1 = 27.12;
        System.out.println(A1);
        long B1 = 987678965549L;
        System.out.println(B1);
        float C1 = 2.786F;
        System.out.println(C1);
        short D1 = 569;
        System.out.println(D1);
        short E1 = -159;
        System.out.println(E1);
        int F1 = 27897;
        System.out.println(F1);
        byte G1 = 67;
        System.out.println(G1);

        byte LP = 23;
        System.out.println("У Людмилы Павловны " + LP + " ученика.");
        byte AS = 27;
        System.out.println("У Анны Сергеевны " + AS + " учеников.");
        byte EA = 30;
        System.out.println("У Екатерины Андреевны " + EA + " учеников.");
        int totalStudents = LP + AS + EA;
        System.out.println("Всего " + totalStudents + " учеников.");
        short paper = 480;
        System.out.println("В наличии " + paper + " листов бумаги.");
        int studentPaper = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано " + studentPaper + " листов бумаги.");

        byte bottles2Min = 16;
        System.out.println("Производительность машины " + bottles2Min + " за 2 минуты.");
        int bottles = bottles2Min / 2;
        System.out.println("Производительность машины за 1 минуту " + bottles + " бутылок.");
        int bottles20Min = bottles * 20;
        System.out.println("За 20 минут машина произвела " +  bottles20Min + " штук бутылок.");
        int bottles1Day = bottles * 1440;
        System.out.println("За сутки машина произвела " +  bottles1Day + " штук бутылок.");
        int bottles3Day = bottles1Day * 3;
        System.out.println("За трое суток машина произвела " +  bottles3Day + " штук бутылок.");
        int bottlesMonth = bottles1Day * 30;
        System.out.println("За месяц машина произвела " +  bottlesMonth + " штук бутылок.");

        byte totalPaint = 120;
        System.out.println("Всего " + totalPaint + " банок краски.");
        byte whitePaint = 2;
        System.out.println(" На класс уходит " + whitePaint + " банки белой краски.");
        byte brownPaint = 4;
        System.out.println(" На класс уходит " + brownPaint + " банки коричневой краски.");
        int totalJar= whitePaint + brownPaint;
        System.out.println("Суммарно на один класс уходит " + totalJar + " банок краски.");
        int totalClasses = totalPaint / totalJar;
        System.out.println("Всего " + totalClasses+ " классов в школле.");
        int totalWhiteCans = totalClasses * whitePaint;
        int totalBrownCans = totalClasses * brownPaint;
        System.out.println("   В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans +
                " банок белой краски и " + totalBrownCans + " банок коричневой краски.");

        byte oneBananas = 80;
        int totalWeightBanans = oneBananas * 5;
        byte milk100 = 105;
        int totaWeightMilk = milk100 * 2;
        byte iceCream = 100;
        int totaWeighticeCream = iceCream * 2;
        byte egg = 70;
        int totaWeightEgg = egg * 4;
        int cocktailGr = totalWeightBanans + totaWeightMilk + totaWeighticeCream + totaWeightEgg;
        System.out.println("Вес спортзавтрака " + cocktailGr + " грамм.");
        float cocktailKg = cocktailGr / 1000F;
        System.out.println("Вес спортзавтра " + cocktailKg + " килограмм.");

        byte goalKg = 7;
        int goalGr = goalKg * 1000;
        short slowWeight = 250;
        short fastWeight = 500;
        int slowDays = goalGr / slowWeight;
        System.out.println( slowDays + " дней уйдет на похудание, если спортсмен будет терять по " + slowWeight +
                " грамм в день.");
        int fastDays = goalGr / fastWeight;
        System.out.println( fastDays + " дней уйдет на похудание, если спортсмен будет терять по " + fastWeight +
                " грамм в день.");
        int sumDays = slowDays + fastDays;
        int average = sumDays / 2;
        System.out.println("Среднее количество дней похудания равно " + average);

        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        int promotion = masha * 10 / 100;
        int promotionMonth = masha + promotion;
        int promotionYear = promotion * 12;
        System.out.println("Маша теперь получает " + promotionMonth +  " рублей. Годовой доход вырос на "
                + promotionYear + " рублей.");
        int promotionD = denis * 10 / 100;
        int promotionMonthD = denis + promotionD;
        int promotionYearD = promotionD * 12;
        System.out.println("Денис теперь получает " + promotionMonthD +  " рублей. Годовой доход вырос на "
                + promotionYearD + " рублей.");
        int promotionK = kristina * 10 / 100;
        int promotionMonthK = kristina + promotionK;
        int promotionYearK = promotionK * 12;
        System.out.println("Кристина теперь получает " + promotionMonthK +  " рублей. Годовой доход вырос на "
                + promotionYearK + " рублей.");
    }

}
