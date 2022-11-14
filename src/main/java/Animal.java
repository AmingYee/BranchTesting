public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }
    public abstract void makeSound();
    public abstract boolean eat(String foodType);
    public abstract String showMood(boolean mood);
    public String Name() {
        return name;
    }
}
