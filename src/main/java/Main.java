public class Main {
    public static void main(String[]args) {
        Dog dog = new Dog("");
        Cat cat = new Cat("");

        dog.makeSound();
        cat.makeSound();

        dog.eat("Dogfood");
        cat.eat("fishes");

        System.out.println("dog true");
        dog.showMood(true);
        System.out.println("dog false");
        dog.showMood(false);

        System.out.println("cat true");
        cat.showMood(true);
        System.out.println("cat false");
        cat.showMood(false);
    }
}
