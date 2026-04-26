package creationalDesignPatterns.Singleton;

class JudgeAnalytics{
    private int run;
    private int submit;

    public void countRun(){
        run++;
    }
    public void getCountRun(){
        run++;
    }
    public int getSubmitCount(){
        return submit;
    }   
}

public class Singleton {
    public static void main(String[] args) {

        JudgeAnalytics judgeAnalytics = new JudgeAnalytics();
        judgeAnalytics.countRun();
        judgeAnalytics.getSubmitCount();

        JudgeAnalytics judgeAnalytics2 = new JudgeAnalytics();
        // if someone else is using it, then new object created
        //this object will be diff
        






    }
}