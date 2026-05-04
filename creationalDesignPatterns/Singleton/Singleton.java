package creationalDesignPatterns.Singleton;

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




    }
}