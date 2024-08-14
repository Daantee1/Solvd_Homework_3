public class Dog extends Animal {


    public Dog(String name, int age, String color, String owner, String food) {
        super(name, age, color, owner, food);
    }
    @Override
    public void saySmthAbstract() {
        System.out.println("Hau Hau");
    }
    @Override
    public void eatAbstract() {
        System.out.println(name + " is eating " + food + "...");
    }
}
