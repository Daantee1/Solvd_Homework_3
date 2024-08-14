public class Snake extends Animal {

    public Snake(String name, int age, String color, String owner, String food) {
        super(name, age, color, owner, food);
    }

    @Override
    public void saySmthAbstract() {
        System.out.println("Sssss");
    }
    @Override
    public void eatAbstract(){
        System.out.println(name + " is eating " + food + "...");
    }

    @Override
    public String toString() {
        return "The snake Vet{" +
                " age=" + age +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", owner='" + owner + '\'' +
                ", food='" + food + '\'' ;
    }

    public void jump(){
        System.out.println("Snake " +name + " can't jump");
    }
}
