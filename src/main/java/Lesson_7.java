import java.util.Random;

public class Lesson_7 {

        public static void main(String[] args) {

            int foodCount = 20;
            Cat[] arrCats = new Cat[5];
            Random rand = new Random();

            for (int i = 0; i < 5; i++) {

                arrCats[i] = new Cat("Cat" + i, 10 + rand.nextInt(10), false);
                System.out.println("Cat name: " + arrCats[i].getName() + ", cat appetite: " + arrCats[i].getAppetite() + ", cat fill: " + arrCats[i].getFillCat());
            }


            Cat cat = new Cat("Barsik", 10, false);
            Plate plate = new Plate(foodCount);
            plate.info();
            plate.increaseFood(50);
         //   System.out.println(cat.getAppetite());
            cat.eat(plate);
            plate.info();
            cat.setAppetite(cat.getAppetite() - foodCount <= 0 ? 0 : cat.getAppetite() - foodCount);
         //   System.out.println(cat.getAppetite());

            for (int i = 0; i < 5; i++) {

                arrCats[i].eat(plate);

            }
        }
    }

