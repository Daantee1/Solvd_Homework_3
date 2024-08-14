public class Rabbit extends Animal {

    public Rabbit(String name, int age, String color, String owner, String food) {
        super(name, age, color, owner, food);
    }

    @Override
    public void saySmthAbstract() {
        System.out.println("Hi hi hi");
    }
    @Override
    public void eatAbstract() {
        System.out.println(name + " is eating " + food + "...");
    }
}
