package test.com.slice.phonenumber;

import main.com.slice.phonenumber.PhoneNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class PhoneNumberText {

    PhoneNumber cut = new PhoneNumber();

//    +(код страны)(пробел)(код оператора)(пробел)XXX-XX-XX.

    static Arguments[] isPhoneNumberTestArgs(){
        return new Arguments[]{
                Arguments.arguments("+380 97 601-70-71", true),
                Arguments.arguments("+1 212 555-34-56", true),
                Arguments.arguments("+1 212 555-d4-56", false),
                Arguments.arguments("+1 212 55-004-56", false),
                Arguments.arguments("+1 212 555-45-65", true),
                Arguments.arguments("+080 212 555-45-65", false)
        };
    }
    @ParameterizedTest
    @MethodSource("isPhoneNumberTestArgs")
    void generateRandomNumberTest(String str,boolean expected){
        boolean actual=cut.isPhoneNumber(str);
        Assertions.assertEquals(expected, actual);
    }
}
