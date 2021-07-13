public class Main {

    public static void main(String[] args) {
        taskOne(15, 9);
        taskTwo(8);
        taskThree(-4);
        taskFour("Java", 3);
        taskFive(2024);
    }


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


    private static void taskTwo(int a){
        if (a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положитеное");
        }
    }


    private static boolean taskThree(int a){
        if (a < 0){
            System.out.println("Число отрицательное (true)");
            return true;
        } else {
            System.out.println("Число положитеное (false)");
            return false;
        }
    }


    private static void taskFour(String str, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(str);
        }
    }


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

