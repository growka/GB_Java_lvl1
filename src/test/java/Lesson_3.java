import java.util.Random;
import java.util.Scanner;

public class Lesson_3 {

    public static void main(String[] args) {

        //task1();
        task2();

    }

    public static void task1() {

        //Написать программу, которая загадывает случайное число от 0 до 9, и пользователю дается 3 попытки угадать это число.
        //При каждой попытке компьютер должен сообщить больше ли указанное пользователем число чем загаданное, или меньше.
        //После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean gameOn = true;
        int randomNumber;


        while (gameOn == true) {

            randomNumber = random.nextInt(9);

            int tryCount = 1;

            while (tryCount <= 3) {


                System.out.print("Введите число: ");
                int tryNumber = scanner.nextInt();
                if (tryNumber == randomNumber) {

                    System.out.println("Вы угадали! Победа! Число попыток: " + tryCount);
                    tryCount = 5;

                } else if (tryNumber < randomNumber) {

                    System.out.println("Загаданное число больше, попробуйте ещё раз!");

                } else System.out.println("Загаданное число меньше, попробуйте ещё раз!");

                if (tryCount == 3) System.out.println("У Вас кончились попытки. Конец игры!");

                tryCount++;

            }

            System.out.println("Хотите попробовать ещё? 1 - Да, 2 - Нет");
            if (scanner.nextInt() == 2) {

                gameOn = false;

            }

        }

        scanner.close();

    }


    public static void task2() {
        //Создать массив из слов String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
        // "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
        // "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
        // сравнивает его с загаданным словом и сообщает правильно ли ответил пользователь.
        // Если слово не угадано, компьютер показывает буквы которые стоят на своих местах.
        // apple – загаданное
        //apricot - ответ игрока
        //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
        // Для сравнения двух слов посимвольно, можно пользоваться:
        //String str = "apple";
        //str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
        //Играем до тех пор, пока игрок не отгадает слово
        //Используем только маленькие буквы

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean gameOn = true;
        int trycount;
        //int randomNumber;
        //26

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String str_userWord;



        while (gameOn == true) {

            char[] hideWord = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
            char[] guessWord = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
            char[] winWord = {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'};
            int winCount = 0;

            trycount = 1;

            String guess_word = words[random.nextInt(25)];

            System.out.println("Ваша задача угадать слово (фрукт или овощ): ");

            print_array(hideWord);

            System.out.println();

            for (int i = 0; i <= guess_word.length() - 1; i++) {

                winWord[i] = guess_word.charAt(i);
                System.out.print(winWord[i]);

            }

            System.out.println();

            while (trycount <= 3) {

                System.out.println("Номер попытки: " + trycount);

                System.out.println("Введите слово: ");

                str_userWord = scanner.nextLine();

                for (int i = 0; i <= str_userWord.length() - 1; i++) {

                    guessWord[i] = str_userWord.charAt(i);;
                }

                for (int j = 0; j <= guess_word.length() - 1; j++) {

                    for (int k = 0; k <= str_userWord.length() - 1; k++) {

                        if (winWord[j] == guessWord[k]) {

                            hideWord[j] = winWord[j];
                            winCount++;

                        }

                    }

                }


                trycount++;
                System.out.println();
                print_array(hideWord);
                System.out.println();

                if (winCount == guess_word.length() & guess_word.length()==str_userWord.length()) {

                    System.out.println("Вы победили, загаданное слово: " + guess_word);
                    System.out.println();
                    trycount = 4;

                }

            }
            System.out.println("Хотите сыграть ещё раз? 1 - Да, 2 - Нет");
            if (scanner.nextInt() == 2) gameOn = false;

        }
    }

    public static void print_array(char[] array){

        for (int i=0; i<array.length; i++) System.out.print(array[i]);

    }




}
