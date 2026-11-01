//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Task 1
        System.out.println("task 1");
        int firstFriday = 4;
        for (int day = 1; day <= 31; day++) {
            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println("Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет");
            }
        }
        //Task 2
        System.out.println("task 2");
        int distance = 0;
        int marathonDistance = 42195;
        do {
            distance += 500;
            if (distance <= marathonDistance) {
                System.out.println("Держись! Осталось " + (marathonDistance - distance) + " метров");
            }

        } while (distance < marathonDistance);
        System.out.println("task 2");
        for (int dist = 500; dist <= marathonDistance; dist += 500) {
            System.out.println("Держись! Осталось " + (marathonDistance - dist) + " метров");
        }
        //Task 3
        System.out.println("task 3");
        int budget = 1000;
        int dayCount = 0;
        while (budget > 0) {
            dayCount++;
            if (dayCount % 5 == 0) {
                continue;
            }
            budget -= 100;
        }
        System.out.println("Бюджета хватит на " + dayCount + " дней");

        System.out.println("task 3");
        int budget2 = 1000;
        int dayCount2 = 0;
        for (int d = 1; budget2 > 0; d++) {
            dayCount2++;
            if (d % 5 == 0) {
                continue;
            }
            budget2 -= 100;
            System.out.println("Бюджета хватит на " + dayCount2 + " дней");
        }

        //Task 4
        System.out.println("task 4");
        int month = 0;
        double total = 0;
        double target = 12000000;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.printf("Месяц %d, сумма накоплений: %.2f рублей%n", month, total);
            if (total >= target) {
                break;
            }
        }

            //Task 5
            System.out.println("task 5");
            int charge = 20;
            int minute = 0;
            int overheats = 0;
            while (charge < 100 && overheats < 3) {
                minute++;
                if (minute % 10 == 0) {
                    overheats++;
                    System.out.println("Перегрев на " + minute + "-й минуте! Зарядка преостановлена на 2 минуты.");
                    if (overheats == 3) {
                        System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
                        break;
                    }
                    minute += 2;
                    continue;
                }
                charge += 2;
            }
            System.out.println("Время зарядки составило " + minute + " минут");


        }
    }



