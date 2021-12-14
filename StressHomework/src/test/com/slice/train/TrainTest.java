package test.com.slice.train;

import main.com.slice.train.models.Train;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class TrainTest {


    @Test
    void toStringTest(){
        Train cut = new Train("Kyiv", "123K", 7.30, 50);
        String  actual = cut.toString();
        String expected = "Train{destination='Kyiv', numberOfTrain='123K', time=7.3, countOfPlace=50}";
        Assertions.assertEquals(expected, actual);
    }

    static Arguments[] equalsTestArgs(){
        return new Arguments[]{
                Arguments.arguments(true, new Train("Kyiv", "123K", 7.30, 50), new Train("Kyiv", "123K", 7.30, 50)),
                Arguments.arguments(false, new Train("Kyiv", "123K", 7.30, 50), new Train("Kyiv", "123K", 7.30, 50)),
                Arguments.arguments(false, new Train("Kyiv", "923K", 7.30, 50), new Train("Kyiv", "123K", 7.30, 50)),
                Arguments.arguments(false, new Train("Kyiv", "123K", 8.30, 50), new Train("Kyiv", "123K", 7.30, 50)),
                Arguments.arguments(false, new Train("Kyiv", "123K", 7.30, 99), new Train("Kyiv", "123K", 7.30, 50))
        };
    }

    @ParameterizedTest
    @MethodSource("equalsTestArgs")
    void equalsTest(boolean expected, Train train1, Train train2){
        boolean actual = train1.equals(train2);
        Assertions.assertEquals(expected, actual);
    }

}
