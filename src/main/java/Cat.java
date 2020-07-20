public class Cat {

    private String name;
    private int appetite;
    boolean fillCat;

    public Cat(String name, int appetite, boolean fillCat) {
        this.name = name;
        this.appetite = appetite;
        this.fillCat = false;
    }

    public void eat(Plate plate) {

        if (plate.getFood()>=appetite) {

            plate.decreaseFood(appetite);
            fillCat = true;
            System.out.println("Cat " + name + " eat " + appetite);
            System.out.println("Cat " + name + " fill full!");

        } else {

            System.out.println("Not enough food in plate!!! Cat " + name + " wanna eat " + appetite + " food!");
            System.out.println("Food on plate: " + plate.getFood());

        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getFillCat() {

        return fillCat;
    }
}
