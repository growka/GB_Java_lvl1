import java.util.Random;


public class Lesson_6 {

    public static void main(String[] args) {

        Cat cat = new Cat("Васька");
        Dog dog = new Dog("Шарик");

        cat.animalInfo();
        dog.animalInfo();

        cat.run(500); //false
        cat.run(100); //true
        cat.jump_over(1); //true
        cat.jump_over(5); //false
        cat.swim(5); ///false
        cat.swim(10); ///false


        dog.run(1000); //false
        dog.run(300); //true
        dog.jump_over(1); //true
        dog.jump_over(5); //false
        dog.swim(5); //true
        dog.swim(20); //false

    }


    public static class Animal {

        String name;
        String kind;
        int maxRun;
        int maxSwim;
        double maxJump;
        public Random random = new Random();

        public Animal() {
        }

        public Animal(String name) {
            this.name = name;
        }

        public void animalInfo() {
            System.out.println("Животное " + this.kind + " " + this.name);
        }

        public void run(int distance) {
            if (this.maxRun >= distance) {

                System.out.println(this.kind + " " + this.name + " бежит " + distance + " м.");
            } else {

                System.out.println(this.kind + " " + this.name + " не может столько бежать");

            }
        }

        public void swim(int distance) {
            if (this.maxSwim >= distance) {

                System.out.println(this.kind + " " + this.name + " плывет " + distance + " м.");
            } else {

                System.out.println(this.kind + " " + this.name + " не может так далеко плыть");

            }
        }

        public void jump_over(int distance) {
            if (this.maxJump >= distance) {

                System.out.println(this.kind + " " + this.name + " перепрыгивает препятствие в " + distance + " м.");
            } else {

                System.out.println(this.kind + " " + this.name + " не может так высоко прыгать.");

            }
        }

    }

    public static class Cat extends Animal {

        public Cat(String name) {
            super(name);
            this.kind = "Кошка";
            this.maxJump = random.nextDouble() + 1;;
            this.maxRun = random.nextInt(100)+100;
            //   this.maxSwim = 0;
        }

        @Override
        public void swim(int distance) {
            System.out.println("Кошки не плавают!");;
        }
    }

    public static class Dog extends Animal {

        public Dog(String name) {
            super(name);
            this.kind = "Собака";
            this.maxJump = random.nextDouble();
            if (this.maxJump > 0.5) maxJump = 0.5;
            this.maxRun = random.nextInt(100)+400;
            this.maxSwim = random.nextInt(5)+5;
        }


    }


}

