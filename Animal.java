public class Animal {
    public int age;
    public String gender;

    public void isMammal() {
        System.out.println("\nThis is a public method isMammal() from class Animal");
    }

    public void mate() {
        System.out.println("This is a public method mate() from class Animal");
    }

    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Fish myFish = new Fish();
        Zebra myZebra = new Zebra();

        myAnimal.isMammal();
        myAnimal.mate();

        myZebra.run();
    }
}

class Fish extends Animal {
    private int sizeInFeet = 4;
    private void canEat() {
        System.out.println("This is a private method canEat() from class Fish");
    }
}

class Zebra extends Animal {
    public boolean is_wild;
    public void run() {
        System.out.println("This is a public method run() from class Zebra");
    }
}