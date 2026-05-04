package creationalDesignPatterns.factory;

public class factory {
    
}

// The Factory Manager
class LogisticsFactory {
    public static Logistics getLogistics(String mode) {
        if (mode.equalsIgnoreCase("Air")) return new Air();
        if (mode.equalsIgnoreCase("Road")) return new Road();
        // ...
    }
}

// Inside LogisticsService (The Client)
public void send(String mode) {
    // You just ask the factory! No "new" keyword here.
    Logistics logistics = LogisticsFactory.getLogistics(mode);
    logistics.send();
}