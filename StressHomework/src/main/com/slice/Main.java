package main.com.slice;

import main.com.slice.mathop.MathFactory;
import main.com.slice.mathop.cache.MathFactoryCache;
import main.com.slice.mathop.impl.MathDivision;
import main.com.slice.mathop.impl.MathMinus;
import main.com.slice.mathop.impl.MathMultiply;
import main.com.slice.mathop.impl.MathPlus;
import main.com.slice.train.models.Train;
import main.com.slice.train.services.TrainComparator;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        Написать метод для сортировки Train по числу мест,
//        если число мест одинаково - тогда отсортировать и по пункту
//        назначения, если и число мест и пункт назначения одинаковы,
//                тогда если и пункт назначения одинаковый - время отправления.

        Train train1 = new Train("Kyiv", "1", 7.50, 50);
        Train train2 = new Train("Kharkiv", "2", 9.10, 40);
        Train train3 = new Train("Kyiv", "3", 7.30, 50);
        Train train4 = new Train("Aymaty", "4", 9.30, 40);//true
        Train train5 = new Train("Almaty", "5", 7.00, 50);
        Train train6 = new Train("Lviv", "6", 9.10, 20);
        Train train7 = new Train("Kyiv", "7", 7.90, 50);


        List<Train> trains = Arrays.asList(train1, train2, train3, train4, train5, train6, train7);

        TrainComparator comparator = new TrainComparator();

        trains.sort(comparator);

        for (Train t: trains) {
            System.out.println(t);
        }

        MathPlus mathPlus = new MathPlus();
        MathMinus mathMinus = new MathMinus();
        MathMultiply mathMultiply = new MathMultiply();
        MathDivision mathDivision = new MathDivision();

        MathFactory[] mathFactory = new MathFactory[]{mathPlus, mathMinus, mathMultiply, mathDivision};

        MathFactoryCache mathFactoryCache = new MathFactoryCache(mathFactory);

        double h = mathFactoryCache.getFactory("division", 10, 3);

        System.out.println(h);


    }
}
