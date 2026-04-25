// Note: Package name fixed to be valid (no spaces/hyphens allowed in Java packages)
// If you want to keep the folder name, rename the folder to "LiskovSubstitutionPrincipal" and update package accordingly


public class code {
    public static void main(String[] args) {
        // Example demonstrating Liskov Substitution Principle

        // A Sparrow can be used wherever a FlyingBird is expected
        FlyingBird sparrow = new Sparrow();
        sparrow.fly();
        //lol branch

        // But both can be used as Bird
        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin();
        bird1.move(); // Flies
        bird2.move(); // Swims
    }
}

abstract class Bird {
    public abstract void move();
}

abstract class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying high!");
    }

    @Override
    public void move() {
        fly();
    }
}

class Sparrow extends FlyingBird {
    // Inherits fly() and move()
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Swimming in the ocean!");
    }
}
