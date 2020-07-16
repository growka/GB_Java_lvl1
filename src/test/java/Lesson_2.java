import com.sun.xml.internal.ws.api.model.wsdl.WSDLPortType;

public class Lesson_2 {

    public static void main(String[] args) {

        int[] task6_array = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};

        task1(); //0 0 0 1 1 1 0 0 0 1
        task2(); //0 3 6 9 12 15 18 21
        task3(); //2, 10, 6, 4, 11, 8, 10, 4, 8, 8, 9, 2
        task4(); //заполнение диагоналей
        task5(); // Массив: 1 -2 5 21 2 -15 0 16 10 5 1 Макс: 21 Мин: -15
        System.out.println(task6(task6_array));// true, индекс 4
        task7();


    }


    //Task1
    //Задать целочисленный массив, состоящий из элементов 0 и 1.
    //Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
    // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void task1() {

        int[] array = {1, 1, 1, 0, 0, 0, 1, 1, 1, 0};
        int i = 0;

        System.out.print("Задание 1: ");

        while (i <= 9) {

            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }

            System.out.print(array[i] + " ");
            i++;
        }
        System.out.println();
    }

    //Task2
    //Задать пустой целочисленный массив размером 8.
    //С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;

    public static void task2() {

        int[] array_task2 = new int[8];

        System.out.print("Задание 2: ");

        for (int i = 0; i <= 7; i++) {
            array_task2[i] = i * 3;
            System.out.print(array_task2[i] + " ");
        }
        System.out.println();
    }


    //Task3
    //Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
    // пройти по нему циклом, и числа меньшие 6 умножить на 2;

    public static void task3() {

        int[] array_task3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("Задание 3: ");

        for (int i = 0; i < array_task3.length; i++) {

            if (array_task3[i] < 6) {

                array_task3[i] = array_task3[i] * 2;
            }
            System.out.print(array_task3[i] + " ");
        }
        System.out.println();
    }

    //Task4
    //Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    // и с помощью цикла(-ов) заполнить его диагональные элементы единицами;

    public static void task4() {

        int[][] array_task5 = new int[6][6];

        System.out.print("Задание 4: ");

        for (int i = 0; i < array_task5.length; i++) {

            System.out.println();

            for (int j = 0; j < array_task5.length; j++) {

                if (i == j) {
                    array_task5[i][j] = 1;
                } else array_task5[i][j] = 0;

                array_task5[i][array_task5.length - 1 - i] = 1;

                System.out.print(array_task5[i][j]);

            }
        }
        System.out.println();
    }

    //Task5
    //Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета)

    public static void task5() {

        int[] array_task5 = {1, -2, 5, 21, 2, -15, 0, 16, 10, 5, 1};

        int arrMin = array_task5[1];
        int arrMax = array_task5[1];

        System.out.println("Задание 5: ");

        for (int i = 0; i < array_task5.length; i++) {

            if (arrMin > array_task5[i]) {

                arrMin = array_task5[i];
            }

            if (arrMax < array_task5[i]) {

                arrMax = array_task5[i];
            }
            System.out.print(array_task5[i] + " ");
        }
        System.out.print("Максимальное значение: " + arrMax + ", минимальное значение: " + arrMin);
        System.out.println();

    }

    //Task6
    //Написать метод, в который передается не пустой одномерный целочисленный массив,
    //метод должен вернуть true, если в массиве есть место,
    // в котором сумма левой и правой части массива равны.

    public static boolean task6(int[] array) {

        int checkLeft = 0;
        int checkRight;


        System.out.println("Задание 6:");


        for (int i = 0; i < array.length; i++) {

            checkLeft += array[i];
            checkRight = 0;

            for (int j = i + 1; j < array.length; j++) {

                checkRight += array[j];

            }

            if (checkLeft == checkRight) {

                System.out.println("Условие выполняется (индекс массива: " + i + ")");
                return true;

            }

        }
        return false;

    }


    //Task7
    //Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным),
    // при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично.
    // Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    // Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
    // при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.

    public static void task7() {

        System.out.println("Задание 7");
        int[] array = {2, 5, 6, 12, 0};
        int n = -1;
        int change_buffer;
        int size = array.length - 1;

        System.out.print("Исходный массив: ");

        for (int i = 0; i<=size; i++) {

            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("N = " + n);



        if (n > 0) {

            for (int i = 0; i < n; i++) {
                change_buffer = array[0];
                array[0] = array[size];

                for (int j = 1; j < size; j++) {

                    array[array.length-j] = array[array.length - j - 1];

                }

                array[1] = change_buffer;

            }

        }

        if (n < 0) {

            for (int i = 0; i > n; i--) {
                change_buffer = array[size];
                array[size] = array[0];

                for (int j = 1; j < size; j++) {

                    array[j - 1] = array[j];
                }

                array[size-1] = change_buffer;

            }
        }

        System.out.print("Результат: ");

        for (int i = 0; i<=size; i++) {

            System.out.print(array[i] + " ");
        }

    }

}





