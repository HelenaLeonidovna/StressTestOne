package test.com.slice.regexnumber;

import main.com.slice.regexhexnumber.RegexHexNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class RegexHexNumberTest {

    RegexHexNumber cut = new RegexHexNumber();

    static Arguments[] RegexHexNumberTestArgs(){
        return new Arguments[]{
                Arguments.arguments(true, "4F81"),
                Arguments.arguments(false, "467tm"),
                Arguments.arguments(true, "0000000000000"),
                Arguments.arguments(false, "FFFFY"),
                Arguments.arguments(true, "aB1")


        };
    }

    @ParameterizedTest
    @MethodSource("RegexHexNumberTestArgs")
    void RegexHexNumberTest(boolean expected, String hexNumber){
        boolean actual = cut.checkHexNumber(hexNumber);
        Assertions.assertEquals(expected, actual);
    }


}
