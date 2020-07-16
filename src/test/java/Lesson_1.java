public class Lesson_1 { //task1

    // Task2

    byte b = 2;
    short s = 2000;
    int i = 50000;
    long l = 500000L;
    float f = 10.1f;
    double d = 20.2;
    char c = '\u0144';
    boolean boo = true;

    public static void main(String[] args) {

        System.out.println(task3(10.1f, 10.2f, 10.3f, 10.4f)); //task3:113.022
        System.out.println(task4(10.1, 9.8)); //task4:true
        task5(10); //task5: положительное
        System.out.println(task6(-2)); //task6: true
        task7("Сергей"); // Привет, Сергей!
        task8(2020); //Год високосный
    }

    public static float task3(float a3, float b3, float c3, float d3) {

        return a3 * (b3 + (c3 / d3));

    }

    public static boolean task4(double a4, double b4) {

        return (a4 + b4) >= 10 & (a4 + b4) <= 20;
    }

    public static void task5(int a5) {

        if (a5 >= 0) {

            System.out.println("Число положительное.");
        } else {

            System.out.println("Число отрицательное.");
        }

    }

    public static boolean task6(int a6) {

        return (a6 < 0);
    }

    public static void task7(String name) {

        System.out.println("Привет, " + name + "!");
    }

    public static void task8(int year) {

        if ((year % 400 == 0) || (year % 100 != 0) & (year % 4 == 0)) {

            System.out.println("Год високосный");
        } else {

            System.out.println("Год не високосный");
        }

    }

}
