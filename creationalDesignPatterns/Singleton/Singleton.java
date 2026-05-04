package creationalDesignPatterns.Singleton;

import java.lang.reflect.Method;

class JudgeAnalytics{
    private static final JudgeAnalytics judgeAnalytics = new JudgeAnalytics();

    private JudgeAnalytics() {
    }
    public static JudgeAnalytics getInstance(){
        return judgeAnalytics;
    }
       
}

public class Singleton {
    public static void main(String[] args) {

        JudgeAnalytics judgeAnalytics = JudgeAnalytics.getInstance();

     

// How do you force a class to be a Singleton?

// You need three bouncers at the door:

// A Private Constructor: This hides the "creation button" (new keyword). Nobody outside the class is allowed to create an object from it.

// A Static Variable: This is a special display case inside the class where the single, unique object is kept.

// A Public Static Method (usually called getInstance()): This is the window where people can ask for the object. Every time someone asks, this method hands them the exact same object from the display case.

// Method A: Eager Loading (Build it immediately)
// Method B: Lazy Loading (Build it only when asked)



    }
}


class EagerSingleton {
    // 1. Create the object IMMEDIATELY
    private static final EagerSingleton instance = new EagerSingleton();

    // 2. Lock the door
    private EagerSingleton() {
    }

    // 3. Hand it out
    public static EagerSingleton getInstance() {
        return instance; 
    }
}
//1. Eager Loading (The "Fire Extinguisher" Approach)

class LazySingleton {
    // 1. Start with an empty box
    private static LazySingleton instance;

    // 2. Lock the door
    private LazySingleton() {
    }

    // 3. Build it ONLY if asked
    public static LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton(); // Build it!
        }
        return instance;
    }
}
//2. Lazy Loading (The "Coffee Machine" Approach)

public class Singleton {
    private Singleton() {}

    // A hidden inner class
    private static class Holder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return Holder.INSTANCE;
    }
}
//3. The Best Practice: Bill Pugh Singleton