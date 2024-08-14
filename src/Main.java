public class Main {
    public static void main(String[] args) {

        Animal cat = new Cat("Bob", 5, "white", "Mario", "fish" );
        cat.saySmthAbstract();
        cat.eatAbstract();

        Animal dog = new Dog("Max", 8, "black", "Mario", "meat" );
        dog.saySmthAbstract();
        dog.eatAbstract();

        Animal snake = new Snake("Coco", 3, "yellow", "Kacper", "rat");
        snake.saySmthAbstract();
        snake.eatAbstract();

        Animal rabbit = new Rabbit("Claus", 3, "white", "Johnny", "hay");
        rabbit.saySmthAbstract();
        rabbit.eatAbstract();

        //Check the owner is the same by equals() method
        System.out.println(cat.owner.equals(dog.owner));

        //Check the owner is the same
        System.out.println(cat.owner.equals(snake.owner));

        //Check color is the same
        System.out.println(rabbit.color.equals(cat.color));

        //Print cat obj
        System.out.println(cat);
        //Print dog obj
        System.out.println(dog);
        //Print snake obj
        System.out.println(snake);

        // Check the owner is the same by hashCode method
        System.out.println(cat.owner.hashCode());
        System.out.println(dog.owner.hashCode());

        rabbit.jump();
        snake.jump();

    }


}