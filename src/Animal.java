import java.util.Objects;

public abstract class Animal {

    protected int age;
    protected String name;
    protected String color;
    protected String owner;
    protected String food;

    public Animal(String name, int age, String color, String owner, String food) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.owner = owner;
        this.food = food;
    }

    public abstract void saySmthAbstract();

    public abstract void eatAbstract();

    public void jump(){
        System.out.println(name + " is jumping");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(color, animal.color) && Objects.equals(owner, animal.owner) && Objects.equals(food, animal.food);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, color, owner, food);
    }

    @Override
    public String toString() {
        return "Animal:" +
                " age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                ", food='" + food + '\'' ;
    }
}
