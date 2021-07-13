public class Main {

    public static void main(String[] args) {
        taskOne(15, 9);
        taskTwo(8);
        taskThree(-4);
        taskFor("Java", 3);
        taskFive(2024);
    }
    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
     * в противном случае – false.
     */
    private static boolean taskOne (int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20){
            System.out.println("(true)");
            return true;
        } else {
            System.out.println("(false)");
            return false;
        }
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */
    private static void taskTwo(int a){
        if (a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положитеное");
        }
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
     */
    private static boolean taskThree(int a){
        if (a < 0){
            System.out.println("Число отрицательное (true)");
            return true;
        } else {
            System.out.println("Число положитеное (false)");
            return false;
        }
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    private static void taskFor(String str, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }

    /**
     * 5. * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */

    private static boolean taskFive(int year){
        if (year % 400 ==0){
            System.out.println("Год " + year + " високосный (true)");
            return true;
        }else if (year % 100 != 0 && year % 4 == 0){
            System.out.println("Год " + year + " високосный (true)");
            return true;
        }else {
            System.out.println("Год " + year + " не високосный (false)");
            return false;
        }

    }



}

