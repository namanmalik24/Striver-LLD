class liskovPrincipal {
   //A child class should be usable anywhere
   // its parent class is used, 
   // without causing errors or 
   // unexpected behavior.

    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        sparrow.move();  // Should work

        Bird penguin = new Penguin();
        penguin.move();  // Should work

        // If we had FlyingBird fb = new Penguin(); that would violate LSP
    }
}

abstract class Bird {
    public abstract void move();
}

abstract class FlyingBird extends Bird {
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void move() {
        fly();
    }
}

class Sparrow extends FlyingBird {
    // Inherits fly and move
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Swimming");
    }
}