public class Cat extends Animal {

    public Cat(String name, int age, String color, String owner, String food) {
        super(name, age, color, owner, food);
    }

    @Override
    public void saySmthAbstract() {
        System.out.println("Miau Miau");
    }
    @Override
    public void eatAbstract(){
        System.out.println(name + " is eating " + food + "...");
    }

    @Override
    public String toString() {
        return "The cat Vet{" +
                " age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                ", food='" + food + '\'' ;
    }
}
