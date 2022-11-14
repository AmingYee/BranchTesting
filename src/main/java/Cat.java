public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }
    @Override
    public boolean eat(String foodType) {
        return true;
    }

    @Override
    public void showMood(boolean mood) {
        if(mood){
            System.out.println("spinder");
        } else if (!mood){
            System.out.println("hvæser");
        }
    }
}
