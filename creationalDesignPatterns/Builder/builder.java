import java.util.*;

package creationalDesignPatterns.Builder;

public class Builder {
    public static void main(String[] args) {
        
    }
    
}
//The Builder Pattern is that instruction manual 
// that lets you build the object piece by piece.



// The "Product" class
class BurgerMeal {
    // 1. All fields are private and final (Immutability)
    private final String bunType;
    private final String patty;
    private final boolean hasCheese;
    private final List<String> toppings;
    private final String side;
    private final String drink;

    // 2. Private constructor: Only the Builder can call this
    private BurgerMeal(BurgerBuilder builder) {
        this.bunType = builder.bunType;
        this.patty = builder.patty;
        this.hasCheese = builder.hasCheese;
        this.toppings = builder.toppings;
        this.side = builder.side;
        this.drink = builder.drink;
    }

    // 3. The Builder Class (Static Nested Class)
    public static class BurgerBuilder {
        // Same fields as the Product
        private final String bunType; // Mandatory
        private final String patty;   // Mandatory
        private boolean hasCheese = false; // Optional (Default)
        private List<String> toppings = new ArrayList<>(); // Optional
        private String side = "None"; // Optional
        private String drink = "None"; // Optional

        // 4. Constructor for REQUIRED fields
        public BurgerBuilder(String bunType, String patty) {
            this.bunType = bunType;
            this.patty = patty;
        }

        // 5. "Fluent" methods for OPTIONAL fields
        public BurgerBuilder withCheese(boolean hasCheese) {
            this.hasCheese = hasCheese;
            return this; // Returns the builder itself
        }

        public BurgerBuilder withToppings(List<String> toppings) {
            this.toppings = toppings;
            return this;
        }

        public BurgerBuilder withSide(String side) {
            this.side = side;
            return this;
        }

        public BurgerBuilder withDrink(String drink) {
            this.drink = drink;
            return this;
        }

        // 6. The final construction step
        public BurgerMeal build() {
            return new BurgerMeal(this);
        }
    }

    @Override
    public String toString() {
        return "Order: [Bun: " + bunType + ", Patty: " + patty + 
               ", Cheese: " + hasCheese + ", Toppings: " + toppings + 
               ", Side: " + side + ", Drink: " + drink + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Usage: Step-by-step construction
        BurgerMeal myOrder = new BurgerMeal.BurgerBuilder("Wheat", "Beef")
                                .withCheese(true)
                                .withSide("Fries")
                                .withDrink("Coke")
                                .build();

        System.out.println(myOrder);
    }
}