public class hw6 {
    public static void main(String[] args) {


        //Task 1
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Task 2
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();


        //Task 3
        for (int i = 0; i <= 17; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();


        //Task 4
        for (int i = 10; i >= -10 ; i--) {
            System.out.println(i + " ");
        }


        //Task 5
        for (int leapYear = 1904; leapYear <= 2096 ; leapYear += 4) {
                System.out.print(leapYear + " год является високосным\n");
        }


        //Task 6
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i +" ");
        }
        System.out.println();


        //Task 7
        for (int i = 1; i < 1000; i *= 2) {
            System.out.print(i +" ");
        }
        System.out.println();


        //Task 8
        int monthlyPayment = 29000;
        int total = monthlyPayment;
        for (int month = 1; month <= 12; month++) {
            System.out.print(String.format("Месяц %d, сумма накоплений равна %d рублей\n", month, total));
            total += monthlyPayment;
        }


        //Task 9 (12% годовых)
        double monthPayment = 29000.0;
        double totalSum = 0.0;
        for (int month = 1; month <= 12; month++) {
            totalSum = totalSum + monthPayment + totalSum/100;
            System.out.print(String.format("Месяц %s, сумма накоплений равна %.2f рублей\n", month, totalSum));
        }


        //Task 10
        int number = 2;
        for (int i = 1; i <= 10 ; i++) {
            int multiplication = number * i;
            System.out.println(number + "*" + i + "=" + multiplication);
        }
    }
}
