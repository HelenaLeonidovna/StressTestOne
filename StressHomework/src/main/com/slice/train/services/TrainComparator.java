package main.com.slice.train.services;

import main.com.slice.train.models.Train;

import java.util.Comparator;

public class TrainComparator implements Comparator<Train> {


    @Override
    public int compare(Train o1, Train o2) {

        int result = o1.getCountOfPlace()-o2.getCountOfPlace();

        if(result == 0){
            result = o1.getDestination().compareTo(o2.getDestination());
            if(result==0){

                result = (int) ((o1.getTime()-o2.getTime())*100);
            }
        }

        return result;
    }
}
