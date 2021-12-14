package main.com.slice.mathop.impl;

import main.com.slice.mathop.MathFactory;

public class MathMultiply implements MathFactory {
    @Override
    public double countTwoValue(double var1, double var2) {
        return var1*var2;
    }
}
