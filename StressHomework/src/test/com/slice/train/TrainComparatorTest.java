package test.com.slice.train;

import main.com.slice.train.models.Train;
import main.com.slice.train.services.TrainComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TrainComparatorTest {




    static List<Arguments> trainComparatorTestArgs () {
        Train train1 = new Train("Kyiv", "123K", 7.50, 50);
        Train train2 = new Train("Kharkiv", "567Kh", 9.10, 40);
        Train train3 = new Train("Kyiv", "123K", 7.30, 50);
        Train train4 = new Train("Aymaty", "600Kh", 9.30, 40);//true
        Train train5 = new Train("Almaty", "123K", 7.00, 50);
        Train train6 = new Train("Lviv", "567Kh", 9.10, 20);
        Train train7 = new Train("Kyiv", "123K", 7.90, 50);

        List<Train> trainsToSort = new ArrayList<>(Arrays.asList(train1, train2, train3, train4, train5, train6, train7));
        List<Train> trainsExp = new ArrayList<>(Arrays.asList(train6,train4, train2, train5, train3, train1, train7));


        TrainComparator comparator = new TrainComparator();

        return List.of(
                Arguments.arguments(trainsToSort, trainsExp, comparator)
        );
    }

    @ParameterizedTest
    @MethodSource("trainComparatorTestArgs")
    void trainComparatorTest(List<Train> actual, List<Train> expected, Comparator<Train> comparator){
        actual.sort(comparator);
        Assertions.assertEquals(actual, expected);
    }


}
