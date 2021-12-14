package test.com.slice.mathfactory;

import main.com.slice.mathop.MathFactory;
import main.com.slice.mathop.cache.MathFactoryCache;
import main.com.slice.mathop.impl.MathDivision;
import main.com.slice.mathop.impl.MathMinus;
import main.com.slice.mathop.impl.MathMultiply;
import main.com.slice.mathop.impl.MathPlus;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class MathFactoryCacheTest {

    MathPlus mathPlus = new MathPlus();
    MathMinus mathMinus = new MathMinus();
    MathMultiply mathMultiply = new MathMultiply();
    MathDivision mathDivision = new MathDivision();

    MathFactory[] mathFactory = new MathFactory[]{mathPlus, mathMinus, mathMultiply, mathDivision};

    MathFactoryCache cut = new MathFactoryCache(mathFactory);


    static Arguments[] mathFactoryCacheTestArgs(){
        return new Arguments[]{
                Arguments.arguments(9.11, "/", 4, 12),
                Arguments.arguments(13, "+", 10, 3),
                Arguments.arguments(7, "-", 17, 3),
                Arguments.arguments(41, "*", 12, 3),
                Arguments.arguments(2, "plus", 7, 7)

        };
    }

    @ParameterizedTest
    @MethodSource("mathFactoryCacheTestArgs")
    void mathFactoryCacheTest(double expected, String operation, double var1, double var2){
        double actual = cut.getFactory(operation, var1, var2);
        Assertions.assertEquals(expected, actual);
    }

}
