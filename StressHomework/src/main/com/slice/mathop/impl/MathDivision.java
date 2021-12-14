package main.com.slice.mathop.impl;

import main.com.slice.mathop.MathFactory;

public class MathDivision implements MathFactory {

    @Override
    public double countTwoValue(double var1, double var2) {
        double result = (var1/var2)*1000_000;
        result = Math.round(result);
        result = result/1000_000;
        return result;
    }
}
