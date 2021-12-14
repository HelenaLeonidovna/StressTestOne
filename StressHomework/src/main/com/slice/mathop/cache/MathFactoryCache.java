package main.com.slice.mathop.cache;

import main.com.slice.mathop.MathFactory;

public class MathFactoryCache {

    private MathFactory[] mathFactories;


    public MathFactoryCache(MathFactory[] mathFactories) {
        this.mathFactories = mathFactories;
    }

    public double getFactory(String operation, double var1, double var2){

        switch (operation)
        {
            case "+":
                return mathFactories[0].countTwoValue(var1, var2);
            case "-":
                return mathFactories[1].countTwoValue(var1, var2);
            case "*":
                return mathFactories[2].countTwoValue(var1, var2);
            case "/":
                return mathFactories[3].countTwoValue(var1, var2);
            default:
                System.out.println("Invalid command");
                return 0;

        }
    }
}
